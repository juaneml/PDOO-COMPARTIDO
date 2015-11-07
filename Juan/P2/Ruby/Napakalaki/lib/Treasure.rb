require_relative 'TreasureKind.rb'

class Treasure
    
    def initialize(n,b,t)
        @name=n
        @bonus=b
        @treasure=t
    end
    
    attr_reader :name, :bonus, :treasure
    
end
