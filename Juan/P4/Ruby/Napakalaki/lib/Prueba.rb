# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
require_relative 'Absprueba.rb'

module NapakalakiGame
    class Prueba < Absprueba #Herencia
        include Interfaceprueba #Interface

        def initialize(caca)
            @algo=caca
        end

        public_class_method :new #necesario para poder accder a la clase abstracta
        
        def diHola
            super
            puts ' caracola'
        end
    end
end
