#encoding: utf-8

#Versión 3.0
class Player   
    @@MAXLEVEL = 10
    #constructor
    
    def initialize(name)
        @name = name
        @level = 1
        @dead = false
        @canISteal = false
        @enemy = self
        @pendigBadConsequence = BadConsequence.new
        @hiddenTreasures = Array.new
        @visibleTreasures = Array.new
    
    end
    
    ## Métodos get
    attr_reader :name
    attr_reader :visibleTreasures
    atrr_reader :hiddenTreasures
    atrr_reader :level
    
   
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
        nTreasures = m.getTreasureGained()
        incrementLevels(nLevels)       
        
        if nTreasures > 0
            dealer = CarDealer.instance
            
            (1..nTreasures).each do |i| 
                treasure = dealer.nextTreasure
                @hiddenTreasures << treasure
                
            end
        end
    end
    

    
    def applyBadConsequence(m)
        badConsequence = getBadConsequence
        nLevels = badConsequence.getLevels
        decrementLevels(nLevels)        
        pendingBad = badConsequence.adjustToFitTreasureList(@hiddenTreasures,@hiddenTreasures)
        setPendingBadConsequence(pendingBad)
    end
    
     
    def canMakeTreasureVisible(t)
        
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
        
    end
    
    #final método privados
    
    public
    def idDead()
        @dead
    end
    
    def getHiddenTreasures()
        #Falta acabar
    end
    
    def getVisibleTreasuures()
        #Falta acabar
    end
        
    def combat(m)
        myLevel = self.getCombatLevel()
        @dealer = CardDealer  #mirar
        @currentMonster = m #mirar
        monsterLevel = @currentMonster.combatLevel
        
        if(myLevel > monsterLevel)
            self.applyPrize(m)
            
            if(@levels >= @@MAXLEVEL)
                combatResult = CombatResult.WINGAME
            else    
                combatResult = CombatResult.WIN
            end
        else
            self.applyBadConsequence(m)
            combatResult = CombatResult.LOSE
        end
        
        return combatResult
    end
    
    def makeTreasuresVisible(t)
        
    end
    

    
    def discardVisibleTreasure(t)
        @visibleTreasures.delete(t)
        
        if( (@pendingBadConsequence != nil) && (!@pendingBadConsequence.empty?))
                @pendingBadConsequence.substractVisibleTreasure(t)
        end
        
        return self.dieIfNoTreasures
    end
    
    def discarHiddenTreasure(t)
        @hiddenTreasures.delete(t)
        
        if( (@pendingBadConsequence != nil) && (!@pendingBadConsequence.empty?))
                @pendingBadConsequence.substractVisibleTreasure(t)
        end
        
        return self.dieIfNoTreasures
    end
    
    def validState()          
        valid        
        if @pendingBadConsequence.empty? && @hiddenTreasures.size <= 4
            valid = true
        
        else
            valid = false      
        end
        
        valid 
    end
    
 
    def initTreasures()
       
        dealer = CardDealer.instance
        dice = Dice.instance
        bringToLife
        treasure = dealer.nextTreasure
        @hiddenTreasures << treasure
        number = dice.nextNumber
        
        if number == 1
            treasure = dealer.nextTreasure
            @hiddenTreasures << treasure
        end
        
        if number > 1 && number < 6
            (0..2).each do |i| 
                treasure = dealer.nextTreasure
                @hiddenTreasures << treasure
                
            end
        end
        
        if number == 6
            (0..3).each do |i|
                treasure = dealer.nextTreasure
                @hiddenTreasures << treasure
            end
        end
        
    end
    
    def getLevels()
        @level
    end

 
    
    def stealTreasure()
        
        treasure = null
        canI = canISteal
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
    end
    
   
    private
    
    def giveMeAtreasures()
        
        numero = rand(@hiddenTreasures.size)
        tesoro= @hiddenTreasures[numero]
        
        return tesoro        
    end
    
    public
    def canISteal()
        @canISteal = false
    end
    
    private
    
    def canYouGiveMeAtreasures()
        puedes = false
        
        if @hiddenTreasures.empty?
            puedes = true
        
          end
          puedes #no se necesita return
    end
    
    def haveStolen()
        
        if @hiddenTreasures.empty?
            @canISteal = false
        else
            @canISteal = true
        end
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
