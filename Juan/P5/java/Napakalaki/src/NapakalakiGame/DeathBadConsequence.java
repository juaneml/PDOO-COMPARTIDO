
package NapakalakiGame;

import java.util.ArrayList;

/**
 *
 * @author juane
 */
public class DeathBadConsequence extends NumericBadConsequence{
    
   
 
    private boolean muerte  = false;
    public DeathBadConsequence(String text, boolean death) {
       super( text, Player.MAXLEVEL, BadConsequence.MAXTREASURES, BadConsequence.MAXTREASURES);
       super.levels=1;

       muerte = death;
        
    }
    @Override
    public BadConsequence adjustToFitTreasureList(ArrayList<Treasure> v, ArrayList<Treasure> h){      
       
        super.setnHiddenTreasures(BadConsequence.MAXTREASURES);
        super.setnHiddenTreasures(BadConsequence.MAXTREASURES);
        //super.adjustToFitTreasureList(v, h);
        BadConsequence badconsequence = new DeathBadConsequence(text,true);
        return badconsequence; 
    }
    
    
    
    
}
