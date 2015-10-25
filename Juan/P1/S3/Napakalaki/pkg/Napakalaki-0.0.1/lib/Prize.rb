#encoding: utf-8
# author: Juane
#Versión 1.0
require 'TreasureKind.rb'
class Prize    
    
    def initialize(treasures,level)
        @treasures = treasures
        @levels = level
    end
 
    #Método de consulta primera forma
=begin
def treasures
    @treasures
  end
  
  def level
    @levels
  end
=end
  
  
    #Método toString
 
    def to_s
        "Treasures =  #{@treasures} Niveles ganados =   #{@levels}"
    end
  
    #Método de escritura y lectura segunda forma
    attr_accessor :treasures
    attr_accessor :levels
  
    #Método solo lectura
    # attr_reader	
    #Método solo escritura
    # attr_writer
end
