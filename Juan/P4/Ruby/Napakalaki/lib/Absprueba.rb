# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
require_relative 'Interfaceprueba.rb'

class Absprueba
    
    attr_accessor :text
    def initialize(caca)
        @text = caca
    end
    
    private_class_method :new #Necesario para que esto sea abstracto
        
    def diAdios
        raise NotImplementedError.new
    end
    
    def diHola
        puts 'Hola'
    end
    
end
