require_relative 'Monster.rb'
require_relative 'Prize.rb'
require_relative 'TreasureKind.rb'

module NapakalakiGame
class BadConsequence
    
    def initialize(n,g)
        @name = n
        @gainedLevels = g  
        
    end
    
    attr_reader :gainedLevels
    
end
end
