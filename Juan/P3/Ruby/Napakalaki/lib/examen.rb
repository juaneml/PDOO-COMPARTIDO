## To change this license header, choose License Headers in Project Properties.
## To change this template file, choose Tools | Templates
## and open the template in the editor.
require 'singleton'
require 'Player.rb'
require 'CardDealer.rb'
require 'Dice.rb'
require 'BadConsequence'

require 'singleton'
module NapakalakiGame
class Examen
    include Singleton
    
    private
    def initialize
        @player= Player.new("prueba")
    end
    
    public
    def run
        badconsequence = BadConsequence.newLevelSpecificTreasures('Prueba',3,[TreasureKind::ONEHAND,TreasureKind::ONEHAND,TreasureKind::BOTHHANDS],[TreasureKind::SHOES])
        
        
        v= @player.getVisibleTreasures
        h= @player.getHiddenTreasures
        
        puts v
        puts h
        badconsequence.adjustToFitTreasureList(v, h)
        puts v
        puts h
        
    end
    
    
end
end
