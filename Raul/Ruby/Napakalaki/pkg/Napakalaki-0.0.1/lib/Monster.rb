# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
#encoding: utf-8

require_relative 'BadConsequence'
require_relative 'Prize'
require_relative 'TreasureKind'


class Monster

  
  def initialize(n,clevel,prize,bconsequence)
    @name=n
    @combatLevel=clevel
    @price=prize
    @badconsequence=bconsequence
  end
  
  attr_accessor :name, :combatLevel, :price, :badconsequence
  
  def to_s
    "\nMonster \nNombre #{@name} \nNiveles combate: #{@combatLevel} \nPrize: #{@price} \nBadConsequence: #{@badconsequence}"
  end 
  
end