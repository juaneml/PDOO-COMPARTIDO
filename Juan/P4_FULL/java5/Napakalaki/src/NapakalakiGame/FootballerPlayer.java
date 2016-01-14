

//EXAMEN

package NapakalakiGame;



/**
 *
 * @author juane
 */


public class FootballerPlayer extends Player{
    
    //Constructor
    public FootballerPlayer(String name) {
        super(name);
    }

    //NO puede robar
    @Override
    protected boolean canYouGiveMeAtreasure() {
        return false;
    }
    
    
    //no puede convertirse en sectario
    @Override
    protected boolean shouldConvert(){        
        return  false;
    }
    
    

    @Override
    public int getCombatLevel(){
       int sum_bonus = 0;
       int nivel;      
        
        for(int i=0; i < this.getVisibleTreasures().size();i++){            
            
            sum_bonus = this.getVisibleTreasures().get(i).getBonus()+sum_bonus;
            
        }
        
            nivel = this.getLevels() - sum_bonus;
        
        return nivel;
    }
    
    @Override
   protected Player getEnemy(){
       return this.enemy;
    }
   
   @Override
   protected int getOponentLevel(Monster m){
        return m.getCombatLevel();
    } 
   
    @Override
    public String toString(){
         return this.getName()+ " "+"Con nivel " + " "+ getCombatLevel() + " juego al fútbol: " ;
          
    }        
}
//FIN EXAMEN