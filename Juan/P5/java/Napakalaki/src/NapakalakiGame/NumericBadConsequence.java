
package NapakalakiGame;

import java.util.ArrayList;

/**
 *
 * @author juane
 */
public class NumericBadConsequence extends BadConsequence{
    
    private int nVisibleTreasures; // número de tesoros visibles que si pierden
    private int nHiddenTreasures; // número de tesoros ocultos que se pierden
    private boolean death;

    public NumericBadConsequence(String text, int levels, int nVisible, int nHidden) {
        super(text, levels);
        nVisibleTreasures = nVisible;
        nHiddenTreasures = nHidden;
    }
    
    
    @Override
    public boolean isEmpty(){
        
        if(nHiddenTreasures==0 && nVisibleTreasures==0 && this.death == false ){
            return true;
        }
        else
            return false; 
    }
    
    @Override
    public int geNVisibleTreasures() {
        return nVisibleTreasures;
    }
    
    @Override
    public int getNHiddenTreasures() {
        return nHiddenTreasures;
    }
    
    @Override
    public BadConsequence adjustToFitTreasureList(ArrayList<Treasure> v, ArrayList<Treasure> h) {
        NumericBadConsequence badConsequence;
        
        
        int tamV = v.size();
        int tamH = h.size();
        int nuevoV;
        int nuevoO;

        int nVisibleAux = nVisibleTreasures;
        int nHiddenAux = nHiddenTreasures;

        // Para los tesoros visibles
        if(nVisibleAux < tamV)
            nuevoV = nVisibleAux;
        else
            nuevoV=tamV;
        
        // Para los tesoros ocultos
        if(nHiddenAux < tamH)
            nuevoO=nHiddenAux;
        else
            nuevoO=tamH;
        
         badConsequence = new NumericBadConsequence(text, levels, nuevoV, nuevoO);
         return badConsequence;
        
    } 

    
    
    @Override
    public String toString() {
        return "NumericBadConsequence{" 
                + "BadConsequence = " +  this.text 
                + ", levels = " +  this.levels
                + ", death = " +  this.death
                + "nVisibleTreasures=" + nVisibleTreasures 
                + ", nHiddenTreasures=" + nHiddenTreasures + '}';
    }
    
    
}
