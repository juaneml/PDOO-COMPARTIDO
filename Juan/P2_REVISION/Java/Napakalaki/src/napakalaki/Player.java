package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author juane
 * @version 2.1
 */
public class Player {
    static final int MAXLEVEL = 10; // <<constant>>
    Player enemy; //Relación asímismo 
    
    /*Relaciones */
    private ArrayList<Treasure> hiddenTreasures = new ArrayList();
    private ArrayList<Treasure> visibleTreasures = new ArrayList();
    private BadConsequence pendingBadConsequence = null;
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
        this.level = 1;
        this.dead = false;
        this.canISteal = false;
        
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
        this.dead = false;
    }
    
    /**
     * Método getCombatLevel()
     * @return el nivel de combate del jugador
     * Recorremos el array con el número de tesoros visibles para añadirles el bonus
     */
    private int getCombatLevel() {
        int sum_bonus = 0;
        for(int i=0; i < this.visibleTreasures.size();i++){
            sum_bonus = visibleTreasures.get(i).getBonus()+sum_bonus;
        }
        this.level = level+sum_bonus;
        return this.level;
        
    }
    /**
     * Método incrementLevels
     * @param l 
     */
    private void incrementLevels( int l){
        this.level = this.level+l;
    }
    
    /**
     * Método decrementLevels
     * @param l 
     */
    private void decrementLevels (int l){
        if(this.level >= 1){
            this.level = this.level -l;
        }
    }
    
    /**
     * Método setPendingBadConsequence(BadConsequence b)
     * @param b 
     */
    private void setPendingBadConsequence(BadConsequence b){
        this.pendingBadConsequence = b;
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
     * Recorremos el array con los tesoros visibles
     * si el tipo de tesoro se encuentra en el array de
     * tesoros visibles incrementamos la variable local de
     * la función num, si no tenemos ese tipo devuelve 0
     * @param tKind
     * @return numero de tesoros visiblees de tipo @param tKind
     */
    private int howManyVisibleTreasures(TreasureKind tKind){
        
        int num = 0;
        
        for (Treasure t: visibleTreasures){
            if(t.getType() == tKind)
                num++;
        }
        return num;
    }
    
    /**
     * Método dielfNoTreasures()
     */
    private void dielfNoTreasures (){
        
        if(this.visibleTreasures.isEmpty() && this.hiddenTreasures.isEmpty())
            this.dead = true;
                
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
        
        boolean valid;
        
        if(this.pendingBadConsequence.isEmpty() && this.hiddenTreasures.size()<4){
            valid = true;
        }
                    
        else
            valid = false;
        
        return valid; 
    }
    
    /**
     * Método initTreasures()
     */
    public void initTreasures(){
        
    }
    
    /**
     * Método getLevels()
     * Devulve el nivel del jugador
     * @return level
     */
    public int getLevels(){
        
        return this.level; 
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
     * Asigna valor al atributo que referencia al enemigo 
     * del jugador
     * @param enemy 
     */
    public void setEnemy(Player enemy){
        this.enemy = enemy;
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
     * Devuelve true si el jugador tiene tesoros para 
     * ser robados por otro jugador 
     * false en caso contrario
     * @return 
     */
    private boolean canYouGiveMeAtreasure(){
      
        if(!this.hiddenTreasures.isEmpty())
            return true;
        
        else
           return false;
                    
          
    }
    
    /**
     * Método haveStolen()
     * Cambia el atributo CanISteal a false
     * cuando el jugador roba un tesoro
     */
    private void haveStolen(){
        if(!this.hiddenTreasures.isEmpty())
            this.canISteal = false;
        
    }
    
    /**
     * Método discardAllTreasures()
     */
    public void discardAllTreasures(){
        
    }
            
}
