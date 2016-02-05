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
public class Cultist {
    
    /* Atributos*/
    
    private String name;
    private int gainedLevels;
    
    /* Constructor */
    
    /**
     * Constructor
     * @param name String
     * @param gainedLevels int
     */
    
    Cultist(String name, int gainedLevels){
        this.name=name;
        this.gainedLevels=gainedLevels;        
    }

    /**
     * Método getGainedLevels()
     * @return gainedLevels de tipo int
     */
    
    public int getGainedLevels() {
        return gainedLevels;
    }
    
    
    
}
