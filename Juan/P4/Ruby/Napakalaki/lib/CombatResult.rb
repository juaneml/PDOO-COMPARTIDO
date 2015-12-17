#encoding: utf-8

#Versión 3.0
module NapakalakiGame
module CombatResult
    
    WINGAME = :WINGAME
    WIN = :WIN
    LOSE = :LOSE
    LOSEANDCONVERT = :LOSEANDCONVERT
 
    def to_s
      if [CombatResult::WINGAME]          
          return "Has ganado el juego"
      end
                
          if [CombatResult::WIN]
             return "Has ganado"
          end
          
      if [CombatResult::LOSE]
          return "Has perdido"
      end
     
        if [CombatResult::LOSEANDCONVERT]
            return "Te conviertes"
        end
      
    end
end
end