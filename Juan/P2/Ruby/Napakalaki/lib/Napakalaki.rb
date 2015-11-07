# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
require_relative 'CombatResult.rb'
require_relative 'Player.rb'
require_relative  'CardDealer.rb'
require_relative  'Monster.rb'

class Napakalaki
    # como crear el instance
    
    
    /*Constructor/
    def  initialize(jugadores, jugadorActual,repartidor,monster)
        @players = jugadores
        @currentPlayer = jugadorActual
        @dealer = repartidor
        @currentMonster = monster
    end 
    
    attr_accessor :players, :currentPlayer, :dealer, :currentMonster
    
    /*inicializar jugadores/
    def initPlayers(names)
        
    end
    
    /*Siguiente jugador/
    def nextPlayer()
        
    end
    
    /*siguiente turno/
    def nextTurnAllowed()
        
    end
    
    /*introducir enemigos/
    def setEnemies()
        
    end
    
    /*Devuelve instalncia /
    def self.getInstance()
        
    end
    
    public
    def developCombat()
        
    end
    
    /*Descarta tesoro visible/
    def discardVisibleTreasures(treasures)
        
    end
    
    /*Descarta tesoro oculto/
    def discardHiddenTreasures(treasures)
        
    end
    
    /*Convierte un tesoro oculto en visible/
    def makeTreasuresVisible(treasures)
        
    end
    
    /*Inicia el juego para un jugador/
    def initGame(players)
       
    end
    
    /*Siguiente turno/
    def nextTurn
        
    end
    
    /*Termina un juego/
    def endOfGame(resutl)
        
    end
end
