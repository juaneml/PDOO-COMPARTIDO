# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class BadConsequence
    
  @text
  @levels
  @nVisibleTreasures
  @nHiddenTreasures
  @death
  
  @specificHiddenTreasures=Array.new
  @specificVisibleTreasures=Array.new
  
#  def initialize(t,l,v,h)
#    @text=t
#    @levels=l
#    @nVisibleTreasures=v
#    @nHiddenTreasures=h
#    
#  end
#  
#  
#  def initialize(t,l,v,h)
#    @text=t
#    @levels=l
#    @specificHiddenTreasures=v
#    @specificVisibleTreasures=h
#    
#  end
#  
#   def initialize(t,d)
#    @text=t
#    @death=d
#      
#  end

  def initialize(aText, someLevels, someVisibleTreasures, someHiddenTreasures,someSpecificVisibleTreasures, someSpecificHiddenTreasures, death)
    @text=aText
    @level=someLevels
    @nVisibleTreasures=someVisibleTreasures
    @nHiddenTreasures=someHiddenTreasures
    @death=death
    @specificHiddenTreasures=someSpecificHiddenTreasures
    @specificVisibleTreasures=someSpecificVisibleTreasures
  end
 
   attr_accessor :text, :levels ,:nVisibleTreasures ,:nHiddenTreasures
   attr_reader :specificHiddenTreasures, :specificVisibleTreasures
   
  
  def BadConsequence.newLevelNumberOfTreasures (aText, someLevels,someVisibleTreasures, someHiddenTreasures)
    
  end
  
  def BadConsequence.newLevelSpecificTreasures (aText, someLevels,  someSpecificVisibleTreasures, someSpecificHiddenTreasures)
    
  end
  
  def BadConsequence.newDeath (aText)
    
  end
  
end
