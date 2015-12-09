#encoding: utf-8

#Versión 3.0
module NapakalakiGame
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
   
    def to_s
        "Treasure =  #{@name}  , bonus =   #{@bonus} ,type =  #{@type}  "      
    end
end
end