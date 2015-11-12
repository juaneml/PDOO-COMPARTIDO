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
        @prize = price
        @badconsequence = bc
    
    end
  
     attr_reader :name
     attr_reader :combatLevel
     attr_reader :prize
     attr_reader :badconsequence
    
    #/*Niveles ganados/
    def getLevelsGained
        @prize.levels
    end 
    
    #/*Tesoros ganados/
    def getTreasuresGained
        @prize.treasures
    end
    
    def to_s
        "Monster =  #{@name}  , combatLevel =   #{@combatLevel} ,  #{@badconsequence} ,  Price:  #{@prize} "      
    end
  
end
