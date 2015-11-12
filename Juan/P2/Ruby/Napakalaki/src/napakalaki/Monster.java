package napakalaki;

/**
 *
 * @author juane
 * @version 2.1
 * Clase Monster
 */
public class Monster {
      
    /* Atributos propios de la clase*/
    
    private String name; // nombre del monstruo
    private int combatLevel; // nivel de combate del monstruo

    /* Atributo de tipo Prize y BadConsequence */
    private Prize prize;
    private BadConsequence badConsequence;
    
    /* Constructor*/
    
    Monster(String name, int level, BadConsequence bc, Prize price){
        
        this.name = name;
        this.combatLevel = level;
        this.badConsequence = bc;
        this.prize = price;
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
     * Método getBadConsequence()
     * Devuelve el mal royo
     * @return badConsequence de tipo BadConsequence
     */
    public BadConsequence getBadConsequence(){
        return this.badConsequence; 
    }
    
    /**
     * Método getLevelsGained()
     * @return 
     */
    public int getLevelsGained(){
        return prize.getLevel(); //cambiar
    }
    
    /**
     * Método getTreasuresGained()
     * @return 
     */
    public int getTreasuresGained(){
        return prize.getTreasures(); //cambiar
    }
    /**
     * Método getPrice()
     * Devuelve el buen royo
     * @return  price de tipo Prize
     */
//    public Prize getPrice() {
//        return prize;
//    }

       
    
    /**
     * Método toString
     * @return 
     */
    @Override
    public String toString() {
        return "Monster = " + this.name + ", combatLevel = " 
                +  this.combatLevel + ", Price: " +  this.prize 
                + ", " + this.badConsequence ;
    }
}
