#encoding: utf-8

#Versión 3.0

require_relative 'TreasureKind.rb'
require_relative 'BadConsequence.rb'
require_relative 'Prize.rb'



module NapakalakiGame
class Monster
    # @@numMonster --> contar el número de monstruos
    #Atributos propios de la clase
  
    # @name # String para representar el nombre del monstruo
    # @combatLevel # int para representar el nivel de combate del monstruo
  
    #Otros atributos
    # @badconsequence  # de tipo BadConsequence
    # @price # de tipo Prize
 
  
  
    def initialize(name,level,bc,price,ic)
        @name = name
        @combatLevel = level    
        @prize = price
        @badconsequence = bc
        @levelChangeAgainstCultistPlayer = ic
    
    end
    
#    private_class_method :new
#    def self.oldMonster(name, level,bc,price)
#        new(name,level,bc,price,0)
#    end
#    
#    def self.newMonster(name, level,bc,price,ic)
#        new(name,level,bc,price,ic)
#    end
  
    ## Métodos get
    attr_reader :name
    attr_reader :combatLevel 
    attr_reader :badconsequence
    attr_reader :prize
    
   
    
    def getLevelsGained
        @prize.levels
    end
    
    def getTreasureGained
        @prize.treasures
    end
    
    def getCombatLevelAgainstCultistPlayer
        return @levelChangeAgainstCultistPlayer + @combatLevel
    end

    def to_s
       return "Monster =  #{@name}  , combatLevel =   #{@combatLevel} , bc = #{@badconsequence} ,  Price:  #{@prize} , levelChanged: #{@ic}"      
    end
   
   
end
end