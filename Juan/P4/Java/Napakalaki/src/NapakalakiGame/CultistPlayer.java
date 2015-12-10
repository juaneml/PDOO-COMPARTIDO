/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NapakalakiGame;

/**
 *
 * @author Raul
 */
public class CultistPlayer extends Player {
    
    private static int totalCultistPlayers = 0;
    private Cultist myCultistCard;
    
    CultistPlayer(Player p, Cultist c){
        super(p);
        this.totalCultistPlayers = this.totalCultistPlayers + 1;
        this.myCultistCard = c;
    }
    
    @Override
    protected int getCombatLevel() {
        return 5;
    }
    
    @Override
    protected int getOponentLevel(Monster m){
        return 5;
    }
    
    @Override
    protected boolean shouldConvert(){
        return true;
    }
    
    private Treasure giveMeATreasure(){
        
    }
    
    private void canYouGiveMeATreasure(){
        
    }
    
    public int getTotalCultistPlayers(){
        
    }
    
    
    
    
}
