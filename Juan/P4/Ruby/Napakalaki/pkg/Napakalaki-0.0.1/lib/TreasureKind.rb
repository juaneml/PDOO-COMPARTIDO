#encoding: utf-8

#Versión 3.0
#Modulo para el tipo enumerado

module NapakalakiGame
module TreasureKind 

    ARMOR = :armor
    ONEHAND = :onehand
    BOTHHANDS = :bothhands
    HELMET = :helmet
    SHOES = :shoes
    
 
  def to_s
      if [TreasureKind.ARMOR]          
          return "ARMOR"
      end
                
          if [TreasureKind.ONEHAND]
             return "ONEHAND"
          end
          
      if [TreasureKind.BOTHHANDS]
          return "BOTHHANDS"
      end
      
      if [TreasureKind.HELMET]
          return "HELMET"
      end
      
      if [TreasureKind.SHOES]
          return "SHOES"
      end
    end
end

end