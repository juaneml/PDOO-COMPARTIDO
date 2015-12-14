/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NapakalakiGame;

import java.util.Random;

/**
 *
 * @author Raul
 */
public class CultistPlayer extends Player {
    
    private static int totalCultistPlayers = 0;
    private Cultist myCultistCard;
    
    CultistPlayer(Player p, Cultist c){
        super(p);
        this.myCultistCard = c;
        this.totalCultistPlayers = this.totalCultistPlayers + 1;
    }
    
    @Override
    protected int getCombatLevel() {
        int suma;
        double veintexciento;
        
        veintexciento = super.getCombatLevel()*0.2;
        
        suma = super.getCombatLevel() + (int)veintexciento + myCultistCard.getGainedLevels();
        return suma;
    }
    
    @Override
    protected int getOponentLevel(Monster m){
        return m.getCombatLevelAgainstCultistPlayer();
    }
    
    @Override
    protected boolean shouldConvert(){
        return false;
    }
    
    private Treasure giveMeATreasure(){
        Random rand = new Random();
        int numero = rand.nextInt(visibleCultist.size()-1); 
        
        return  visibleCultist.get(numero);
    }
    
    @Override
    protected boolean canYouGiveMeAtreasure(){
        if(!enemy.getVisibleTreasures().isEmpty())
            return true;
        
        else
           return false;
           
    }

    public static int getTotalCultistPlayers() {
        return totalCultistPlayers;
    }
    
  
    
    
    
    
}
