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
 
    
  
  
    def initialize(name,level,bc,price)
        @name = name
        @combatLevel = level    
        @prize = price
        @badconsequence = bc
    
    end
  
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

    #EXAMEN
    
    def getCombatLevel
        dice = Dice.instance  
        cardealer = CardDealer.instance
        
        friend = self
        
       
        r = dice.NextNumber
        if r > 5
            cardealer.getRandomUnusedMonster
            
        end
        
        if friend != nil
          cl =  friend.getCombatLevel
             
        else
            cl = 0
         return cl  # monsterLelevl
        end
         
    end
    #FIN EXAMEN
    def to_s
        "Monster =  #{@name}  , combatLevel =   #{@combatLevel} ,  #{@badconsequence} ,  Price:  #{@prize} "      
    end
  
end
end