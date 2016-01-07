#encoding: utf-8

#Versión 1.0
# author: juane, Raúl

require_relative 'Monster.rb'
require_relative 'TreasureKind.rb'
require_relative 'Prize.rb'
class BadConsequence

    #  @text #String que representa lo que dice el mal royo
    #  @levels # int para representar los niveles que se pierden
    #  @nVisibleTreasures # de tipo int, número de tesoros que se pierden
    #  @nHiddenTreasures # de tipo int, número de tesoros ocultos que se pierden
    #  @death # de tipo booleano, representa el mal rollo de tipo muerte
    #  
    #  #Para el tipo TreasureKind
    #  @specificHiddenTreasures
    #  @specificVisibleTreasures
  
    @@MAXTREASURES=10
  
    # Constructor #
    #LevelNumberOfTreasures

    def  initialize(aText,someLevels,someVisibleTreasures,someHiddenTreasures,
            someSpecificVisibleTreasures,someSpecificHiddenTreasures, death)
        @text = aText
        @levels = someLevels
        @nVisibleTreasures = someVisibleTreasures
        @nHiddenTreasures = someHiddenTreasures
        @specificVisibleTreasures = someSpecificVisibleTreasures
        @specificHiddenTreasures = someSpecificHiddenTreasures
        @death = death
        
   
    end 
    
    #Método consultores de otra forma

    attr_reader :text
    attr_reader :levels
    attr_reader :nVisibleTreasures
    attr_reader :nHiddenTreasures
    attr_reader :death
    attr_reader :specificHiddenTreasures
    attr_reader :specificVisibleTreasures 
    
    #Indica que el método new tiene visibilidad privada
    
    private_class_method :new

    def self.newLevelNumberOfTreasures(aText, someLevels,someVisibleTreasures,
            someHiddenTreasures)
        new(aText,someLevels,someVisibleTreasures,someHiddenTreasures,[],[],false)
    end
    
    def  self.newLevelSpecificTreasures (aText, someLevels,
            someSpecificVisibleTreasures, someSpecificHiddenTreasures)

        new(aText,someLevels,0,0,someSpecificVisibleTreasures,someSpecificHiddenTreasures,false)
    end
    
    def self.newDeath(aText)
        new(aText,0,0,0,[],[],true)
    end
   
    #Mira si está vacío el mal royo
    
    def isEmpty
        vacio =false
        if(@nVisibleTreasures == 0 and @nHiddenTreasures == 0 and @specificVisibleTreasures.empty? and @specificHiddenTreasures.empty?)
            vacio =true
        end
            vacio
    end
    
    #/*Extrae tesoros visibles a un jugador/
    def substractVisibleTreasure(t)
        
    end
    
    #/*Extrae tesoros ocultos a un jugador/
    def substractHiddenTreasure(t)
        
    end
    
    #/*Ajusta la lista de tesoros/
    def adjustToFitTreasureLists(v,h)
        
    end
    

 
    def to_s 
        "BadConsequence =  #{@text}  , Levels =  #{@levels}  , nVisibleTreasure = #{@nVisibleTreasures}  nHiddenTreasures =  #{@nHiddenTreasures} , specificVisibleTreasures = #{@specificVisibleTreasures} , specicHiddenTreasures = #{@specificHiddenTreasures}, death =  #{@death}"     
    end  
  
   
end
