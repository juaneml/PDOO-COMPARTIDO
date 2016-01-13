require_relative 'BadConsequence.rb'
require_relative 'Monster.rb'
require_relative 'Prize.rb'
require_relative 'TreasureKind.rb'
module NapakalakiGame

class SpecificBadConsequence < BadConsequence
    
    def initialize( text,  levels,  tVisible,  tHidden)
        @specificVisibleTreasures = tVisible
        @specificHiddenTreasures = tHidden
        super(text,levels)
        
    end
    
    attr_reader :specificHiddenTreasures
    attr_reader :specificVisibleTreasures
    
    public
    def isEmpty()
        vacio = false
        if @specificVisibleTreasures.empty?  && @specificHiddenTreasures.empty?
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
        bad
        
        # Tesoros específicos Visibles 
        
        copia_specificV = Array.new() # auxiliar      
        bad_specific_Vdev = Array.new() # lista devuelta
        
        
        # Tesoros específicos Ocultos
        copia_specificH = Array.new() # auxiliar
        bad_specific_Hdev = Array.new() #lista devuelta
        
        specificV = @specificVisibleTreasures
        specificH = @specificHiddenTreasures
        #  Copiamos los tesoros específicos visibles que tiene el jugador
        #  en una lista auxiliar
        
        
        # VISIBLES #

       
            specificV.each do |copia|
                copia_specificV << copia
            end
        
        
#         Seleccionamos los tesoros que se ajustan al badconsequence que
#            puede cumplir el jugador

        
        v.each do |dadoBad|
            if (copia_specificV.include?(v.type) ) #si contiene el tipo
                bad_spefic_Vdev << dadoBad.type    #añadimos a la lista 
                copia_specificV.delete(dadoBad.type) #eliminamos elemento de la copia
            end
        end
     
        #   OCULTOS  #
        
        specificH.each do |ocultoBad|
            copia_specificH << ocultoBad
        end

        
        #  Seleccionamos los tesoros que se ajustan al badconsequence que
        #  puede cumplir el jugador

        h.each do |dadoBad|
            if (copia_specificH.include?(dadoBad.type)) #si contiene el tipo
                bad_specific_hdev << dadoBad.type # añadimos a la lista
                copia_specificV.delete(dadoBad.type) #eliminamos elemento de la copia
            end
        end

        
        bad = SpecificBadConsequence.new(@text,@levels,nuevoV,nuevoH)
       return bad
    end
    
#    def adjustToFitTreasureList(v,h)
#        tamV = v.size()
#        tamH = h.size();
#        puts 'tamH #{tamH}'
#        nVisibleAux = @nVisibleTreasures;
#        nHiddenAux = @nHiddenTreasures;
#        copiaV = @specificVisibleTreasures
#        copiaH = @specificHiddenTreasures
#
##        vaux = Treasure.new('',0,[TreasureKind::ARMOR])
##        haux = Treasure.new('',0,[TreasureKind::ARMOR])
#        vaux = Array.new(v) # ArrayList<Treasure>  
#        haux = Array.new(h) # ArrayList<Treasure>  
#        
#        nuevoV = Array.new()
#        nuevoH = Array.new()
#        
#        #badConsequence #BadConsequence 
#        
#        puts 'haux'
#        
#        copiaV.each do |listav|
#            vaux.each  do |listaj|
#                if(listaj.type == listav)
#                    nuevoV << listav
#                    vaux.delete(listaj)
#                   
#                end
#            end
#        end
#        
#       
#        copiaH.each do |listah|
#            haux.each  do |listaj|
#                if(listaj.type == listah)
#                    nuevoH << listah
#                    haux.delete(listaj)
#                    
#                end
#            end
#        end
#
#        
#    end

    def to_s 
        "BadConsequence =  #{@text}  , Levels =  #{@levels}  , specificVisibleTreasures = #{@specificVisibleTreasures} , specicHiddenTreasures = #{@specificHiddenTreasures}, death =  #{@death}"     
    end  
end
end