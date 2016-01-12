require_relative 'BadConsequence.rb'
require_relative 'Monster.rb'
require_relative 'Prize.rb'
require_relative 'TreasureKind.rb'
module NapakalakiGame

class NumericBadConsequence < BadConsequence
    
    @@MAXTREASURES = 10
    
    def initialize( text,  levels,  nVisible,  nHidden)
        @nVisibleTreasures=nVisible
        @nHiddenTreasures=nHidden
        super(text,levels)
        
    end
    
    attr_reader :nVisibleTreasures
    attr_reader :nHiddenTreasures
    
    public
    def isEmpty()
        vacio = false
        if @nHiddenTreasures == 0 && @nVisibleTreasures==0  && @death == false 
            vacio = true;
        end
            vacio
    end
    
    def adjustToFitTreasureList(v,h)
       
        tamV = v.size
        tamH = h.size
        
        nVisibleAux = @nVisibleTreasures
        nHiddenAux = @nHiddenTreasures
        
        if(nVisibleAux < tamV)
            nuevoV = nVisibleAux
        else
            nuevoV = tamV
        end
        
        if(nHiddenAux < tamH)
            nuevoH = nHiddenAux
        else
            nuevoH = tamH
        end
        
        badConsequence = NumericBadConsequence.new(@text,@levels,nuevoV,nuevoH)
        return badConsequence
    
    end
    
    def to_s 
        "BadConsequence =  #{@text}  , Levels =  #{@levels}  , nVisibleTreasure = #{@nVisibleTreasures}  nHiddenTreasures =  #{@nHiddenTreasures} , death =  #{@death}"     
    end  
    
    
end
end
