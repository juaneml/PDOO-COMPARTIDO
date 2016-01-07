include Singleton

class Dice
    @@instance = null
    
    private
    
    def initialize
    
    end
    
    public
    
    def getInstance
        @@instance
    end
    
    def nextNumber()
         rand = Random.new()
         numero = rand(6)+1
         
         numero 
    end
end
