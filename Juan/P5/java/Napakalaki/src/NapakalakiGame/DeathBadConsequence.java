
package NapakalakiGame;

import java.util.ArrayList;

/**
 *
 * @author juane
 */
public class DeathBadConsequence extends NumericBadConsequence{
    
   
 
    private boolean death  = false;
    public DeathBadConsequence(String text, boolean death) {
       super( text, Player.MAXLEVEL, BadConsequence.MAXTREASURES, BadConsequence.MAXTREASURES);
       this.death = death;
        
    }
    
    
    
    
}
