#encoding: utf-8
#author: Juane
#Versión 3.0
require_relative 'TreasureKind.rb'
require_relative 'Monster.rb'
require_relative 'BadConsequence.rb'
module NapakalakiGame
class Prize    
    
    def initialize(treasures,level)
        @treasures = treasures
        @levels = level
    end
 
     #Método de lectura, get
    attr_reader :treasures
    attr_reader :levels
  
  
    #Método toString
 
    def to_s
        "Treasures =  #{@treasures} Niveles ganados =   #{@levels}"
    end
  
  
    #Método solo lectura
    # attr_reader	
    #Método solo escritura
    # attr_writer
end
end