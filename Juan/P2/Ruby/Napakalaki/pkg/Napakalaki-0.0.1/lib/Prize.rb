#Versión 1.0
require_relative 'BadConsequence.rb'
require_relative 'Monster.rb'
require_relative 'TreasureKind.rb'
class Prize    
    
    def initialize(treasures,level)
        @treasures = treasures
        @levels = level
    end
 
    #Método toString
 
    def to_s
        "Treasures =  #{@treasures} Niveles ganados =   #{@levels}"
    end
  
    #Método de escritura y lectura segunda forma
    attr_reader :treasures
    attr_reader :levels
  
   
end
