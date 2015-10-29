
#encoding: utf-8
# author: juane, Raúl
class BadConsequence
    
  @text
  @levels
  @nVisibleTreasures
  @nHiddenTreasures
  @death
  
  @specificHiddenTreasures=Array.new
  @specificVisibleTreasures=Array.new
  


  def initialize(aText, someLevels, someVisibleTreasures, someHiddenTreasures,someSpecificVisibleTreasures, someSpecificHiddenTreasures, death)
    @text=aText
    @levels=someLevels
    @nVisibleTreasures=someVisibleTreasures
    @nHiddenTreasures=someHiddenTreasures
    @death=death
    @specificHiddenTreasures=someSpecificHiddenTreasures
    @specificVisibleTreasures=someSpecificVisibleTreasures
  end
 
   attr_accessor :text, :levels ,:nVisibleTreasures ,:nHiddenTreasures
  #Esto en un futuro puede cambiar para acceder a estas cosas 
  attr_reader :specificHiddenTreasures, :specificVisibleTreasures
   
   private_class_method :new
   
  #Todos estos métodos llaman al constructor
    def self.newLevelNumberOfTreasures (aText, someLevels,someVisibleTreasures, someHiddenTreasures)
      new(aText, someLevels, someVisibleTreasures, someHiddenTreasures,[], [], [])
    end

    def self.newLevelSpecificTreasures (aText, someLevels,  someSpecificVisibleTreasures, someSpecificHiddenTreasures)
      new(aText, someLevels, [], [],someSpecificVisibleTreasures, someSpecificHiddenTreasures, [])
    end

    def self.newDeath (aText)
      new(aText, [], [], [],[], [], true)
    end
#    if(specificVisibleTreasures.isEmpty()==false || specificHiddenTreasures.isEmpty()==false){
#            return "BadConsequence{" + "text=" + text + ", levels=" + Integer.toString(levels) + ", nVisibleTreasures=" + specificVisibleTreasures
#                + ", nHiddenTreasures=" +specificHiddenTreasures + ", Death=" + Boolean.toString(death) +  '}';//
#        }

     def to_s
        "Text: #{@text} Niveles perdidos: #{@levels} TesorosVisibles: #{@nVisibleTreasures} TesorosOcultos: #{@nHiddenTreasures} Death: #{@death} TesorosEspecificosOcultos: #{@specificHiddenTreasures} TesorosEspecificosVisibles: #{@specificVisibleTreasures}"
      end 
  
end
