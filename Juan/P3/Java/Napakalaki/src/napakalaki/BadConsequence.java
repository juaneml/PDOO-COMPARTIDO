package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author juane
 * @version 2.1
 * 
 * Clase BadConsequence para el mal rollo del monstruo
 */
public class BadConsequence {
   /* si no se pone nada visibilidad de package*/ 
   /*constante*/
   static final int MAXTREASURES = 10;
    /**
     * Atributos propios de la clase *
     */

    private String text; //lo que dice el mal royo
    private int levels; // niveles que se pierden
    private int nVisibleTreasures; // número de tesoros visibles que si pierden
    private int nHiddenTreasures; // número de tesoros ocultos que se pierden
    private boolean death; // representa un mal royo de tipo muerte

    /**
     * Atributos de tipo lista de TreasureKind *
     */
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();

    /**
     * constructores 
     * Todos los atributos hay que inicializarlos
     */
    BadConsequence(String text, int levels, int nVisible, int nHidden) {
        this.text = text;
        this.levels = levels;
        this.nVisibleTreasures = nVisible;
        this.nHiddenTreasures = nHidden;
        this.death = false;
        this.specificVisibleTreasures = new ArrayList();
        this.specificVisibleTreasures = new ArrayList();
    }

    BadConsequence(String text, boolean death) {
        this.text = text;
        this.death = death;
        this.levels = 0;
        this.nVisibleTreasures = 10;
        this.nHiddenTreasures = 10; 
        this.specificVisibleTreasures = new ArrayList();        
        this.specificHiddenTreasures  = new ArrayList();
       
        
    }

    BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible,
            ArrayList<TreasureKind> tHidden) {
        this.text = text;
        this.levels = levels;
        this.nVisibleTreasures = 10; // valor por defecto que no va a a ser nunca así
        this.nHiddenTreasures = 10;
        this.death = false;
        this.specificVisibleTreasures = tVisible;
        this.specificHiddenTreasures = tHidden;
    }

    /** Consultores **/

    /**
     * Método isEmpty()
     * @return 
     */
    public boolean isEmpty(){
        
        if(this.nHiddenTreasures==0 && this.nVisibleTreasures==0 
                && this.death == false
                && this.specificVisibleTreasures.isEmpty() 
                && this.specificHiddenTreasures.isEmpty()){
            return true;
        }
        else
            return false; 
    }
    
     /**
     * Método getLevels() 
     * Devuelve los niveles que se pierden
     *
     * @return levels de tipo int
     */
    public int getLevels() {
        return this.levels;
    }
    
    /**
     * Método getnVisibleTreasures() 
     * Devuelve el número de tesoros visibles que
     * si pierden
     *
     * @return nVisibleTreasures de tipo int
     */
    public int geNVisibleTreasures() {
        return this.nVisibleTreasures;
    }
    
    /**
     * Método getnHiddenTreasures() 
     * Devuelve el número de tesoros ocultos que se
     * pierden
     *
     * @return nHiddenTreasures de tipo int
     */
    public int getNHiddenTreasures() {
        return this.nHiddenTreasures;
    }
    
    /**
     * Método getSpecificHiddenTreasures()
     * Devuelve una lista con los Tesoros Ocultos
     * @return specificHiddenTreasures de tipo ArrayList
     */
    public ArrayList<TreasureKind> getSpecificHiddenTreasures() {
        return specificHiddenTreasures;
    }

    /**
     * Método getSpecificVisibleTreasures
     * Devuelve una lista con los Tesoros Visibles
     * @return specificVisibleTreasures de tipo ArrayList
     */
    public ArrayList<TreasureKind> getSpecificVisibleTreasures() {
        return specificVisibleTreasures;
    }
    
    /**
     * Método substractVisibleTreasure(Treasure t)
     * @param t 
     */
    public void substractVisibleTreasure(Treasure t){
        this.specificVisibleTreasures.remove(t);
    }
    
    /**
     * Método  substractHiddenTreasure(Treasure t)
     * @param t 
     */
    public void substractHiddenTreasure(Treasure t){
        this.specificHiddenTreasures.remove(t);
    }
    
    /**
     * Método adjustToFitTreasureList(ArrayList<Treasure> v,ArrayList<Treasure> h)
     * @param v
     * @param h
     * @return 
     */
    public BadConsequence adjustToFitTreasureList(ArrayList<Treasure> v, ArrayList<Treasure> h) {
        BadConsequence badconsecuence = null;
        Treasure t;
        TreasureKind te;
        if( v.size() > 0 || h.size() > 0 ){
            
            for (Treasure visible : v){
                if(visible.type == TreasureKind.ARMOR){
                    
                
            }
        }
//
//        if (nVisibleTreasures != 0 || nHiddenTreasures != 0) {
//            badconsecuence = new BadConsequence(text, levels, Math.min(v.size(), this.nVisibleTreasures),
//                    Math.min(h.size(), this.nHiddenTreasures));
//        } else {
//            /*                            Visibles                                */
//
//            //Copia de specificVisibleTreasures del Badconsequence
//            ArrayList<TreasureKind> ttvbs = new ArrayList();
//            ArrayList<TreasureKind> bs_visibles = new ArrayList();
//
//            for (TreasureKind tvBadStuff : specificVisibleTreasures) {
//                ttvbs.add(tvBadStuff);
//            }
//
//            for (Treasure tvp : v) {
//                if (ttvbs.contains(tvp.getType())) {
//                    bs_visibles.add(tvp.getType());
//                    ttvbs.remove(tvp.getType());
//                }
//            }
//            /*                            Ocultos                                 */
//
//            //Copia de specificHiddenTreasures del BadStuff:
//            ArrayList<TreasureKind> tthbs = new ArrayList();
//            ArrayList<TreasureKind> bs_ocultos = new ArrayList();
//
//            for (TreasureKind thBadStuff : specificHiddenTreasures) {
//                tthbs.add(thBadStuff);
//            }
//
//            for (Treasure thp : h) {
//                if (tthbs.contains(thp.getType())) {
//                    bs_ocultos.add(thp.getType());
//                    tthbs.remove(thp.getType());
//                }
//            }
//
//           badconsecuence = new BadConsequence(text, 0, bs_visibles, bs_ocultos);
//        }
        }
        return badconsecuence;
    
    }

    
    /**
     * Método getText() 
     * Devuelve lo que dice el mal royo
     *
     * @return text de tipo String
     */
    public String getText() {
        return this.text;
    }

   

    /**
     * Método isDeath() Devuelve true o false del mal royo de tipo muerte
     *
     * @return death de tipo boolean
     */
    public boolean isDeath() {
        return death;
    }

    

    /**
     * Método toString()
     * @return 
     */
    @Override
    public String toString() {
        return "BadConsequence = " +  this.text + ", levels = " +  this.levels 
                + ", nVisibleTreasures = "  + this.nVisibleTreasures 
                + ", nHiddenTreasures = " +  this.nHiddenTreasures 
                + ", death = " +  this.death + ", specificVisibleTreasures = " 
                +  this.specificVisibleTreasures + ", specificHiddenTreasures = " 
                +  this.specificHiddenTreasures  ;
    }
}
