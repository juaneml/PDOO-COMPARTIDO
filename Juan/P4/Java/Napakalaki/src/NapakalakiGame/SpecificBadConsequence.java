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
        BadConsequence badConsequence; 

        if (tamV > 0 || tamH > 0) { // Si los vectores que recibimos tienen cosas entramos aqui

//            ///si los arrays de tesoros especificos a perder estan vacíos entramos
//            if (this.specificHiddenTreasures.isEmpty() && this.specificVisibleTreasures.isEmpty()) {
//
//                //si perdemos un numero de ocultos o visibles mayor de lo que tenemos
//                if (this.nHiddenTreasures > 0 || this.nVisibleTreasures > 0) {
//
//                    //y se pierden más de lo que tenemos de uno u otro 
//                    if (nVisibleTreasures > v.size() || nHiddenTreasures > h.size()) {
//
//                        //Puede darse que se pierdan mas de los visibles pero los otros no
//                        if (nVisibleTreasures > v.size() && nHiddenTreasures <= h.size()) {
//                            nVisibleAux = v.size(); //igualamos el valor
//
//                        }
//                        //Puede darse que se pierdan mas de los ocultos pero los otros no
//                        if (nVisibleTreasures <= v.size() && nHiddenTreasures > h.size()) {
//                            nHiddenAux = h.size(); //igualamos el valor
//
//                        }
//                        //Puede darse que se pierdan más de ambos
//                        if (nVisibleTreasures > v.size() && nHiddenTreasures > h.size()) {
//                            nHiddenAux = h.size(); //igualamos el valor
//                            nVisibleAux = v.size();
//                        }
//                    }
//                }
//                    badConsequence = new BadConsequence(text, levels, nVisibleAux, nHiddenAux);
//                return badConsequence;
//            }

            // si se pierden 0 tesoros es porque se pierden especificos
            

                ArrayList<TreasureKind> vcopia = new ArrayList();
                ArrayList<TreasureKind> hcopia = new ArrayList();

                // si ninguno de los dos arrays está vacío
                if (!this.specificHiddenTreasures.isEmpty() && !this.specificVisibleTreasures.isEmpty()) {
                    //de cada elemento de la lista de específicos ocultos
                    for (TreasureKind sht : specificHiddenTreasures) {
                        boolean esta = false;
                        //for(Treasure vTreasure : v){ // Comprobamos si está en el otro 

                        // Comprobamos si está en el otro 
                        for (int i = 0; i < haux.size() && !esta; i++) {
                            if (sht == haux.get(i).getType()) { //si son iguales
                                hcopia.add(haux.get(i).getType());// se mete en el vector de copias
                                esta = true; //esta pasa a valer true(esto es para el que el for salte)
                                haux.remove(haux.get(i));//se quita de la lista, para que no siga contandolo

                            }
                        }
                    }

                    for (TreasureKind svt : specificVisibleTreasures) {
                        boolean esta = false;
                        // for(Treasure hTreasure : h){
                        for (int i = 0; i < vaux.size() && !esta; i++) {
                            if (svt == vaux.get(i).getType()) {
                                vcopia.add(vaux.get(i).getType());
                                esta = true;
                                vaux.remove(vaux.get(i));
                            }
                        }
                    }
                }
                ///////////////////////////////////////////////////////////////////////////////////////////

                // si uno de ellos está vacio se hace lo mismo que antes pero por separado
                if (!this.specificHiddenTreasures.isEmpty() && this.specificVisibleTreasures.isEmpty()) {
                    for (TreasureKind sht : specificHiddenTreasures) { //de cada elemento de la lista de específicos ocultos
                        boolean esta = false;
                        //for(Treasure vTreasure : v){ // Comprobamos si está en el otro
                        for (int i = 0; i < haux.size() && !esta; i++) {// Comprobamos si está en el otro 
                            if (sht == haux.get(i).getType()) { //si son iguales
                                hcopia.add(haux.get(i).getType());// se mete en el vector de copias
                                esta = true; //esta pasa a valer true(esto es para el que el for salte)
                                haux.remove(haux.get(i));//se quita de la lista, para que no siga contandolo

                            }
                        }
                    }
                }
                ///////////////////////////////////////////////////////////////////////////////////////////
                if (this.specificHiddenTreasures.isEmpty() && !this.specificVisibleTreasures.isEmpty()) {
                    for (TreasureKind svt : specificVisibleTreasures) {
                        boolean esta = false;
                        // for(Treasure hTreasure : h){
                        for (int i = 0; i < vaux.size() && !esta; i++) {
                            if (svt == vaux.get(i).getType()) {
                                vcopia.add(vaux.get(i).getType());
                                esta=true;
                                vaux.remove(vaux.get(i));
                            }
                        }
                    }
                }

                badConsequence = new BadConsequence(text, levels, vcopia, hcopia);
                return badConsequence;

            

        }
        //*** Cambiado provisional para no devolver null ****//
        badConsequence = new BadConsequence("No mal royo",0,0,0);
        return badConsequence; //cambiar

    }
   
    @Override
    public String toString() {
        return "BadConsequence = " +  this.text 
                + ", levels = " +  this.levels
                + ", specificVisibleTreasures = " +  this.specificVisibleTreasures 
                + ", specificHiddenTreasures = " +  this.specificHiddenTreasures  ;
    }
}
