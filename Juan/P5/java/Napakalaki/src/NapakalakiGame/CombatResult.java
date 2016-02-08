package NapakalakiGame;

/**
 * @version 3.1
 * @author juane
 */
public enum CombatResult {
    WINGAME,WIN,LOSE, LOSEANDCONVERT;
    
    
    @Override
    public String toString(){
        
        if(this.equals(WIN)){
            
            return "Ganas";
        }
        else if (this.equals(LOSE)){
            
            return "Pierdes";
        }
        
        else if(this.equals(WINGAME)){
           
            return "WINGAME";
        }
        else if(this.equals(LOSEANDCONVERT)){
           
            return "CultistPlayer";
        }
        else
            return "HA OCURRIDO UN ERROR";
    }

   

  
    
}
