require_relative 'BadConsequence.rb'
require_relative 'Monster.rb'
require_relative 'Prize.rb'
require_relative 'TreasureKind.rb'
module NapakalakiGame

class NumericBadConsequence < BadConsequence
    
    
    
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
        tamV = v.size()
        tamH = h.size();
        puts 'tamH #{tamH}'
        nVisibleAux = @nVisibleTreasures;
        nHiddenAux = @nHiddenTreasures;

#        vaux = Treasure.new('',0,[TreasureKind::ARMOR])
#        haux = Treasure.new('',0,[TreasureKind::ARMOR])
        vaux = Array.new(v) # ArrayList<Treasure>  
        haux = Array.new(h) # ArrayList<Treasure>  
        #badConsequence #BadConsequence 
        
        puts 'haux'
        if tamV > 0 || tamH > 0  # Si los vectores que recibimos tienen cosas entramos aqui

            #si los arrays de tesoros especificos a perder estan vacíos entramos
            if @specificHiddenTreasures.empty? && @specificVisibleTreasures.empty? 

                #si perdemos un numero de ocultos o visibles mayor de lo que tenemos
                if @nHiddenTreasures > 0 || @nVisibleTreasures > 0 

                    #y se pierden más de lo que tenemos de uno u otro 
                    if @nVisibleTreasures > v.size() || @nHiddenTreasures > h.size() 

                        #Puede darse que se pierdan mas de los visibles pero los otros no
                        if @nVisibleTreasures > v.size() && @nHiddenTreasures <= h.size() 
                            nVisibleAux = v.size(); #igualamos el valor

                        end
                        #Puede darse que se pierdan mas de los ocultos pero los otros no
                        if @nVisibleTreasures <= v.size() && @nHiddenTreasures > h.size() 
                            nHiddenAux = h.size(); #igualamos el valor

                        end
                        #Puede darse que se pierdan más de ambos
                        if @nVisibleTreasures > v.size() && @nHiddenTreasures > h.size() 
                            nHiddenAux = h.size() #igualamos el valor
                            nVisibleAux = v.size()
                        end
                    end
                end
                
                badConsequence = BadConsequence.newLevelNumberOfTreasures(@text, @levels, nVisibleAux, nHiddenAux);
                return badConsequence;
            end

#            # si se pierden 0 tesoros es porque se pierden especificos
#            if @nVisibleTreasures == 0 && @nHiddenTreasures == 0 
#
#                 vcopia = Array.new #ArrayList<TreasureKind>
#                 hcopia = Array.new #ArrayList<TreasureKind>
#
#                # si ninguno de los dos arrays está vacío
#                if !@specificHiddenTreasures.empty? || !@specificVisibleTreasures.empty? 
#                    #de cada elemento de la lista de específicos ocultos
#                    @specificHiddenTreasures.each do|sht| #for (TreasureKind sht : specificHiddenTreasures) 
#                        esta = false;    
#                        puts haux.size
#                        for i in 0..(haux.size()-1) 
#                            puts i
#                            puts haux[i]
#                            if esta ==false
#                                if sht == haux[i].type #si son iguales
#                                    hcopia << haux[i].type # se mete en el vector de copias
#                                    esta = true #esta pasa a valer true(esto es para el que el for salte)
#                                    haux.delete(sht) #se quita de la lista, para que no siga contandolo
#                                end
#                            end
#                        end
#                    end
#
#                    @specificVisibleTreasures.each do |svt| #for (TreasureKind svt : specificHiddenTreasures) 
#                        esta = false;
#                        #for(Treasure hTreasure : h){
#                        for i in 0..(vaux.size()-1) 
#
#
#                           if esta == false
#
#
#                               if (svt == vaux[i].type) 
#                                    vcopia << vaux[i].type
#                                    esta=true
#                                    vaux.delete(svt)
#                                end
#                            end
#                        end
#                    end
#                    
#                    
#                    
#                end
#                #///////////////////////////////////////////////////////////////////////////////////////////
#
#                # si uno de ellos está vacio se hace lo mismo que antes
#                if @specificHiddenTreasures.empty? && !@specificVisibleTreasures.empty? 
#                    @specificVisibleTreasures.each do |svt| #for (TreasureKind svt : specificHiddenTreasures) 
#                        esta = false;
#                        #for(Treasure hTreasure : h){
#                        for i in 0..(vaux.size()-1) 
#                           if esta ==false
#                                if (svt == vaux.fetch(i).type) 
#                                    vcopia << vaux[i].type
#                                    esta =true
#                                    vaux.delete(vaux[i])
#                                end
#                            end
#                        end
#                    end
#                end
#                
#                #///////////////////////////////////////////////////////////////////////////////////////////
#                if !@specificHiddenTreasures.empty? && @specificVisibleTreasures.empty? 
#                    @specificHiddenTreasures.each do|sht| #for (TreasureKind sht : specificHiddenTreasures) 
#                        esta = false;                    
#                        for i in 0..(haux.size()-1) 
#                            if esta ==false
#                                if sht == haux.get(i).getType()  #si son iguales
#                                    hcopia << haux.get(i).getType() # se mete en el vector de copias
#                                    esta = true #esta pasa a valer true(esto es para el que el for salte)
#                                    haux.delete(haux.get(i)) #se quita de la lista, para que no siga contandolo
#
#                                end
#                            end
#                        end
#                    end
#               end
#                
#
#                
#              
#                badConsequence = BadConsequence.newLevelSpecificTreasures(@text, @levels,vcopia, hcopia)
#                
#                return badConsequence;
#
#            end

        end
        #*** Cambiado provisional para no devolver null ****//
        badConsequence = BadConsequence.newLevelSpecificTreasures("No mal royo",0,0,0)
        return badConsequence; #//cambiar

    
    end
    
    def to_s 
        "BadConsequence =  #{@text}  , Levels =  #{@levels}  , nVisibleTreasure = #{@nVisibleTreasures}  nHiddenTreasures =  #{@nHiddenTreasures} , death =  #{@death}"     
    end  
    
    
end
end
