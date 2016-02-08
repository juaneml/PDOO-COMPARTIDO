
package NapakalakiGame;

import java.util.ArrayList;

/**
 *
 * @author juane
 */
public class NumericBadConsequence extends BadConsequence{
    
    private int nVisibleTreasures; // número de tesoros visibles que si pierden
    private int nHiddenTreasures; // número de tesoros ocultos que se pierden


    public NumericBadConsequence(String text, int levels, int nVisible, int nHidden) {
        super(text, levels);
        nVisibleTreasures = nVisible;
        nHiddenTreasures = nHidden;
    }
    
    
    @Override
    public boolean isEmpty(){
        
        if(nHiddenTreasures==0 && nVisibleTreasures==0 ){
            return true;
        }
        else
            return false; 
    }
    
    
    public int geNVisibleTreasures() {
        return nVisibleTreasures;
    }
    
    
    public int getNHiddenTreasures() {
        return nHiddenTreasures;
    }
    
      /**
     * Método substractVisibleTreasure(Treasure t)
     * @param t 
     */
    @Override
    public void substractVisibleTreasure(Treasure t){
        
        for (int i=0;i<this.nVisibleTreasures;i++){            
                if(nVisibleTreasures>0)
            this.nVisibleTreasures--;
        }
    }
    
    /**
     * Método  substractHiddenTreasure(Treasure t)
     * @param t 
     */
    @Override
    public void substractHiddenTreasure(Treasure t){
        //this.specificHiddenTreasures.remove(t);
        
        for (int i=0;i<this.nHiddenTreasures;i++){
           if(nHiddenTreasures>0)
            this.nHiddenTreasures--;
        }       
    }
    
    @Override
    public BadConsequence adjustToFitTreasureList(ArrayList<Treasure> v, ArrayList<Treasure> h) {
        NumericBadConsequence badConsequence;
        
        int nuevoV = nVisibleTreasures;
        int nuevoO = nHiddenTreasures;
        
        int nVisibleAux = nVisibleTreasures;
            int nHiddenAux = nHiddenTreasures;
        if (v.size() > 0) {
            int tamV = v.size();
            

            // Para los tesoros visibles
            if (nVisibleAux <= tamV) {
                nuevoV = nVisibleAux;
            } else if (tamV > nVisibleAux) {
                nuevoV = tamV;
            }
        }
        if (h.size() > 0) {
            int tamH = h.size();
            // Para los tesoros ocultos
            if (nHiddenAux <= tamH) {
                nuevoO = nHiddenAux;
            } else if (tamH > nVisibleAux) {
                nuevoO = tamH;
            }

        }
         badConsequence = new NumericBadConsequence(text, levels, nuevoV, nuevoO);
         return badConsequence;
        
    } 

    
    
    @Override
    public String toString() {
        return "NumericBadConsequence{" 
                + super.toString()
                + "nVisibleTreasures=" + nVisibleTreasures 
                + ", nHiddenTreasures=" + nHiddenTreasures + '}';
    }
    
    
}
