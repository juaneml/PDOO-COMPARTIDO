# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

<<<<<<< HEAD
#EXAMEN
class Runme
    
    def run
        runme = examen.instance
    end
    
    v = Array.new()
    h = Array.new()
    napakalaki = Napakalaki.instance
    napakalaki.initPlayers("prueba")
    
    card = CardDealer.instance
    treasure t
    tesoro = card.nextTreasure()
    
    i = 0
    tesoro.each do |aux|
        i=1
        if t.type TreasureKind::ONEHAND
            v << aux
        end
        
        if t.type TreasureKind::ARMOR
            v << aux
        end
        if
            t.type TreasureKind::HELMET
        end
    end
    
    def initialize
    
    end
    
    
end

#FIN EXAMEN
=======


require_relative "Napakalaki"
require_relative "Examen"

module NapakalakiGame

  class Runme
   
      def prueba
        
       test = Examen.instance
     
       game = Napakalaki.instance
   
       #Se prueba el juego con 2 jugadores
   
       
       
      end
      
  end
  
    e = Examen.instance
    e.run

end
>>>>>>> origin/master
