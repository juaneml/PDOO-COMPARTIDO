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
           names.each do |n|
           @players << n
          end
    end
    


    private 
    def nextPlayer()
        if(@currentPlayer == nil)
            numero = rand(@players.size)
            
            @currentPlayer=players[numero]
            aux=Array.new
            
            aux << @currentPlayer
            
            @players.each do |p|
                if ( p != @currentPlayer)
                    aux << p
                end
            end
            @players= aux
            
            return @currentPlayer
            
        else
            i=0
            while( i< @players.size)
                if(@currentPlayer == @player[i])
                    if(i==(@players.size -1))
                        @currentPlayer = @players[0]
                    else
                        @currentPlayer = @players[i+1]
                    end
                end
            end
            return @currentPlayer
        end
    end
    

    
    
    private
    def nextTurnAllowed()
        sig = false
        
        if(@currentPlayer.validState)
            sig=true
        end
        
        return sig
    end
    
    
    private
    def setEnemies()
        enemigo =Player.new
        enemigo = @players[0]
        
        numero = rand(6)+1
        
        @players.each do |p|
            loop do 
                 numero = rand(@players.size)
                 enemigo.setEnemy(@players[numero])
                break if (enemigo == p)
            end
        end
        
        
    end
    
#    private 
#    def self.getInstance()
#        @@instance = Napakalaki.instance
#    end
#   

    public
    def developCombat()
        combatResult = @currentPlayer.combat(@currentMonster)
        
        return combatResult
    end
    

    
    def discardVisibleTreasures (treasures)
        @treasures.each do |t|
            @currentPlayer.discardVisibleTreasure(t)
            @dealer.giveTreasureBack(t)
        end
    end
    
    def discarHiddenTreasures(treasures)
        @treasures.each do |t|
            @currentPlayer.discardHiddenTreasure(t)
            @dealer.giveTreasureBack(t)
        end
    end
    
    def makeTreasuresVisible(treasures)
        
    end
    
    def initGame(players)
        self.initPlayers(players)
        self.setEnemies()
        @dealer.initCards()
        self.nextTurn
        
    end
    

    def nextTurn()
        stateOK = self.nextTurnAllowed
        
        stateOK = @currentPlayer.validState
        if(stateOK == true)
            @currentMonster = @dealer.nextMonster
            @currentPlayer = self.nextPlayer
            dead = @currentPlayer.isDead
            
            if(dead == true)
                @currentPlayer.initTreasures
            end
        end
        
        return stateOK
    end
    
    def endOfGame (result)
        
       final = false
       if (result.eql?([CombatResult::WINGAME]))
            final = true
            
       end
            return final
   end
    
end
