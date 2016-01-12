package NapakalakiGame;

/**
 *
 * @author juane
 * @version 2.1
 * Clase Monster
 */
public class Monster {
    //private static numMonster; contar el numero de objetos
    /* Atributos propios de la clase*/
    
    private String name; // nombre del monstruo
    private int combatLevel; // nivel de combate del monstruo
    private int levelChangeAgainstCultistPlayer = 0;

    /* Relaciones atributo de tipo Prize y BadConsequence */
    private Prize prize; 
    private BadConsequence badConsequence;
     
    /* Constructor*/
    
    /**
     * Constructor  Monster(String n, int l, BadConsequence b, Prize p)
     * @param n Nombre del monstruo
     * @param l nivel del monstruo
     * @param b mal royo
     * @param p buen royo
     */
    Monster(String n, int l, BadConsequence b, Prize p){
        
        this.name = n;
        this.combatLevel = l;
        this.badConsequence = b;
        this.prize = p;
        this.levelChangeAgainstCultistPlayer=0;
    }
    
    Monster(String n, int l, BadConsequence b, Prize p, int IC){
        this.name = n;
        this.combatLevel = l;
        this.badConsequence = b;
        this.prize = p;
        this.levelChangeAgainstCultistPlayer = IC;
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

    public int getCombatLevelAgainstCultistPlayer() {
        return levelChangeAgainstCultistPlayer + combatLevel;
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
     * Devuelve el número de niveles ganados proporcionados por su buen rollo
     * @return 
     */
    public int getLevelsGained(){         
        
        return this.prize.getLevels(); 
    }
    
    /**
     * Método getTreasuresGained()
     * Devuelve el número de tesoros ganados proporcionados por su buen rollo
     * @return 
     */
    public int getTreasuresGained(){        
        
        return this.prize.getTreasures(); 
    }
    
    
//    
//    /**
//     * Método getPrice()
//     * Devuelve el buen royo
//     * @return  price de tipo Prize
//     */
//    public Prize getPrice() {
//        return price;
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
