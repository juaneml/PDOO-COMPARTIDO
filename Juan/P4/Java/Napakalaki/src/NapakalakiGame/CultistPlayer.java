
package NapakalakiGame;

import java.util.Random;

/**
 *
 * @author Raul
 */
public class CultistPlayer extends Player {
    
    /* Atributo */
    private static int totalCultistPlayers = 0;
    
    /* Relación */
    private Cultist myCultistCard;
    
    /*Constructor */
    
    /**
     * CultisPlayer(Player p, Cultist c)
     * @param p de tipo Player
     * @param c de tipo Cultist
     */
    CultistPlayer(Player p, Cultist c){
        super(p);
        this.myCultistCard = c;
        this.totalCultistPlayers = this.totalCultistPlayers + 1;
    }
    
    /**
     * Método getCombatLevel()
     * Devuelve la suma del combate
     * @return suma
     */
    
    @Override
    protected int getCombatLevel() {
        int suma;
        double veintexciento;
        
        veintexciento = super.getCombatLevel()*0.2;
        
        suma = super.getCombatLevel() + (int)veintexciento + myCultistCard.getGainedLevels();
        return suma;
    }
    
    /**
     * Método getOpenentLevel(Monster m)
     * Devuelve el nivel del oponente
     * @param m Monster
     * @return int
     */
    @Override
    protected int getOponentLevel(Monster m){
        Monster aux = m;
        return aux.getCombatLevelAgainstCultistPlayer();
    }
    
    /**
     * Método  shouldConvert()
     * Se obtiene el valor boolean de la clase player de
     * lanzar el dado y devolverá true si
     * se obtiene un 1 y false en caso contrario
     * @return boolean
     */
    @Override
    protected boolean shouldConvert(){        
        return  super.shouldConvert();
    }
    /**
     * Método giveMeAtreasure()
     * Devuelve un tesoro
     * @return 
     */
    @Override
     protected Treasure giveMeAtreasure(){
        Random rand = new Random();
        int numero = rand.nextInt(super.visibleCultist.size()-1); 
        
        return  super.visibleCultist.get(numero);
    }
    /**
     * Método canYouGiveMeAtreasure()
     * Devuelve true si tiene tesoros visibles
     * el enemigo, false en caso contrario
     * @return true or false
     */
    @Override
    protected boolean canYouGiveMeAtreasure(){
        if(!super.enemy.getVisibleTreasures().isEmpty())
            return true;
        
        else
           return false;
           
    }
    /**
     * Método getTotalCultistPlayers()
     * Devuelve el número total de CultistPlayers
     * @return totalCultistPlayers int
     */
    public static int getTotalCultistPlayers() {
        return totalCultistPlayers;
    }
    
  
    
    
    
    
}
