
class Player   
    
    #constructor
    def initialize(name,pending,hiddenTreasures,visibleTreasures)
        @name = name
        @level = 1
        @dead = true
        @canISteal = true
        @enemy = self
        @pendigBadConsequence = pending
        @hiddenTreasures = hiddenTreasures
        @visibleTreasures = visibleTreasures
    
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
         i =0
         while i < @visibleTreasures.size
             i = i+1
             sum_bonus =@visibleTreasures.fetch(i).getBonus+sum_bonus
         end
         
        @level = level+sum_bonus
       
    end
    
    
    def incrementLevels(l)
        @level= @level+1
    end
     
    def decrementLevels(l)
       if @level >= 1
            @level = @level -l;
       end
    end
    
     
    def setPendingBadConsequence(b)
        @pendigBadConsequence = b
    end
    
    
    def applyPrize(m)
        
    end
    
    
    def applyBadConsequence(m)
        
    end
    
     
    def canMakeTreasureVisible(t)
        
    end
    
    
    def howManyVisibleTreasures(tkind)
        num = 0
        
        for  t in 0..@visibleTreasures.size-1
            if t.getType == tKind
                num = num +1
            end
        end    
        num
    end
     
    def dieIfNoTreasures()
        if @visibleTreasures.isEmpty &&@hiddenTreasures.isEmpty
            @dead = true
        end
    end
    
    #final método privados
    
    public
    def idDead()
        @dead
    end
    
    def getHiddenTreasures()
        
    end
    
    def getVisibleTreasuures()
        
    end
    
    def combat(m)
        
    end
    
    def makeTreasuresVisible(t)
        
    end
    
    def discardVisibleTreasure(t)
        
    end
    
    def discarHiddenTreasure(t)
        
    end
    
    def validState()          
        valid        
        if @pendingBadConsequence.isEmpty && this.hiddenTreasures.size < 4
            valid = true;
        
                    
        else
            valid = false;       
        end
        
        valid 
    end
    
    def initTreasures()
        
    end
    
    def getLevels()
        @level
    end
    
    def stealTreasure()
        
    end
    
    def setEnemy(enemy)
        @enemy = enemy
    end
    
    private
    
    def giveMeAtreasures()
        
    end
    
    public
    def canISteal()
        @canISteal = false
    end
    
    private
    
    def canYouGiveMeAtreasures()
        puedes = false
          if @hiddenTreasures.isEmpty
            puedes = true
        
          end
          puedes #no se necesita return
    end
    
    def haveStolen()
        @canISteal
    end
    
    public
    def discarAllTreasures()
        
    end
end
