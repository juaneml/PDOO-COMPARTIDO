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
        this.level=1;
        this.dead=false;
        this.canISteal=false;
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
        
        int sum_bonus=0;
        for(int i=0; i< visibleTreasures.size();i++)
        {
            sum_bonus= visibleTreasures.get(i).getBonus()+sum_bonus;
        }
        level =level + sum_bonus;
       
       return level;
    }
    /**
     * Método incrementLevels
     * @param l 
     */
    private void incrementLevels( int l){
        level = level +l;
    }
    
    /**
     * Método decrementLevels
     * @param l 
     */
    private void decrementLevels (int l){
        if(level >1)
        {
            level = level -l;
        }
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
        int num =0;
        
        for(Treasure t: visibleTreasures){
            if(t.getType() == tKind)
                num++;
        }
         
        return num;
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
      return false;
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
        if(hiddenTreasures.isEmpty())
            canISteal=false;
        else
            canISteal=true;
    }
    
    /**
     * Método discardAllTreasures()
     */
    public void discardAllTreasures(){
        
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", level=" + level + ", dead=" + dead + ", canISteal=" + canISteal + ", enemy=" + enemy + ", hiddenTreasures=" + hiddenTreasures + ", visibleTreasures=" + visibleTreasures + ", pendingBadConsequence=" + pendingBadConsequence + '}';
    }

   
            
    
}
