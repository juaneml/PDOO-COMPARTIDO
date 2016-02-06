
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
       // this.specificVisibleTreasures.remove(t);
    }
    
    /**
     * Método  substractHiddenTreasure(Treasure t)
     * @param t 
     */
    @Override
    public void substractHiddenTreasure(Treasure t){
        //this.specificHiddenTreasures.remove(t);
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
<<<<<<< HEAD
        return  super.getText()+"NumericBadConsequence{" 
                +  this.text 
                + ", levels = " +  this.levels
                + ", death = " +   this.death
=======
        return "NumericBadConsequence{" 
                + super.toString()
>>>>>>> origin/master
                + "nVisibleTreasures=" + nVisibleTreasures 
                + ", nHiddenTreasures=" + nHiddenTreasures + '}';
    }
    
    
}
