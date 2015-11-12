/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    private TreasureKind type;
    
    
     /** Constructor ***/
    
    public Treasure(String n ,int b, TreasureKind t) {
        this.name = n;
        this.bonus = b;
        this.type =t;
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
         return type;
     }

    @Override
    public String toString() {
        return "Treasure{" + "name=" + name + ", bonus=" + bonus + ", treasure=" + type + '}';
    }

    
     
     
    
}
