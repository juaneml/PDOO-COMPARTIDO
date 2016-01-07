
class Treasure
    def initialize(n,bonus,t)
        @name = n
        @bonus = bonus
        @type = t
    end
   
   #MÉTODOS GET 
   attr_reader :name
   attr_reader :bonus
   attr_reader :type
   
end
