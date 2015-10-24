# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
#encoding: utf-8

require_relative 'TreasureKind'

class Prize
   
  def initialize(t,l)
    @treasures=t
    @level=l
  end
  
  attr_accessor :treasures ,:level
  
  def to_s
    "Tesoros #{@treasures} Nivel: #{@level}"
  end 
  
  
end
