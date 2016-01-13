require_relative 'BadConsequence.rb'
require_relative 'Monster.rb'
require_relative 'Prize.rb'
require_relative 'TreasureKind.rb'
require_relative 'NumericBadConsequence'

module NapakalakiGame

class DeathBadConsequence < NumericBadConsequence 
    
    def initialize(text)
        super(text,0,0,0)
        @death = true
    end
    
    attr_reader :death
    
end
end
