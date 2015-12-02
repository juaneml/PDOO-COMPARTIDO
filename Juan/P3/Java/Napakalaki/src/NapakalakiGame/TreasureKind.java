
package NapakalakiGame;

/**
 *
 * @author juane
 * @version 3.1
 * Enumerado TreasureKind para especificar
 * los tipos de tesoros existentes.
 */
public enum TreasureKind {
     ARMOR, ONEHAND, BOTHHANDS, HELMET, SHOES;
     
     
     @Override
    public String toString() {

        
        if(this.equals(TreasureKind.ARMOR)){
            return "ARMOR";
        }
             
        else if(this.equals(TreasureKind.ONEHAND)){
            return "ONEHAND";
        }
        else if(this.equals(TreasureKind.BOTHHANDS)){
            return "BOTHHANDS";
        }
        else if(this.equals(TreasureKind.HELMET)){
            return "HELMET";
            
        }
        else if(this.equals(TreasureKind.SHOES)){
            return "SHOES";
        }
        
        else
            return "HAY UN ERROR";
        
    }
}
