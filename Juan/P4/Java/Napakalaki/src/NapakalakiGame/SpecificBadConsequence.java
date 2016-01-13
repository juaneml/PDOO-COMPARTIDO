/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

import java.util.ArrayList;

/**
 *
 * @author juane
 */
public class SpecificBadConsequence extends BadConsequence{
    
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();

    public SpecificBadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible,
            ArrayList<TreasureKind> tHidden) {
        super(text, levels);
        specificVisibleTreasures = tVisible;
        specificHiddenTreasures = tHidden;
    }
    
    @Override
    public boolean isEmpty(){
        
        if(     this.specificVisibleTreasures.isEmpty() 
                && this.specificHiddenTreasures.isEmpty()){
            return true;
        }
        else
            return false; 
    }
    
    @Override
    public ArrayList<TreasureKind> getSpecificHiddenTreasures() {
        return specificHiddenTreasures;
    }
    
    @Override
    public ArrayList<TreasureKind> getSpecificVisibleTreasures() {
        return specificVisibleTreasures;
    }
    
    @Override
    public void substractVisibleTreasure(Treasure t){
        specificVisibleTreasures.remove(t);
    }
    
    @Override
    public void substractHiddenTreasure(Treasure t){
        specificHiddenTreasures.remove(t);
    }
    
    @Override
    public BadConsequence adjustToFitTreasureList(ArrayList<Treasure> v, ArrayList<Treasure> h) {
        int tamV = v.size();
        int tamH = h.size();

        ArrayList<Treasure> vaux = new ArrayList(v); //Para no tocar el valor de v
        ArrayList<Treasure> haux = new ArrayList(h); //Para no tocar el valor de h
        
        ArrayList<TreasureKind> copiaV = new ArrayList(specificVisibleTreasures);
        ArrayList<TreasureKind> copiaH = new ArrayList(specificHiddenTreasures);
        
        ArrayList<TreasureKind> nuevoV = new ArrayList();
        ArrayList<TreasureKind> nuevoH = new ArrayList();
        
        SpecificBadConsequence badConsequence; 
        
        
        //Para tesoros visibles V2
        for(TreasureKind listav : copiaV){//El mal rollo
            for(Treasure listajv : vaux){//lo que tenemos en el array
                if(listav == listajv.getType()){
                    nuevoV.add(listav);
                    vaux.remove(listajv);
                }
            }
        }
        
        //Para tesoros ocultos V2
        for(TreasureKind listah : copiaH){//El mal rollo
            for(Treasure listajh : haux){//lo que tenemos en el array
                if(listah == listajh.getType()){
                    nuevoV.add(listah);
                    vaux.remove(listajh);
                }
            }
        }
             
        badConsequence = new SpecificBadConsequence(text, levels, nuevoV, nuevoH);
        return badConsequence;
        
    }
    
       
    @Override
    public String toString() {
        return "BadConsequence = " +  this.text 
                + ", levels = " +  this.levels
                + ", specificVisibleTreasures = " +  this.specificVisibleTreasures 
                + ", specificHiddenTreasures = " +  this.specificHiddenTreasures  ;
    }
}
