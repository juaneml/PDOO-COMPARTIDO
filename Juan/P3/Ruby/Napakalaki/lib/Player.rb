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
        @dead = false
        @canISteal = false
        @enemy = self

        @pendigBadConsequence = nil

        @hiddenTreasures = Array.new
        @visibleTreasures = Array.new
        
        
    
    end
#    
#    attr_accesor :name
#    attr_accesor :visibleTreasures
#    attr_accesor :hiddenTreasures
#    attr_accesor :level
    
    ## Métodos get
    attr_reader :name
    attr_reader :visibleTreasures
    attr_reader :hiddenTreasures
    attr_reader :level
    
   
    private
    def bringToLife
         @dead = false
    end
    
    
    def getCombatLevel
         sum_bonus = 0
         i = 0
         while i < @visibleTreasures.size
             i = i+1
             sum_bonus = @visibleTreasures.fetch(i).bonus + sum_bonus
         end
         
        @level = @level+sum_bonus
       
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
        nLevels = m.getLevelsGained()
        incrementLevels(nLevels)   
        nTreasures = m.getTreasureGained()
            
        
        if nTreasures > 0
            dealer = CarDealer.instance
            
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
        pendingBad = badConsequence.adjustToFitTreasureList(@hiddenTreasures,@hiddenTreasures)
        setPendingBadConsequence(pendingBad)
    end
    
     
    def canMakeTreasureVisible(t)
          puede=false;
        
        if(t.type == TreasureKind::ONEHAND )
            int numero=0;
            int numerob=0;
            (1..@visibleTreasures).each do |i|             
                if @visibleTreasures.type == TreasureKind::ONEHAND
                    numero= numero+1
                end
            end
                if taux.type == TreasureKind::BOTHHANDS
                    numerob = numerob+1
            end
            if numero<2 && numerob == 0
                puede=true                
            end
        
        if t.type == TreasureKind::BOTHHANDS
             numero=0
             numerob=0
           (1..@visibleTreasures).echo do |i|
                if@visibleTreasures.type == TreasureKind::ONEHAND
                    numero = numero+1;
                end
           end
                if taux.type  == TreasureKind::BOTHHANDS
                    numerob = numerob+1
            end
            if(numero==0 && numerob == 0)
                puede=true                
            end
        
        if t.type== TreasureKind.ARMOR
            numero=0
            (1..@visibleTreasures).echo do |i|
           
                if @vivibleTreasures.getType() == TreasureKind::ARMOR
                    numero =numero+1
                end
            end
        end
            if(numero==0)
                puede=true;                
        end
        
        if t.type == TreasureKind::HELMET
            int numero=0;
            (1..@visibleTreasures).echo do |i|            
                if @vivisbleTreasuers.type == TreasureKind::HELMET
                    numero= numero+1
                end
            end
            if(numero==0)
                puede=true;                
        end
        end
        if t.getType()== TreasureKind::SHOES
            int numero=0;
            (1..@visibleTreasuers).echo do |i|           
                if @visibleTreasures.type == [TreasureKind::SHOES]
                    numero = numero+1;
                end
            end
            if numero==0
                puede=true                
        end
        
        end
        return puede
        
    end
    end
    
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
        if @visibleTreasures.empty? &&@hiddenTreasures.empty?
            @dead = true
            
        else
            @dead = false
        end
        
        return @dead
    end
    
    #final método privados
    
    public
    def idDead()
       return @dead
    end
    
    def getHiddenTreasures()
        return @hiddenTreasures
    end
    
    def getVisibleTreasuures()
        return @visibleTreasures
    end
        
    def combat(m)
        myLevel = getCombatLevel()
        @dealer = CardDealer  #mirar
        @currentMonster = m #mirar
        monsterLevel = @currentMonster.combatLevel
        
        if(myLevel > monsterLevel)
            self.applyPrize(m)
            
            if(@levels >= @@MAXLEVEL)
                combatResult = CombatResult::WINGAME
            else    
                combatResult = CombatResult::WIN
            end
        else
            applyBadConsequence(m)
            combatResult = CombatResult::LOSE
        end
        
        return combatResult
    end
    

    
    def makeTreasuresVisible(t)
        canI = self.canMakeTreasureVisible(t)
        
        if canI
            @visibleTreasures << t
            @hiddenTreasures.delete(t) 
        end
        
        return canI
    end
    

    
    def discardVisibleTreasure(t)
        @visibleTreasures.delete(t)
        
        if( (@pendingBadConsequence != nil) && (!@pendingBadConsequence.empty?))
                @pendingBadConsequence.substractVisibleTreasure(t)
        end
        
        return dieIfNoTreasures
    end
    
    def discarHiddenTreasure(t)
        @hiddenTreasures.delete(t)
        
        if( (@pendingBadConsequence != nil) && (!@pendingBadConsequence.empty?))
                @pendingBadConsequence.substractVisibleTreasure(t)
        end
        
        return dieIfNoTreasures
    end
    
    def validState()          
        valid        
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
    def discarAllTreasures()
              
        (1..@visibleTreasures).each do|i|
                discardVisibleTreasure(i)
        end

        (1..@hiddenTreasures).each do |i|
                discardHiddenTreasure(i)
        end
        
    end
end
public
def to_s 
        "Nombre = #{@name} , Levels =#{@level} "     
    end
end
