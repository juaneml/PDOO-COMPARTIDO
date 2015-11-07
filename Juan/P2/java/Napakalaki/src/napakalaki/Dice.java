package napakalaki;

import java.util.Random;

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
         int numero;
         Random rnd = new Random();
         
         numero=(rnd.nextInt()*6 + 1);
         
         return numero;
        
    }
}
