/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author Raul
 */
public class BadConsequence {
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();

    public BadConsequence(String text, int levels, int nVisibleTreasures, int nHiddenTreasures) {
        this.text = text;
        this.levels = levels;
        this.nVisibleTreasures = nVisibleTreasures;
        this.nHiddenTreasures = nHiddenTreasures;
        this.death=false;
        this.specificHiddenTreasures= new ArrayList();
        this.specificVisibleTreasures= new ArrayList();
    }

    public BadConsequence(String text, boolean death) {
        this.text = text;
        this.death = death;
    }

    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden) {
        this.text = text;
        this.levels = levels;
        this.specificVisibleTreasures = tVisible;
        this.specificHiddenTreasures = tHidden;
    }
    
    

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getnVisibleTreasures() {
        return nVisibleTreasures;
    }

    public void setnVisibleTreasures(int nVisibleTreasures) {
        this.nVisibleTreasures = nVisibleTreasures;
    }

    public int getnHiddenTreasures() {
        return nHiddenTreasures;
    }

    public void setnHiddenTreasures(int nHiddenTreasures) {
        this.nHiddenTreasures = nHiddenTreasures;
    }

    public ArrayList<TreasureKind> getSpecificHiddenTreasures() {
        return specificHiddenTreasures;
    }

    public ArrayList<TreasureKind> getSpecificVisibleTreasures() {
        return specificVisibleTreasures;
    }
    
    
    public boolean isDeath() {
        return death;
    }

    public void setDeath(boolean death) {
        this.death = death;
    }
      
  
    
    @Override
    public String toString() {
        
        if(specificVisibleTreasures.isEmpty()==false || specificHiddenTreasures.isEmpty()==false){
            return "BadConsequence{" + "text=" + text + ", levels=" + Integer.toString(levels) + ", nVisibleTreasures=" + specificVisibleTreasures
                + ", nHiddenTreasures=" +specificHiddenTreasures + ", Death=" + Boolean.toString(death) +  '}';//
        }
        else
        {
           
            return "BadConsequence{" + "text=" + text + ", levels=" + Integer.toString(levels) + ", nVisibleTreasures=" + Integer.toString(nVisibleTreasures) 
                + ", nHiddenTreasures=" + Integer.toString(nHiddenTreasures) + ", Death=" + Boolean.toString(death) +  '}';//
        }
        
        
        
    }
          
    
    
}
