package napakalaki;

import java.util.Random;

/**
 *
 * @author juane
 * @version 3.1
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
     * Crea un número aleatorio entre 1-6
     * @return 
     */
    public int nextNumber(){
        Random rand = new Random();
        int numero = rand.nextInt(6)+1;
        
        return numero; 
        
    }
}
