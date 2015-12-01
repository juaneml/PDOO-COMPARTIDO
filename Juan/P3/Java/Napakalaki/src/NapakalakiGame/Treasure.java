
package NapakalakiGame;

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
     * @param bonus entero
     * @param t TreasureKind
     
     **/
    
    public Treasure(String n,int bonus, TreasureKind t) {
        this.name = n;
        this.bonus = bonus;
        this.type = t;
    }

   
   
    /*********** Métodos ****************/
    
    /**
     * Método getName()
     * Devuelve el nombre
     * @return name String
     */
    
    public String getName() {
        return name;
    }
    
    /**
     * Método getBonus()
     * Devuelve los bonus
     * @return bonus int
     */
     public int getBonus() {
        return bonus;
     }
     
     /**
      * Método getType()
      * Devuelve el tipo de TreasureKind
      * @return TreasureKind
      */
     public TreasureKind getType(){
         return this.type;
     }

    
     
     
    
}
