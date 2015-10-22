/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package napakalaki;

/**
 *
 * @author Raul
 */
public class Monster {
    private String name;
    private int combatLevel;
    Prize prize;
    BadConsequence badconsequence;

    public Monster(String name, int combatLevel,  BadConsequence bc,Prize price) {
        this.name = name;
        this.combatLevel = combatLevel;
        this.prize = price;
        this.badconsequence = bc;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCombatLevel() {
        return combatLevel;
    }

    public void setCombatLevel(int combatLevel) {
        this.combatLevel = combatLevel;
    }

    public Prize getPrize() {
        return prize;
    }

    public BadConsequence getBadconsequence() {
        return badconsequence;
    }
    
    

    @Override
    public String toString() {
        return "Monster{" + "name=" + name + ", combatLevel=" + Integer.toString(combatLevel) + ", prize=" + prize + ", badconsequence=" + badconsequence + '}';
    }

   
    
    
    
}
