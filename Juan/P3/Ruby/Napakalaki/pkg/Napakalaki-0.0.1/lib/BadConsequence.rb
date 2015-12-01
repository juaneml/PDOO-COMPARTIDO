#encoding: utf-8

#Versión 3.0

require_relative 'Monster.rb'
require_relative 'Prize.rb'
require_relative 'TreasureKind.rb'
class BadConsequence

    # CONSTANTE
    @@MAXTREASURES = 10
    
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
        if @nHiddenTreasures == 0 && @nVisibleTreasures==0  && @death == false  && @specificVisibleTreasures.empty?  && @specificHiddenTreasures.empty?
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
    
    
    def adjustToFitTreasure(v,h)
        tamV = v.size()
        tamH = h.size();

        nVisibleAux = @nVisibleTreasures;
        nHiddenAux = @nHiddenTreasures;

        vaux # ArrayList<Treasure> Sin Usar ?? 
        haux # ArrayList<Treasure>  Sin Usar ?? 
        badConsequence #BadConsequence Sin Usar ??

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
                    badConsequence = BadConsequence.new(text, levels, nVisibleAux, nHiddenAux);
                return badConsequence;
            end

            # si se pierden 0 tesoros es porque se pierden especificos
            if @nVisibleTreasures == 0 && @nHiddenTreasures == 0 

                 vcopia = Array.new #ArrayList<TreasureKind>
                 hcopia = Array.new #ArrayList<TreasureKind>

                # si ninguno de los dos arrays está vacío
                if !@specificHiddenTreasures.empty? && !@specificVisibleTreasures.empty? 
                    #de cada elemento de la lista de específicos ocultos
                    sht.each do|i| #for (TreasureKind sht : specificHiddenTreasures) 
                        boolean esta = false;
                        #for(Treasure vTreasure : v){ // Comprobamos si está en el otro 

                        # Comprobamos si está en el otro 
                       (0..v.size() || esta).each do|i| 
                            if sht == v.get(i).getType()  #si son iguales
                                vcopia << v.get(i).getType() # se mete en el vector de copias
                                esta = true #esta pasa a valer true(esto es para el que el for salte)
                                v.remove(v.get(i)) #se quita de la lista, para que no siga contandolo

                            end
                        end
                    end

                    svt.each do |i| #for (TreasureKind svt : specificHiddenTreasures) 
                        boolean esta = false;
                        #for(Treasure hTreasure : h){
                        (0..h.size() || esta).each do |i| 
                            if (svt == h.get(i).getType()) 
                                hcopia << h.get(i).getType()
                                h.remove(h.get(i))
                            end
                        end
                    end
                end
                #///////////////////////////////////////////////////////////////////////////////////////////

                # si uno de ellos está vacio se hace lo mismo que antes
                if @specificHiddenTreasures.empty? && !@specificVisibleTreasures.empty? 
                    sht.each do |i| #for (TreasureKind sht : specificHiddenTreasures)  #de cada elemento de la lista de específicos ocultos
                        esta = false;
                        #for(Treasure vTreasure : v){ # Comprobamos si está en el otro 
                        (0..v.size() || esta).each do |i|   # Comprobamos si está en el otro 
                            if sht == v.get(i).getType()  #si son iguales
                                vcopia << v.get(i).getType() # se mete en el vector de copias
                                esta = true; #esta pasa a valer true(esto es para el que el for salte)
                                v.remove(v.get(i)) #se quita de la lista, para que no siga contandolo

                            end
                        end
                    end
                end
                (0..2).each do |i| 
                treasure = dealer.nextTreasure
                @hiddenTreasures << treasure
                
            end
                #///////////////////////////////////////////////////////////////////////////////////////////
                if !@specificHiddenTreasures.empty? && @specificVisibleTreasures.empty? 
                    svt.each do |i| #for (TreasureKind svt : specificHiddenTreasures) 
                        esta = false;
                        # for(Treasure hTreasure : h){
                        (0..h.size()|| esta).each do |i|
                            if svt == h.get(i).getType() 
                                hcopia << h.get(i).getType()
                                h.remove(h.get(i));
                            end
                            
                            end
                        end
                    end
                

                badConsequence = new BadConsequence(text, levels, vcopia, hcopia);
                return badConsequence;

            end

        end
        #*** Cambiado provisional para no devolver null ****//
        badConsequence = new BadConsequence("No mal royo",0,0,0)
        return badConsequence; #//cambiar

    
    end

    def to_s 
        "BadConsequence =  #{@text}  , Levels =  #{@levels}  , nVisibleTreasure = #{@nVisibleTreasures}  nHiddenTreasures =  #{@nHiddenTreasures} , specificVisibleTreasures = #{@specificVisibleTreasures} , specicHiddenTreasures = #{@specificHiddenTreasures}, death =  #{@death}"     
    end  
  
   
end