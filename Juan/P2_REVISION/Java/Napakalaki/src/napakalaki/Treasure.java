
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
    
    
    /* Relación */
    
    TreasureKind type; //Relación TreasureKind
    
     /** Constructor **/
    
    /**
     * Constructor que recibe como parámetros
     * @param n String
     * @param g entero
     * @param bonus entero
     * @param t TreasureKind
     
     **/
    
    public Treasure(String n,int bonus, TreasureKind t) {
        this.name = name;
        this.bonus = bonus;
        this.type = t;
    }

   
   
    /*********** Métodos ****************/
    
    /**
     * Método getName()
     * Devuelve el nombre
     * @return 
     */
    
    public String getName() {
        return name;
    }
    
    /**
     * Método getBonus()
     * Devuelve los bonus
     * @return 
     */
     public int getBonus() {
        return bonus;
     }
     
     /**
      * Método getType()
      * Devuelve el tipo de TreasureKind
      * @return 
      */
     public TreasureKind getType(){
         return this.type;
     }

    
     
     
    
}
