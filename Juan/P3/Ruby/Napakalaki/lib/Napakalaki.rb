#encoding: utf-8

#Versión 3.0
require 'singleton'
require 'Player.rb'
require 'CardDealer.rb'
require 'Dice.rb'
require 'singleton'


module NapakalakiGame


class Napakalaki 
   include Singleton
   
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
        @dealer = CardDealer.instance
        @currentMonster  
    end

    attr_accessor :currentPlayer , :player, :dealer, :currentMonster
    
    ## getCurrentPlayer
    ## getCurrentMonster
    #attr_reader :currentPlayer
    #attr_reader :currentMonster
    
    #private_class_method :new
    
#    Inicializa el array de jugadores que contiene Napakalaki, creando tantos jugadores como
#    elementos haya en names, que es el array de String que contiene el nombre de losaa
#    jugadores.
   
    def initPlayers(names)
         @players = Array.new
           names.each do |n|
           @players <<  Player.new(n)
           
          end
         
    end
    
    public
    def getCurrentPlayer
        
        return @currentPlayer
    end

    private 
    def nextPlayer()
        if(@currentPlayer == nil)
            numero = rand(@players.size)
            puts @players.size
            puts @players.fetch(0)
            puts @players.fetch(1)
            @currentPlayer = @players[numero]
           
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
                i = i+1
            end
            
        end
        return @currentPlayer
    end
    

    public
    def getCurrentPlayer
        
        return @currentPlayer
    end
    
    def getCurrentMonster
        return @currentMonster
    end
    
    private
    def nextTurnAllowed()
        sig = false
        
        #if(@currentPlayer.validState)
        if @currentPlayer == nil
            sig=true
        end
        
        return sig
    end
    
    
    private
    def setEnemies()
        enemigo =Player.new(@players[0])
        #enemigo = @players[0]
        
        @players.each do |p|
            
            loop do 
                 numero = rand(@players.size)
                  
                 enemigo.setEnemy(@players[numero])
                 
            break if (enemigo != p)
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
        treasures.each do |t|
            @currentPlayer.discardVisibleTreasure(t)
            @dealer.giveTreasureBack(t)
        end
    end
    
    def discarHiddenTreasures(treasures)
        treasures.each do |t|
            @currentPlayer.discardHiddenTreasure(t)
            @dealer.giveTreasureBack(t)
        end
    end
    
<<<<<<< HEAD
    def makeTreasureVisible(treasures)

    
=======
   

    def makeTreasureVisible(treasures)

>>>>>>> origin/master
        treasures.each do |t|
            @currentPlayer.discardHiddenTreasure(t)
            @dealer.giveTreasureBack(t)
        end
        
    end
    
    def initGame(players)
        initPlayers(players)
        setEnemies()

        @dealer.initCards
         nextTurn()
       # @currentPlayer.initTreasures
       
        
    end
    

    def nextTurn()
        stateOK = nextTurnAllowed
        
        if(stateOK == true)
            @currentMonster = @dealer.nextMonster
            @currentPlayer = nextPlayer
            #dead = @currentPlayer.isDead()
            
            #if(dead == true)
                @currentPlayer.initTreasures
            #end
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

end