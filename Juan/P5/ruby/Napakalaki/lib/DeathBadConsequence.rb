# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

require_relative 'BadConsequence.rb'
require_relative 'Monster.rb'
require_relative 'Prize.rb'
require_relative 'TreasureKind.rb'
require_relative 'NumericBadConsequence'

module NapakalakiGame

class DeathBadConsequence < NumericBadConsequence 
    
    def initialize(text)
        super(text,99,BadConsequence.maxtreasures,BadConsequence.maxtreasures)
        
    end
    
    
    
end
end
