
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
       super.levels=1;
       super.setnHiddenTreasures(0);
       super.setnVisibleTreasures(0);//pruebas
       this.death = death;
        
    }
    
    
    
    
}
