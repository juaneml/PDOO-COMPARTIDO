#encoding: utf-8
#Versión 1.0

require_relative 'Monster.rb'
require_relative 'Prize.rb'
require_relative 'TreasureKind.rb'
class BadConsequence

    # CONSTANTE
    MAXTREASURES = 10
    
    #  @text #String que representa lo que dice el mal royo
    #  @levels # int para representar los niveles que se pierden
    #  @nVisibleTreasures # de tipo int, número de tesoros que se pierden
    #  @nHiddenTreasures # de tipo int, número de tesoros ocultos que se pierden
    #  @death # de tipo booleano, representa el mal rollo de tipo muerte
    #  
    #  #Para el tipo TreasureKind
    #  @specificHiddenTreasures
    #  @specificVisibleTreasures
  
  
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

    ## Métodos solo lectura, get
    
    attr_reader :levels
    attr_reader :nVisibleTreasures
    attr_reader :nHiddenTreasures
    attr_reader :specificHiddenTreasures
    attr_reader :specificVisibleTreasures
  
   
    
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
   
    
    def isEmpty()
        vacio = false
         if @nHiddenTreasures == 0 && @nVisibleTreasures==0 && @levels == 0  && @death == false  && @specificVisibleTreasures.isEmpty  && @specificHiddenTreasures.isEmpty
            vacio = true;
         end
            vacio
    end
    
    def substractVisibleTreasure(t)
        
    end
    
    def adjustToFitTreasure(v,h)
        
    end
#   

 
    def to_s 
        "BadConsequence =  #{@text}  , Levels =  #{@levels}  , nVisibleTreasure = #{@nVisibleTreasures}  nHiddenTreasures =  #{@nHiddenTreasures} , specificVisibleTreasures = #{@specificVisibleTreasures} , specicHiddenTreasures = #{@specificHiddenTreasures}, death =  #{@death}"     
    end  
  
   
end
