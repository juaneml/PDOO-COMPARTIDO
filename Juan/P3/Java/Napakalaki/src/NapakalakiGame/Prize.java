package NapakalakiGame;

/**
 *
 * @author juane
 * @version 3.1
 * Clase Prize para el buen rollo
 */
public class Prize {
    
    /* Atributos  */
    
    private int treasures;
    private int level;

    /**
     * Constructor
     */
    
    /**
     * Constructor Prize(int t, int l)
     * @param t número de tesoros
     * @param l número de niveles
     */
    Prize(int t, int l) {
        this.treasures = t;
        this.level = l;
    }

    /**
     * Consultores
     */
    
    /**
     * Método getTreasures()
     * Devuelve el número de tesoros
     * @return treasures de tipo int
     */
    public int getTreasures() {
        return this.treasures;
    }

    /**
     * Método getLevel()
     * Devuelve el número de niveles
     * @return level de tipo int
     */
    public int getLevels() {
        return this.level;
    }

    @Override
    public String toString() {
        return "Treasures = " + Integer.toString(this.treasures) 
                + ", levels = " + Integer.toString(this.level) ;
    }
}
