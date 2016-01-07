include Singleton

class Napakalaki
    
    @@instance = null
#    Constructor

    def initialize(currentPlayer,players,dealer,currentMonster,unusedMonsters)
        @currentPlayer = currentPlayer
        @players = players
        @dealer = dealer
        @currentMonster = currentMonster
        @unusedMonsters = unusedMonsters
    end
    
    ## getCurrentPlayer
    ## getCurrentMonster
    attr_reader :currentPlayer
    attr_reader :currentMonster
    
    private
    def initPlayers(names)
        
    end
    
    private 
    def nextPlayer()
        
    end
    
    private
    def nextTurnAllowed()
        
    end
    
    private
    def setEnemies()
        
    end
    
    private 
    def self.getInstance()
        @@instance = Napakalaki.instance
    end
    
    def devlopCaombat()
        
    end
    
    def discardVisibleTreasures (treasures)
        
    end
    
    def discarHiddenTreasures(treasures)
        
    end
    
    def makeTreasuresVisible(treasures)
        
    end
    
    def initGame(players)
        
    end
    
    
    def nextTurn()
        
    end
    
    def endOfGame (result)
        
    end
    
end
