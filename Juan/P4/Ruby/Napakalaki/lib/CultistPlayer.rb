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
        super(p)
        incTotal
        @ic = c
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
        
    end
    
    def canYouGiveMeATreasure
        
    end
    
    public
    def getTotalCultistPlayers
        
    end
     
    
end
end