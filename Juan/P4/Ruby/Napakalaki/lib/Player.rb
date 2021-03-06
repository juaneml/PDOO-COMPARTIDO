#encoding: utf-8

#Versión 3.0
require_relative 'Treasure.rb'
require_relative 'Monster.rb'
require_relative 'TreasureKind.rb'
require_relative 'CombatResult.rb'
require_relative 'Dice.rb'
require_relative 'BadConsequence.rb'
module NapakalakiGame
    
class Player   
    @@MAXLEVEL = 10
    #constructor
    
    def initialize(name)
        @name = name
        @level = 1
        @dead = true
        @canISteal = false
        @enemy = self

        @pendingBadConsequence = []

        @hiddenTreasures = Array.new
        @visibleTreasures = Array.new
        
        
    
    end
    
#    private_class_method :new
#    
#    def self.oldPlayer(name)
#        new(name)
#    end
#    
#    def self.newPlayer(p)
#        
#    end
#    
#    attr_accesor :name
#    attr_accesor :visibleTreasures
#    attr_accesor :hiddenTreasures
#    attr_accesor :level
    
    ## Métodos get
    protected
    
    attr_reader :visibleTreasures
    attr_reader :hiddenTreasures
    attr_reader :level
    attr_reader :enemy
    public
    attr_reader :name
   
    private
    def bringToLife
         @dead = false
    end
    
    
    def getCombatLevel
         sum_bonus = 0
         i = 0


         puts @visibleTreasures.size

         @visibleTreasures.each do |v|
             sum_bonus = v.bonus + sum_bonus
         end
         
        nivel = @level+sum_bonus
       
    end
    
    
    
    
    def incrementLevels(l)
        @level= @level+1
    end
     
    def decrementLevels(l)
       if @level > 1
            @level = @level -l;
       end
    end
    
     
    def setPendingBadConsequence(b)
        @pendigBadConsequence = b
    end
    
         
    def applyPrize(m)
        nLevels = m.getLevelsGained
        incrementLevels(nLevels)   
        nTreasures = m.getTreasureGained
            
        
         dealer = CardDealer.instance
        if nTreasures > 0
            dealer = CardDealer.instance
            puts 'nTreasures'
            puts nTreasures
            (1..nTreasures).each do |i| 

                treasure = dealer.nextTreasure
                @hiddenTreasures << treasure
                
            end
        end
    end
    

    
    def applyBadConsequence(m)
        badConsequence = m.badconsequence
        nLevels = badConsequence.levels
        decrementLevels(nLevels)        

        pendingBad = badConsequence.adjustToFitTreasureList(@visibleTreasures,@hiddenTreasures)

        setPendingBadConsequence(pendingBad)
    end
    
     
    def canMakeTreasureVisible(t)

          puede=false
          
        puts 'entra equipar'
        puts t
        puts t.type
        if(t.type == TreasureKind::ONEHAND )
             numero=0
             numerob=0


            @visibleTreasures.each do |taux|             


                if taux.type == TreasureKind::ONEHAND
                    numero= numero+1
                end
            
                if taux.type ==TreasureKind::BOTHHANDS

                    numerob = numerob+1
                end
            end
            if numero<2 && numerob == 0
                puede=true                
            end
        end
        if t.type== TreasureKind::BOTHHANDS
             numero=0
             numerob=0

           @visibleTreasures.each do |taux|

                if taux.type == TreasureKind::ONEHAND
                    numero = numero+1
                end
           
                if taux.type == TreasureKind::BOTHHANDS
                    numerob = numerob+1
                end


            end
            if(numero==0 && numerob == 0)
                puede=true                


            end
        end

        if t.type== TreasureKind::ARMOR
            numero=0
            @visibleTreasures.each do |taux|
           
                if taux.type == TreasureKind::ARMOR

                    numero =numero+1
                end
            end
        
            if(numero==0)
                puede=true                
            end
        end

        puts t.type
        if t.type== TreasureKind::HELMET
            puts 'Entra helmet'
            numero=0

            @visibleTreasures.each do |taux|            
                if taux.type == TreasureKind::HELMET
                    numero= numero+1
                end
            end
            if(numero==0)
                puede=true;                
            end
        end

        if t.type== TreasureKind::SHOES 
             numero=0;

            @visibleTreasures.each do |i|           
                if i.type == TreasureKind::SHOES
                    numero = numero+1
                end
            end
            if numero==0
                puede=true                
        end
        
        end

        return puede

    end
    
    def howManyVisibleTreasures(tkind)
        num = 0
        
#        for  t in 0..@visibleTreasures.size-1
            @visibleTreasures.each do |t|
            if t.type == tkind
                num = num +1
            end
        end    
        num
    end
     
    def dieIfNoTreasures()
        if @visibleTreasures.empty? && @hiddenTreasures.empty?
            puts "muere"
            @dead = true
            
        else
            puts "no muere"
            @dead = false
        end
        
        return @dead
    end
    
    #final método privados
    
    public
    def isDead()
       return @dead
    end
    
    def getHiddenTreasures()
        return @hiddenTreasures
    end
    
    def getVisibleTreasures()
        return @visibleTreasures
    end
        
    def combat(m)
        myLevel = getCombatLevel()
        @dealer = CardDealer  #mirar
        @currentMonster = m #mirar
        monsterLevel = getOponentLevel(@currentMonster)
        
        if myLevel > monsterLevel
            applyPrize(m)
            
            if(@level >= @@MAXLEVEL)
                combatResult = CombatResult::WINGAME
            else    
                combatResult = CombatResult::WIN
            end
        else
            if(shouldConvert() == true)
                combatResult = CombatResult::LOSEANDCONVERT
            else
                applyBadConsequence(m)
                combatResult = CombatResult::LOSE
            end
        end
        
        return combatResult
    end
    

    
    def makeTreasureVisible(t)

        canI = canMakeTreasureVisible(t)
        

        if canI            
            @visibleTreasures << t
            @hiddenTreasures.delete(t) 
        end
        
        return canI
    end

    
    def discardVisibleTreasures(t)
        @visibleTreasures.delete(t)
        
        if( (@pendingBadConsequence != nil) && (!@pendingBadConsequence.empty?))
                @pendingBadConsequence.substractVisibleTreasure(t)
        end
        
        return dieIfNoTreasures
    end
    
    def discardHiddenTreasures(t)
        @hiddenTreasures.delete(t)
        
        if( (@pendingBadConsequence != nil) && (!@pendingBadConsequence.empty?))
                @pendingBadConsequence.substractHiddenTreasure(t)
        end
        
        return dieIfNoTreasures
    end
    
    def validState()          
        valid =false
        puts "@pendingBadConsequence"
        puts @pendigBadConsequence
            if @pendingBadConsequence.empty? && @hiddenTreasures.size <= 4
                valid = true
            else
                valid = false      
            end
        
        
        return valid 
    end
    
 
    def initTreasures()
       
        dealer = CardDealer.instance
        dice = Dice.instance 
        
        bringToLife
        treasure = dealer.nextTreasure
        @hiddenTreasures << treasure
        number = dice.nextNumber
              
        
        if number > 1 
            
                treasure = dealer.nextTreasure
                @hiddenTreasures << treasure
              
        end
        
        if number == 6
            
                treasure = dealer.nextTreasure
                @hiddenTreasures << treasure
          
        end
        
    end
    
    def getLevels()
       return @level
    end

 
    
    def stealTreasure()
        
        treasure = nil
        canI = self.canISteal
        @canISteal = canI
        
        if(canI)
            canYou = @enemy.canYouGiveMeAtreasure
            
            if canYou
                treasure = @enemy.giveMeAtreasure
                @hiddenTreasures << treasure
                haveStolen
            end
            
        end
        return treasure
    end
    
    def setEnemy(enemy)
        @enemy = enemy
        return @enemy
    end
    
   
    private
    
    def giveMeAtreasure()
        
        numero = rand(@hiddenTreasures.size)
        tesoro= @hiddenTreasures[numero]
        
        return tesoro        
    end
    
    public
    def canISteal()
        @canISteal = false
        return @canISteal
    end
    
    private
    
    def canYouGiveMeAtreasures()
        puedes = false
        
        if @hiddenTreasures.empty?
            puedes = true
        
          end
          return puedes 
          
    end
    
    def haveStolen()
        
        if @hiddenTreasures.empty?
            @canISteal = false
        else
            @canISteal = true
        end
        return @canISteal
    end
    

    public
    def discardAllTreasures()

        vaux= Array.new(@visibleTreasures)
        vaux.each do |v|
                discardVisibleTreasures(v)
        end
        haux=Array.new(@hiddenTreasures)
        haux.each do |h|
            puts 'Entro hidden'
            puts @hiddenTreasures.size
                discardHiddenTreasures(h)

        end
        
    end
    
    protected
    def getOponentLevel(m)
        m.combatLevel
    end
    
    def shouldConvert()
        dice = Dice.instance
        number = dice.nextNumber
        
        if(number ==1)
            return true
        else
            return false
        end
    end
    
  
    public
    def to_s 
        "Nombre = #{@name} , Levels =#{@level} "     
    end
end

end
