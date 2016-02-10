package NapakalakiGame;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author juane
 * @version 3.1 clase singleton
 */
public class Napakalaki {

    private static final Napakalaki instance = new Napakalaki();

    /* Relaciones con las clases */
    private Monster currentMonster ; // Relación con los monstruos    
    private CardDealer dealer = CardDealer.getInstance() ; // Relación con CardDealer
    private Player currentPlayer; // Relación con Player
    private ArrayList<Player> players = new ArrayList(); // Relación con Player

    /**
     * Constructor privado
     */
    private Napakalaki() {

    }

    /**
     * Método initPlayers(ArrayList<String> names
     *
     * @param names
     */
    private void initPlayers(ArrayList<String> names) {
        for (String n : names) {
            this.players.add(new Player(n));
        }
    }

    /**
     * Método nextPlayer Decide qué jugador es el siguiente en jugar.
     *
     * @return
     */
    private Player nextPlayer() {
       
       
        if (currentPlayer == null) {
            Random rand = new Random();
            int numero = rand.nextInt(players.size());

            currentPlayer = players.get(numero);
            ArrayList<Player> aux = new ArrayList();

            aux.add(currentPlayer);

            for (Player p : players) {
                if (p != currentPlayer) {
                    aux.add(p);
                }
            }
            players = aux;
            
            
            this.currentPlayer = aux.get(numero);
            return currentPlayer;
            
        } 
        else {
            boolean cambiado = false;
            for (int i = 0; i < players.size() && !cambiado; i++) {
               if(currentPlayer == players.get(i)){
                    if (i == players.size() - 1) ///////si falla mirar aquí
                    {
                        System.out.print("vuelve al primero" + i);
                        currentPlayer = players.get(0);
                        cambiado=true;
                    } 
                    else {
                        System.out.print("Entra al segundo" + i);
                        currentPlayer = players.get(i + 1);
                        cambiado=true;
                    }
                
                
                }
                
            }

            return currentPlayer;
        }
    }

    /**
     * Método nextTurnAllowed()
     *
     * @return
     */
   private boolean nextTurnIsAllowed() {

        boolean next = false;
        if(currentPlayer == null)
            next = true;
        else{
//            if (this.currentPlayer.validState()) {
//                next = true;
            next = this.currentPlayer.validState();
                return next;
            }
//            else{
//                return next;
//            }
        return next;
        }
      

    /**
     * Método setEnemies()
     */
    private void setEnemies() {

        Player enemigo = players.get(0);

        Random rand = new Random();
        for (Player p : players) {
            do {
                int numero = rand.nextInt(players.size());
                enemigo.setEnemy(players.get(numero));

            } while (enemigo.enemy == p);
        }

    }

    /**
     * Método getInstance()
     *
     * @return
     */
    public static Napakalaki getInstance() {
       
        return instance;
    }

    /**
     * Método developCombat()
     *
     * @return
     * @throws java.lang.CloneNotSupportedException
     */
    public CombatResult developCombat() {

        CombatResult combatResult = this.currentPlayer.combat(this.currentMonster);
        if (combatResult == CombatResult.LOSEANDCONVERT){
            
            CultistPlayer cultistPlayer = new CultistPlayer(currentPlayer,dealer.nextCultist());
            
            for(int i=0; i< players.size(); i++){
                if(players.get(i) == currentPlayer){
                   players.add(i, cultistPlayer);
                   players.remove(players.get(i+1));
                    
                    
                }
                if(players.get(i).enemy == currentPlayer)
                    players.get(i).enemy = cultistPlayer;
                    
            }
             currentPlayer = cultistPlayer;
        }
       
        return combatResult;
    }

    /**
     * Método discardVisibleTreasures(ArrayList<Treasure> treasures)
     *
     * @param treasures
     */
    public void discardVisibleTreasures(ArrayList<Treasure> treasures) {
        
        if (currentPlayer.getVisibleTreasures() != null && treasures != null){
            for (Treasure t : treasures) {
                this.currentPlayer.discardVisibleTreasure(t);

                this.dealer.giveTreasureBack(t);
            }
        }
    }

    /**
     * Método discardHiddenTreasures(ArrayList<Treasure> treasures)
     *
     * @param treasures
     */
    public void discardHiddenTreasures(ArrayList<Treasure> treasures) {
        if(currentPlayer.getVisibleTreasures() !=null && treasures != null){
            for (Treasure t : treasures) {
                this.currentPlayer.discardHiddenTreasure(t);

                this.dealer.giveTreasureBack(t);
            }
        }
    }

    /**
     * Método makeTreasuresVisible(ArrayList<Treasure> treasures)
     *
     * @param treasures
     */
    public void makeTreasuresVisible(ArrayList<Treasure> treasures) {

        for (Treasure t : treasures) {
            this.currentPlayer.makeTreasureVisible(t);
        }
    }

    /**
     * Método initGame(ArrayList<String> players)
     *
     * @param players
     */
    public void initGame(ArrayList<String> players) {
        
        this.initPlayers(players);
        this.setEnemies();
        dealer.initCards();
        this.nextTurn();
        

    }

    /**
     * Método getCurrentPlayer()
     *
     * @return
     */
    public Player getCurrentPlayer() {

        return this.currentPlayer; //cambiar
    }

    /**
     * Método getCurrentMonster()
     *
     * @return
     */
    public Monster getCurrentMonster() {
        return this.currentMonster;
    }

    /**
     * Método nextTurn()
     *
     * @return
     */
    public boolean nextTurn() {
        //MIRAR
        boolean stateOK;
        stateOK = this.nextTurnIsAllowed();

        System.out.print(" nextTurn stateOK\n");
        if (stateOK) {
            boolean dead;
            this.currentMonster = this.dealer.nextMonster();
            this.currentPlayer = this.nextPlayer();
            dead = this.currentPlayer.isDead();
            System.out.print(" Entra stateOK\n");
            if (dead) {
                System.out.print(" Entra Esta muerto\n");
                this.currentPlayer.initTreasures();
            }
        } //stateOK = this.currentPlayer.validState(); //PODRIA SER ASÍ
        else {
            this.currentMonster = this.dealer.nextMonster();
        }
        return stateOK;
    }

    /**
     * Método endOfGame(CombatResult result)
     *
     * @param result
     * @return
     */
    public boolean endOfGame(CombatResult result) {

        boolean end = false;
        if (result.equals(CombatResult.WINGAME)) {
            end = true;
        }

        return end;
    }
}
