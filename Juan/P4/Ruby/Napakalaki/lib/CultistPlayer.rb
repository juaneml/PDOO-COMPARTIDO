# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
require_relative 'Treasure.rb'
require_relative 'Monster.rb'
require_relative 'TreasureKind.rb'
require_relative 'CombatResult.rb'
require_relative 'Dice.rb'
require_relative 'BadConsequence.rb'
require_relative 'Player.rb'



module NapakalakiGame
class CultistPlayer < Player   
     
    @@totalCultistPlayers = 0
    @myCultistCard = Cultist.new('nada',0)
    
    def initialize(p,c)
        @name = p.name
        @level = p.level
        @dead = p.dead
        @canISteal = p.canISteal
        @enemy = p.enemy

        @pendingBadConsequence = p.pendingBadConsequence

        @hiddenTreasures = p.hiddenTreasures
        @visibleTreasures = p.visibleTreasures
        @myCultistCard = c
        
        incTotal
    end 
    
    def self.incTotal
        @@totalCultistPlayers = @@totalCultistPlayers + 1
    end
    
    protected
    def getCombatLevel
        
        number = super.getCombatLevel *0.2
        
        
        return super.getCombatLevel +number + @ic
    end
    
    def getOponentLevel(m)
        m.getCombatLevelAgainstCultistPlayer
    end
    
    def shouldConvert
        return false
    end
    
    
    private
    def giveMeATreasure
        number = rand(@visibleTreasures.size-1)
        
        return @visibleTreasures[number]
    end
    
    protected
    def canYouGiveMeATreasure
        if (!enemy.getVisibleTreasures.empty?)
            return true
        else
            return false
        end
    end
    
    public
    def getTotalCultistPlayers
        
    end
     
    
end
end