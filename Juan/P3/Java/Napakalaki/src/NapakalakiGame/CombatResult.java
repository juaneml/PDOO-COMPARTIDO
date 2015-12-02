package NapakalakiGame;

/**
 * @version 3.1
 * @author juane
 */
public enum CombatResult {
    WINGAME,WIN,LOSE;
    
    @Override
    public String toString(){
        
        if(this.equals(WIN)){
            return "Ganas";
        }
        else if (this.equals(LOSE)){
            return "Has perdido ohh";
        }
        
        else if(this.equals(WINGAME)){
            return "Enhorabuena has ganado";
        }
        else
            return "HA OCURRIDO UN ERROR";
    }
}
