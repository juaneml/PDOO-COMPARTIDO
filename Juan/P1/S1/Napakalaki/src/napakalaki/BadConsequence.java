package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author juane
 * @version 1.0
 *
 * Clase BadConsequence para el mal rollo del monstruo
 */
public class BadConsequence {

    /**
     * Atributos propios de la clase *
     */

    private String text; //lo que dice el mal royo
    private int levels; // niveles que se pierden
    private int nVisibleTreasures; // número de tesoros visibles que si pierden
    private int nHiddenTreasures; // número de tesoros ocultos que se pierden
    private boolean death; // representa un mal royo de tipo muerte

    /**
     * Atributos d tipo lista de TreasureKind *
     */
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();

    /**
     * constructores *
     */
    BadConsequence(String text, int levels, int nVisible, int nHidden) {
        this.text = text;
        this.levels = levels;
        this.nVisibleTreasures = nVisible;
        this.nHiddenTreasures = nHidden;
    }

    BadConsequence(String text, boolean death) {
        this.text = text;
        this.death = death;
    }

    BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible,
            ArrayList<TreasureKind> tHidden) {
        this.text = text;
        this.levels = levels;
        this.specificVisibleTreasures = tVisible;
        this.specificHiddenTreasures = tHidden;
    }

    /** Consultores **/

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
    public int getnVisibleTreasures() {
        return this.nVisibleTreasures;
    }

    /**
     * Método getnHiddenTreasures() 
     * Devuelve el número de tesoros ocultos que se
     * pierden
     *
     * @return nHiddenTreasures de tipo int
     */
    public int getnHiddenTreasures() {
        return this.nHiddenTreasures;
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
     * Método toString()
     * @return 
     */
    @Override
    public String toString() {
        return "BadConsequence = " +  text + ", levels = " +  levels 
                + ", nVisibleTreasures = "  + nVisibleTreasures 
                + ", nHiddenTreasures = " +  nHiddenTreasures 
                + ", death = " +  death + ", specificHiddenTreasures = " 
                +  specificHiddenTreasures + ", specificVisibleTreasures = " 
                +  specificVisibleTreasures ;
    }
    
    
}
