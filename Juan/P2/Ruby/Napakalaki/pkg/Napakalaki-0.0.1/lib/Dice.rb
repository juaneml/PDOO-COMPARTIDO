

class Dice
    #include Singleton se podría usar también y evitamos todo lo anterior
    
    #Para crear el singleton
    @@instance=nil #1º creamos la instancia
    
    def initialize
        
    end
    
    #2º crear el singleton
    def Dice.getInstance()
        if @@instance==nil then
            @@instance=new
        end
        
        return @@instance
    end
    
   #3ºPara evitar que puedan existir más objetos de esta clase, que para eso es singleton, usamos:
    
    private_class_method :new
    
     def nextNumber
        number = 1+ rand(6)
        number
     end
    
    
    
end