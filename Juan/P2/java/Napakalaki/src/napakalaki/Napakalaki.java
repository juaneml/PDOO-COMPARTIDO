
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author juane
 * @version 2.1
 * clase singleton
 */
public class Napakalaki {
    private static final Napakalaki instance = null;
    
    /**
     * Constructor privado
     */
    private Napakalaki(){
        
    }
    /**
     * Método initPlayers(ArrayList<String> names
     * @param names 
     */
    private void initPlayers(ArrayList<String> names){
        
    }
    
    /**
     * Método nextPlayer
     * @return 
     */
    private Player nextPlayer(){
        return null; //cambiar
    }
    
    /**
     * Método nextTurnAllowed()
     * @return 
     */
    private boolean nextTurnAllowed(){
        return false; //cambiar
    }
    
    /**
     * Método setEnemies()
     */
    private void setEnemies(){
        
    }
    
    
    /**
     * Método getInstance()
     * @return 
     */
    public static Napakalaki getInstance(){
        return instance;
    }
    
    /**
     * Método developCombat()
     * @return 
     */
    public CombatResult developCombat(){
        return null; //cambiar
    }
    
    /**
     * Método discardVisibleTreasures(ArrayList<Treasure> treasures)
     * @param treasures 
     */
    public void discardVisibleTreasures(ArrayList<Treasure> treasures){
        
    }
    
    /**
     * Método discardHiddenTreasures(ArrayList<Treasure> treasures)
     * @param treasures 
     */
    public void discardHiddenTreasures(ArrayList<Treasure> treasures){
        
    }
    
    /**
     * Método makeTreasuresVisible(ArrayList<Treasure> treasures)
     * @param treasures 
     */
    public void makeTreasuresVisible(ArrayList<Treasure> treasures){
        
    }
    
    /**
     * Método initGame(ArrayList<String> players)
     * @param players 
     */
    public void initGame(ArrayList<String> players){
        
    }
    
    /**
     * Método getCurrentPlayer()
     * @return 
     */
    public Player getCurrentPlayer(){
        return null; //cambiar
    }
    
    /**
     * Método getCurrentMonster()
     * @return 
     */
    
    public Monster getCurrentMonster(){
        return null;
    }
    
    /**
     * Método nextTurn()
     * @return 
     */
    public boolean nextTurn(){
        return false; // cambiar
    }
    
    /**
     * Método endOfGame(CombatResult result)
     * @param result
     * @return 
     */
    public boolean endOfGame(CombatResult result){
        return false; // cambiar
    }
}
