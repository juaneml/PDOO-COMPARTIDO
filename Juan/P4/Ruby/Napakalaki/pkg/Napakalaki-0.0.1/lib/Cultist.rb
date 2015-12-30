require_relative 'Monster.rb'
require_relative 'Prize.rb'
require_relative 'TreasureKind.rb'

module NapakalakiGame
class Cultist
    
    def initialize(n,g)
        @name = n
        @gainedLevels = g  
        
    end
    attr_reader :name
    attr_reader :gainedLevels
    
#    attr_accessor :name
#    attr_accessor :gainedLevels
end
end
