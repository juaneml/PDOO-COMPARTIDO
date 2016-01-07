package napakalaki;

/**
 *
 * @author juane
 * @version 2.1
 * Clase Prize para el buen rollo
 */
public class Prize {
    
    /* Atributos  */
    
    private int treasures;
    private int level;

    /**
     * Constructor
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
     *
     * @return treasures de tipo int
     */
    public int getTreasures() {
        return this.treasures;
    }

    /**
     * Método getLevel()
     *
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
