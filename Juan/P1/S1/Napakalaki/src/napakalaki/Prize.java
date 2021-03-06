package napakalaki;

/**
 *
 * @author juane
 * @version 1.0
 *
 * Clase Prize para el buen rollo
 */
public class Prize {

    private int treasures;
    private int level;

    /**
     * Constructor
     */
    Prize(int treasures, int level) {
        this.treasures = treasures;
        this.level = level;
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
    public int getLevel() {
        return this.level;
    }

    @Override
    public String toString() {
        return "Treasures = " + Integer.toString(treasures) 
                + ", levels = " + Integer.toString(level) ;
    }
    
}
