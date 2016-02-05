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
    
    public_class_method :new
    
    attr_reader :nVisibleTreasures
    attr_reader :nHiddenTreasures
    
    public
    def isEmpty()
        vacio = false
        if @nHiddenTreasures == 0 && @nVisibleTreasures==0 
            vacio = true;
        end
            vacio
    end
    
    def substractVisibleTreasure(t)
        @specificVisibleTreasures.delete(t)
    end
    
    def substractHiddenTreasure(t)
        @specificHiddenTreasures.delete(t)
    end
    
    def adjustToFitTreasureList(v,h)
       
        tamV = v.size
        tamH = h.size
        
        nVisibleAux = @nVisibleTreasures
        nHiddenAux = @nHiddenTreasures
        
        puts 'Entra adjust Numeric'
        
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
        "BadConsequence =  #{super}, nVisibleTreasure = #{@nVisibleTreasures}  nHiddenTreasures =  #{@nHiddenTreasures} , death =  #{@death}"     
    end  
    
    
end
end
