#encoding: utf-8

#Versión 3.0
require 'singleton'
include Singleton
class Napakalaki 
   
   
    #@@instance = nil
#    Constructor

#    def initialize(currentPlayer,players,dealer,currentMonster,unusedMonsters)
#        @currentPlayer = currentPlayer
#        @players = players
#        @dealer = dealer
#        @currentMonster = currentMonster
#        @unusedMonsters = unusedMonsters
#    end

    def initialize()
        @currentPlayer
        @players
        @dealer
        @currentMonster       
    end
    
    #attr_accesor :currentPlayer, :player, :dealer, :currentMonster
    
    ## getCurrentPlayer
    ## getCurrentMonster
    attr_reader :currentPlayer
    attr_reader :currentMonster
    
    #private_class_method :new
    
#    Inicializa el array de jugadores que contiene Napakalaki, creando tantos jugadores como
#    elementos haya en names, que es el array de String que contiene el nombre de los
#    jugadores.
   
    def initPlayers(names)
          for(String n : names)
              
           this.players.add(new Player(n));
          end
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
    
#    private 
#    def self.getInstance()
#        @@instance = Napakalaki.instance
#    end
#   
    public
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
        
       final = false
       if (result.eql?([CombatResult::WINGAME]))
            final = true
            
       end
            return final
        
        

    end
    
end
