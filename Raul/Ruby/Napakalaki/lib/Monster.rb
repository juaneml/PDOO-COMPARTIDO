# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Monster
    
  @name
  @combatLevel
  @price=Prize.new
  @badconsequence=BadConsequence.new
  
  def initialize(n,cl,bc,p)
    @name=n
    @combatLevel=cl
    @price=p
    @badconsequence=bc
  end
  
  attr_accessor :name, :combatLevel, :price, :badconsequence
  
end