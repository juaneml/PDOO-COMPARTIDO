#encoding: utf-8

#Versión 3.0
#include Singleton ## 1º y 2º y 3º lo evitamos con el uso de include Singleton

require 'singleton'

module NapakalakiGame
class Dice
    include Singleton
#  @@instance = nil #1º Creamos la instancia

    
    private
    
    def initialize
        @@instance = nil
    end
    
#    public
    
    #2º Creamos el método
#    def getInstance
#        if @@instance == nil
#            @@instance == new
#        end
#       return @@instance
#    end
    
    # 3º Para evitar que puedan existir mas objetos de esta clase
   # private_class_method :new
    
    public
    def nextNumber()
         
        number = rand(6)+1
        return number 
    end
end

end