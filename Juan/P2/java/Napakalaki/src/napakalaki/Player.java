package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author juane
 * @version 2.1
 */
public class Player {
    /** Atributos de la clase
     * 
     */
    ///private static const int maxlevel = 10;  Esto como es?
    private static final int MAXLEVEL = 10;
    private String name;
    private int level;
    private boolean dead = true;
    private boolean canISteal = true;
    
    private int bonusLevel;
    private boolean robado=false;
    /**
     * Atributos referencales
     */

     private Player enemy;
     private ArrayList<Treasure> hiddenTreasures;
     private ArrayList<Treasure> visibleTreasures;
     private BadConsequence pendingBadConsequence;
     //DICE, CardDealer y Combat Resutl?
     
    /* Constructor */
    
    public Player(String name) {
        this.name = name;
    }

    /**
     * Método getName()
     * @return el nombre del jugador
     */
    public String getName(){
        return  this.name;
    }
    
    /**
     * Método bringToLife()
     */
    private void bringToLife(){
        this.dead=false;
    }
    
    /**
     * Método getCombatLevel()
     * @return el nivel de combate del jugador
     */
    private int getCombatLevel() {
        return level = level + bonusLevel ;
    }
    /**
     * Método incrementLevels
     * @param l 
     */
    private void incrementLevels( int l){
        
    }
    
    /**
     * Método decrementLevels
     * @param l 
     */
    private void decrementLevels (int l){
        
    }
    
    /**
     * Método setPendingBadConsequence(BadConsequence b)
     * @param b 
     */
    private void setPendingBadConsequence(BadConsequence b){
        pendingBadConsequence =b;
    }
    
    /**
     * Método applyPrize(Monster m)
     * @param m 
     */
    private void applyPrize(Monster m){
        
    }
    
    /**
     * Método applyBadConsequence(Monster m)
     * @param m 
     */
    private void applyBadConsequence (Monster m){
        
    }
    
    /**
     * Método canMakeTreasureVisible(Treasure t)
     * @param t
     * @return 
     */
    private boolean canMakeTreasureVisible(Treasure t){
        return false; //cambiar
    }
    
    /**
     * Método howManyVisibleTreasures (TreasureKind tKind)
     * @param tKind
     * @return 
     */
    private int howManyVisibleTreasures(TreasureKind tKind){
        return visibleTreasures.size(); //cambiar
    }
    
    /**
     * Método dielfNoTreasures()
     */
    private void dielfNoTreasures (){
        if(hiddenTreasures.isEmpty() && visibleTreasures.isEmpty())
            this.dead =true;
    }
    
    /**
     * Método isDead()
     * @return true si está muerto o false en caso contrario
     */
    public boolean isDead(){
        return this.dead; 
    }
    
    /**
     * Método getHiddenTreasures()
     * @return un array con los tesoros ocultos
     */
    public ArrayList<Treasure> getHiddenTreasures(){
        return hiddenTreasures; //cambiar
    }
    /**
     * Método getVisibleTreasures()     * 
     * @return un array con los tesoros visibles
     */
    public ArrayList<Treasure> getVisibleTreasures(){
        return visibleTreasures; //cambiar
    }
    
    /**
     * Método CombatResult combat (Monster m)
     * @param m
     * @return 
     */
    public CombatResult combat(Monster m){
        return null; //cambiar
    }
    
    /**
     * Método makeTreasureVisible(Treasure t)
     * @param t 
     */
    public void makeTreasureVisible(Treasure t){
        
    }
    
    /**
     * Método discardVisibleTreasure(Treasure t)
     * @param t 
     */
    public void discardVisibleTreasure (Treasure t){
        
    }
    
    /**
     * Método discardHiddenTreasure(Treasure t)
     * @param t 
     */
    public void discardHiddenTreasure(Treasure t){
        
    }
    
    /**
     * Método validState()
     * @return 
     */
    public boolean validState(){
        if( hiddenTreasures.size()<= 4 && pendingBadConsequence.isEmpty())
            return true;
        else 
            return false;
    }
    
    /**
     * Método initTreasures()
     */
    public void initTreasures(){
        
    }
    
    /**
     * Método getLevels()
     * @return 
     */
    public int getLevels(){
        return level; //cambiar
    }
    
    /**
     * Método stealTreasure()
     * @return 
     */
    public Treasure stealTreasure(){
        return null; //cambiar
    }
    
    /**
     * Método setEnemy(Player enemy)
     * @param enemy 
     */
    public void setEnemy(Player enemigo){
        enemy = enemigo;
    }
    
    /**
     * Método giveMeAtreasure()
     * @return 
     */
    private Treasure giveMeAtreasure(){
        return null; // cambiar
    }
    
    /**
     * Método canISteal()
     * @return 
     */
    public boolean canISteal(){
        if(!robado)
          return canISteal=true;
        else
           return canISteal=false;
    }
    /**
     * Método canYouGiveMeAtreasure()
     * @return 
     */
    private boolean canYouGiveMeAtreasure(){
        if(!hiddenTreasures.isEmpty())
            return true;
        else
            return false;
    }
    
    /**
     * Método haveStolen()
     */
    private void haveStolen(){
        if(robado)
            canISteal=false;
    }
    
    /**
     * Método discardAllTreasures()
     */
    public void discardAllTreasures(){
        
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", level=" + level + ", dead=" + dead + ", canISteal=" + canISteal + ", bonusLevel=" + bonusLevel + ", robado=" + robado + ", enemy=" + enemy + ", hiddenTreasures=" + hiddenTreasures + ", visibleTreasures=" + visibleTreasures + ", pendingBadConsequence=" + pendingBadConsequence + '}';
    }
            
    
}
