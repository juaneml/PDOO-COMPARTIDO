package NapakalakiGame;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author juane
 * @version 3.1
 */
public class Player {
    static final int MAXLEVEL = 10; // <<constant>>
    Player enemy; //Relación asímismo 
    
    /*Relaciones */
    private ArrayList<Treasure> hiddenTreasures = new ArrayList();
    private ArrayList<Treasure> visibleTreasures = new ArrayList();
    private BadConsequence pendingBadConsequence ;
    /** Atributos de la clase
     * 
     */
    private String name;
    private int level;
    private boolean dead = true;
    private boolean canISteal = true;

    /* Constructor */
    
    /**
     * Constructor Player(String name)     * 
     * @param name nombre del jugador
     */
    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.dead = false;
        this.canISteal = false;
        this.visibleTreasures = new ArrayList();
        this.hiddenTreasures = new ArrayList();
        this.pendingBadConsequence = new BadConsequence(" ", 0, 0, 0);
        
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
     * @return el nivel de combate del jugador.
     * Recorremos el array con el número de tesoros visibles para añadirles el bonus.
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
     * @param l incrementa l niveles
     */
    private void incrementLevels( int l){
        this.level = this.level+l;
    }
    
    /**
     * Método decrementLevels
     * @param l decrementa l niveles
     */
    private void decrementLevels (int l){
        if(this.level > 1){
            this.level = this.level -l;
        }
    }
    
    /**
     * Método setPendingBadConsequence(BadConsequence b)
     * @param b BadConsequence mal royo.
     */
    private void setPendingBadConsequence(BadConsequence b){
        this.pendingBadConsequence = b;
    }
    
    /**
     * Método applyPrize(Monster m)
     * @param m Monster
     */
    private void applyPrize(Monster m){
        int nLevels = m.getLevelsGained();
        this.incrementLevels(nLevels);   
        int nTreasures = m.getTreasuresGained();
               
        CardDealer dealer;
        Treasure treasure;         
        
        if (nTreasures > 0){
            dealer = CardDealer.getInstance();
        
            for (int i = 1;i<nTreasures;i++){
                treasure = dealer.nextTreasure();
                this.hiddenTreasures.add(treasure);
            }
        }
    }
    
    /**
     * Método applyBadConsequence(Monster m)
     * @param m Monster
     */
    private void applyBadConsequence (Monster m){
        BadConsequence badConsequence;
        BadConsequence pendingBad;
        badConsequence = m.getBadConsequence();
        int nLevels = badConsequence.getLevels();        
        this.decrementLevels(nLevels);
        
        pendingBad = badConsequence.adjustToFitTreasureList(hiddenTreasures, hiddenTreasures);
        this.setPendingBadConsequence(pendingBad);
    }
    
    /**
     * Método canMakeTreasureVisible(Treasure t)
     * @param t Treasure
     * @return true si puede hacer los tesoros ocultos a visibles
     */
    private boolean canMakeTreasureVisible(Treasure t){
        boolean puede=false;
        
        if(t.getType()== TreasureKind.ONEHAND ){
            int numero=0;
            int numerob=0;
            for(Treasure taux : visibleTreasures){
                if(taux.getType() == TreasureKind.ONEHAND){
                    numero++;
                }
                if(taux.getType() == TreasureKind.BOTHHANDS)
                    numerob++;
            }
            if(numero<2 && numerob == 0)
                puede=true;                
        }
        
        if(t.getType()== TreasureKind.BOTHHANDS ){
            int numero=0;
            int numerob=0;
            for(Treasure taux : visibleTreasures){
                if(taux.getType() == TreasureKind.ONEHAND){
                    numero++;
                }
                if(taux.getType() == TreasureKind.BOTHHANDS)
                    numerob++;
            }
            if(numero==0 && numerob == 0)
                puede=true;                
        }
        
        if(t.getType()== TreasureKind.ARMOR ){
            int numero=0;            
            for(Treasure taux : visibleTreasures){
                if(taux.getType() == TreasureKind.ARMOR){
                    numero++;
                }
            }
            if(numero==0)
                puede=true;                
        }
        
        if(t.getType()== TreasureKind.HELMET ){
            int numero=0;
            for(Treasure taux : visibleTreasures){
                if(taux.getType() == TreasureKind.HELMET){
                    numero++;
                }
            }
            if(numero==0)
                puede=true;                
        }
        
        if(t.getType()== TreasureKind.SHOES ){
            int numero=0;
            for(Treasure taux : visibleTreasures){
                if(taux.getType() == TreasureKind.SHOES){
                    numero++;
                }
            }
            if(numero==0)
                puede=true;                
        }
        
        
        return puede;
    }
    
    /**
     * Método howManyVisibleTreasures (TreasureKind tKind)
     * Recorremos el array con los tesoros visibles
     * si el tipo de tesoro se encuentra en el array de
     * tesoros visibles incrementamos la variable local de
     * la función num, si no tenemos ese tipo devuelve 0
     * 
     * @param tKind TreasureKind
     * @return número de tesoros visiblees de tipo tKind
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
     * Si el número de tesoros visibles y tesoros
     * ocultos está vacio el jugador muere
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
    public ArrayList<Treasure> getHiddenTreasures(){
        
       // return this.hiddenTreasures; 
        return null;
    }
    /**
     * Método getVisibleTreasures()     * 
     * @return un array con los tesoros visibles
     */
    
    public ArrayList<Treasure> getVisibleTreasures(){
       
        /** Sería asi pero no ha sido dicho en el guión*/
//        int tam = this.visibleTreasures.size();
//        Treasure [] v_visible  = new Treasure [tam];
//            return v_visible;
        return null;
        
    }
    
    /**
     * Método CombatResult combat (Monster m)
     * @param m Monster
     * @return Devuelve el resultado del combate
     */
    public CombatResult combat(Monster m){
        int myLevel = this.getCombatLevel(); // 1.1.1
        int monsterLevel;
        CombatResult combatResult;
        CardDealer dealer = CardDealer.getInstance();
        Monster currentMonster = m;
        monsterLevel = currentMonster.getCombatLevel();
        
        if(myLevel > monsterLevel){
            this.applyPrize(m);
                       
            if(this.getLevels() >= MAXLEVEL)
                combatResult = CombatResult.WINGAME;
            else
                combatResult = CombatResult.WIN;
        }
            
        else{
            this.applyBadConsequence(m);
            combatResult = CombatResult.LOSE;
        }
        
        return combatResult; 
    }
    
    /**
     * Método makeTreasureVisible(Treasure t)
     * Hace los tesoros visibles.
     * @param t de tipo treasure.
     */
    public void makeTreasureVisible(Treasure t){
        boolean canI = this.canMakeTreasureVisible(t);
        
        if (canI){
            this.visibleTreasures.add(t);
            this.hiddenTreasures.remove(t);
        }
            
    }
    
    /**
     * Método discardVisibleTreasure(Treasure t)
     * Descarta los tesoros visibles.
     * @param t de tipo treasure
     */
    public void discardVisibleTreasure (Treasure t){
        this.visibleTreasures.remove(t);
        
        if((this.pendingBadConsequence != null ) && (!this.pendingBadConsequence.isEmpty())){
            this.pendingBadConsequence.substractVisibleTreasure(t);
        }
        
        this.dielfNoTreasures();
    }
    
    /**
     * Método discardHiddenTreasure(Treasure t)
     * Descarta los tesoros ocultos.
     * @param t Treasure
     */
    public void discardHiddenTreasure(Treasure t){
        this.hiddenTreasures.remove(t);
        
        if((this.pendingBadConsequence != null ) && (!this.pendingBadConsequence.isEmpty())){
            this.pendingBadConsequence.substractVisibleTreasure(t);
        }
        
        this.dielfNoTreasures();
    }
    
    /**
     * Método validState()
     * @return true  si pendingBandConsequence y hiddenTreasures está vacio
     * false en caso contrario
     */
    public boolean validState(){
          
        boolean valid = false;
        

        if(this.pendingBadConsequence.isEmpty()  && this.hiddenTreasures.size()<= 4 ){
          valid = true;
            return valid;
        }
                    
        else
           return valid;
        
    }
    
    /**
     * Método initTreasures()
     * Crea una instancia con CardDealer
     * Crea una instancia con Dice
     * 
     */
    public void initTreasures(){
        CardDealer dealer = CardDealer.getInstance();
        Dice dice = Dice.getInstance();
        Treasure treasure;
        int number;
        this.bringToLife();
        
        treasure = dealer.nextTreasure();
        this.hiddenTreasures.add(treasure);
        number = dice.nextNumber();
        
        
        
        if( number > 1 ){
           
                treasure = dealer.nextTreasure();
                this.hiddenTreasures.add(treasure);
            
        }
        
        if (number == 6){
            
                treasure = dealer.nextTreasure();
                this.hiddenTreasures.add(treasure);
            
            
        }
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
       Treasure treasure = null; 
       boolean canI = this.canISteal();
       boolean canYou;
       this.canISteal = canI;
        
        if(canI){
            canYou = this.enemy.canYouGiveMeAtreasure();
            if(canYou){
                treasure = this.enemy.giveMeAtreasure();
                this.hiddenTreasures.add(treasure);
                this.haveStolen();
                
        }       
         return treasure;   
       }
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
    private Treasure giveMeAtreasure() {

        Treasure tesoro;
        Random rand = new Random();
        int numero = rand.nextInt(this.hiddenTreasures.size());
        tesoro = this.hiddenTreasures.get(numero);

        return tesoro;
    }
    
    /**
     * Método canISteal()
     * @return 
     */
    public boolean canISteal(){
        return false; //cambiar
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
        else
            this.canISteal = true;
    }
    
    /**
     * Método discardAllTreasures()
     */
    public void discardAllTreasures() {
        for (Treasure t : this.visibleTreasures) {
            this.discardVisibleTreasure(t);
        }
        for (Treasure t : this.hiddenTreasures) {
            this.discardHiddenTreasure(t);
        }
    }

    @Override
    public String toString() {
       // return "Player{" + "enemy=" + enemy + ", hiddenTreasures=" + hiddenTreasures + ", visibleTreasures=" + visibleTreasures + ", pendingBadConsequence=" + pendingBadConsequence + ", name=" + name + ", level=" + level + ", dead=" + dead + ", canISteal=" + canISteal + '}';
        return "Player: " + this.name + " Nivel: " + this.level;
    }
            
}
