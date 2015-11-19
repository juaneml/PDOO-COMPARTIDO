package napakalaki;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author juane
 * @version 3
 * clase singleton
 */
public class Napakalaki {
    private static final Napakalaki instance = null;
    
    /* Relaciones con las clases */
    
    private Monster currentMonster; // Relación con los monstruos    
    private CardDealer dealer; // Relación con CardDealer
    private Player currentPlayer; // Relación con Player
    private ArrayList<Player> players = new ArrayList(); // Relación con Player
    
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
        for(String n : names){
           this.players.add(new Player(n));
        }
    }
    
    /**
     * Método nextPlayer
     * Decide qué jugador es el siguiente en jugar.
     * @return 
     */
    private Player nextPlayer(){
       //DUDA
        return null; //cambiar
    }
    
    /**
     * Método nextTurnAllowed()
     * @return 
     */
    private boolean nextTurnAllowed(){
      
        boolean next = false;
        
        if(this.currentPlayer.validState())
            next = true; 
        
        return next;
    }
    
    /**
     * Método setEnemies()
     */
    private void setEnemies(){
       //DUDAS
        
        Random rand = new Random();
        int numero = rand.nextInt(4)+1;
        
       
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
        Monster m = this.currentMonster;
        CombatResult combatResult = this.currentPlayer.combat(m);
        
        return combatResult; 
    }
    
    /**
     * Método discardVisibleTreasures(ArrayList<Treasure> treasures)
     * @param treasures 
     */
    public void discardVisibleTreasures(ArrayList<Treasure> treasures){
        for( Treasure t: treasures){
            this.currentPlayer.discardVisibleTreasure(t);
        
            this.dealer.giveTreasureBack(t);
        }
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
        
        for(Treasure t: treasures){
            this.currentPlayer.makeTreasureVisible(t);
        }
    }
    
    /**
     * Método initGame(ArrayList<String> players)
     * @param players 
     */
    public void initGame(ArrayList<String> players){
        this.initPlayers(players);
        this.setEnemies();
        this.dealer.initCards();
        this.nextTurn();
        
    }
    
    /**
     * Método getCurrentPlayer()
     * @return 
     */
    public Player getCurrentPlayer(){
        
        return this.currentPlayer; //cambiar
    }
    
    /**
     * Método getCurrentMonster()
     * @return 
     */
    
    public Monster getCurrentMonster(){
        return this.currentMonster;
    }
    
    /**
     * Método nextTurn()
     * @return 
     */
    public boolean nextTurn(){
        //MIRAR
        boolean stateOK = this.nextTurnAllowed();
       
        
        //stateOK = this.currentPlayer.validState();
        if(stateOK){            
          boolean dead;
          this.currentMonster = this.dealer.nextMonster();
          this.currentPlayer = this.nextPlayer();
          dead = this.currentPlayer.isDead();
          
          if(dead){
              this.currentPlayer.initTreasures();
          }
        }
        return stateOK; 
    }
    
    /**
     * Método endOfGame(CombatResult result)
     * @param result
     * @return 
     */
    public boolean endOfGame(CombatResult result){
       
       boolean end = false;
        if(result.equals(CombatResult.WINGAME))
            end = true;
        
        return end; 
    }
}
