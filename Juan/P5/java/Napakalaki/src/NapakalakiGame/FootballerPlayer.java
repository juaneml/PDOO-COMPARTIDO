

//EXAMEN

package NapakalakiGame;



/**
 *
 * @author juane
 */


public class FootballerPlayer extends Player{
    
    //Constructor , correcto
    public FootballerPlayer(String name) {
        super(name);
    }

    
    //SERIA no pude robar
    @Override
    public boolean canISteal(){
        return false;
    }
    
    //NO puede robar
//    @Override
//    protected boolean canYouGiveMeAtreasure() {
//        return false;
//    }
//    
    
    //no puede convertirse en sectario
    
    
    @Override    
    protected boolean shouldConvert(){        
        return  false;
    }
    
    
    //SERIA MAS O MENOS
    
    @Override
    public int getCombatLevel(){
      return  super.getCombatLevel() - super.getLevels();
    }

//    @Override
//    public int getCombatLevel(){
//       int sum_bonus = 0;
//       int nivel;      
//        
//        for(int i=0; i < this.getVisibleTreasures().size();i++){            
//            
//            sum_bonus = this.getVisibleTreasures().get(i).getBonus()+sum_bonus;
//            
//        }
//        
//            nivel = this.getLevels() - sum_bonus;
//        
//        return nivel;
//    }
    
    // SOBRA
//    
//    @Override
//   protected Player getEnemy(){
//       return this.enemy;
//    }
//   
//   @Override
//   protected int getOponentLevel(Monster m){
//        return m.getCombatLevel();
//    } 
   
   //la solución seria
    @Override
   public String toString(){
       return super.toString() + " " + " juego al fútbol ";
   }
   
//    @Override
//    public String toString(){
//         return this.getName()+ " "+"Con nivel " + " "+ getCombatLevel() + " juego al fútbol: " ;
//          
//    }        
}
//FIN EXAMEN