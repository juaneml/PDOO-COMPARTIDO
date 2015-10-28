#encoding: utf-8
#Versión 1.0
# author: juane, Raúl

require_relative 'BadConsequence.rb'
require_relative 'TreasureKind.rb'
require_relative  'Prize.rb'

class Monster
    #Atributos propios de la clase
  
    # @name # String para representar el nombre del monstruo
    # @combatLevel # int para representar el nivel de combate del monstruo
  
    #Otros atributos
    # @badconsequence  # de tipo BadConsequence
    # @price # de tipo Prize
 
  
  
    def initialize(name,level,bc,price)
        @name = name
        @combatLevel = level    
        @price = price
        @badconsequence = bc
    
    end
  
     attr_accessor :name
     attr_accessor :combatLevel
     attr_accessor :price
     attr_accessor :badconsequence
    def to_s
        "Monster =  #{@name}  , combatLevel =   #{@combatLevel} ,  #{@badconsequence} ,  Price:  #{@price} "      
    end
  
end
