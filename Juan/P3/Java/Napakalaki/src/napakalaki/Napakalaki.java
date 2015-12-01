package napakalaki;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author juane
 * @version 3.1 clase singleton
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

            return currentPlayer;
            
        } else {
            for (int i = 0; i < players.size(); i++) {
                if (currentPlayer == players.get(i)) {
                    if (i == players.size() - 1) ///////si falla mirara aquí
                    {
                        currentPlayer = players.get(0);
                    } else {
                        currentPlayer = players.get(i + 1);
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
    private boolean nextTurnAllowed() {

        boolean next = false;

        if (this.currentPlayer.validState()) {
            next = true;
        }

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
     */
    public CombatResult developCombat() {

        CombatResult combatResult = this.currentPlayer.combat(this.currentMonster);

        return combatResult;
    }

    /**
     * Método discardVisibleTreasures(ArrayList<Treasure> treasures)
     *
     * @param treasures
     */
    public void discardVisibleTreasures(ArrayList<Treasure> treasures) {
        for (Treasure t : treasures) {
            this.currentPlayer.discardVisibleTreasure(t);

            this.dealer.giveTreasureBack(t);
        }
    }

    /**
     * Método discardHiddenTreasures(ArrayList<Treasure> treasures)
     *
     * @param treasures
     */
    public void discardHiddenTreasures(ArrayList<Treasure> treasures) {
        for (Treasure t : treasures) {
            this.currentPlayer.discardHiddenTreasure(t);

            this.dealer.giveTreasureBack(t);
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
        this.dealer.initCards();
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
        stateOK = this.nextTurnAllowed();  
             
        
        if (stateOK) {
            boolean dead;
            this.currentMonster = this.dealer.nextMonster();
            this.currentPlayer = this.nextPlayer();
            dead = this.currentPlayer.isDead();

            if (dead) {
                this.currentPlayer.initTreasures();
            }
        }
        stateOK = this.currentPlayer.validState(); //PODRIA SER ASÍ
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
