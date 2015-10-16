
package napakalaki;

/**
 *
 * @author juane
 * @version 1.0
 * 
 * Clase Monster
 */
public class Monster {
    
    /* Atributos propios de la clase*/
    
    private String name; // nombre del monstruo
    private int combatLevel; // nivel de combate del monstruo

    /* Atributo de tipo Prize y BadConsequence */
    private Prize price;
    private BadConsequence bc;
    
    /* Constructor*/
    
    Monster(String name, int level, BadConsequence bc, Prize price){
        
        this.name = name;
        this.combatLevel = level;
        this.bc = bc;
        this.price = price;
    }
    
    /**
     * Método getName()
     * Devuelve el nombre del monstruo
     * @return name de tipo int
     */
    public String getName() {
        return name;
    }

    /**
     * Método getCombatLevel()
     * Devuelve el nivel de combate del monstruo
     * @return 
     */
    public int getCombatLevel() {
        return combatLevel;
    }
    
    /**
     * Método toString
     * @return 
     */
    @Override
    public String toString() {
        return "Monster = " + name + ", combatLevel = " 
                +  combatLevel + ", Price: " +  price 
                + ", " + bc ;
    }
    
    
}
