package napakalaki;

/**
 *
 * @author juane
 */
public class Treasure {
    /**
     * Atributos
     */
    private String name;
    private int bonus;
    private TreasureKind treasure;
    
     /** Constructor ***/
    
    public Treasure(String n ,int b, TreasureKind t) {
        this.name = n;
        this.bonus = b;
        this.treasure =t;
    }

   
   
    /*********** Métodos ****************/
    
    /**
     * Método getName()
     * @return 
     */
    
    public String getName() {
        return name;
    }
    
    /**
     * Método getBonus()
     * @return 
     */
     public int getBonus() {
        return bonus;
     }
     
     /**
      * Método getType()
      * @return 
      */
     public TreasureKind getType(){
         return treasure;
     }

    
     
     
    
}
