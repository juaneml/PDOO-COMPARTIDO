package napakalaki;

/**
 *
 * @author juane
 * @version 2.1
 */
public class Dice {
    private static final Dice instance = null;
    
    /**
     * Constructor
     */
    private Dice(){
        
    }
    /**
     * Método getInstance()
     * @return 
     */
    public static Dice getInstance(){
        return instance;
    }
    
    /**
     * Método nextNumber()
     * @return 
     */
    public int nextNumber(){
        return 0; //cambiar
        
    }
}
