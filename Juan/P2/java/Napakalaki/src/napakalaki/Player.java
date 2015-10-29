package napakalaki;

/**
 *
 * @author juane
 * @version 2.1
 */
public class Player {
    /** Atributos de la clase
     * 
     */
    private String name;
    private int level;
    private boolean dead = true;
    private boolean canISteal = true;

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
        
    }
    
    /**
     * Método getCombatLevel()
     * @return el nivel de combate del jugador
     */
    private int getCombatLevel() {
        return this.level;
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
        return 0; //cambiar
    }
    
    /**
     * Método dielfNoTreasures()
     */
    private void dielfNoTreasures (){
        
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
    public Treasure[] getHiddenTreasures(){
        return null; //cambiar
    }
    /**
     * Método getVisibleTreasures()     * 
     * @return un array con los tesoros visibles
     */
    public Treasure[] getVisibleTreasures(){
        return null; //cambiar
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
        return false; //cambiar
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
        return 0; //cambiar
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
    public void setEnemy(Player enemy){
        
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
        return false; // cambiar
    }
    /**
     * Método canYouGiveMeAtreasure()
     * @return 
     */
    private boolean canYouGiveMeAtreasure(){
        return false; // cambiar
    }
    
    /**
     * Método haveStolen()
     */
    private void haveStolen(){
        
    }
    
    /**
     * Método discardAllTreasures()
     */
    public void discardAllTreasures(){
        
    }
            
}
