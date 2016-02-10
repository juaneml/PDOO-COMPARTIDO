
package NapakalakiGame;

import java.util.ArrayList;

/**
 * @version 4.1
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
    
    
    public ArrayList<TreasureKind> getSpecificHiddenTreasures() {
        return specificHiddenTreasures;
    }
    
    
    public ArrayList<TreasureKind> getSpecificVisibleTreasures() {
        return specificVisibleTreasures;
    }
    
    @Override
    public void substractVisibleTreasure(Treasure t){
        if(!specificVisibleTreasures.isEmpty())
        specificVisibleTreasures.remove(t.getType());
    }
    
    @Override
    public void substractHiddenTreasure(Treasure t){
        if(!specificHiddenTreasures.isEmpty())
        specificHiddenTreasures.remove(t.getType());
    }
    
    @Override
    public BadConsequence adjustToFitTreasureList(ArrayList<Treasure> v, ArrayList<Treasure> h){
        BadConsequence bad;
        
        // Tesoros específicos Visibles        
        ArrayList <TreasureKind> copia_specificV = new ArrayList(); // auxiliar      
        ArrayList <TreasureKind> bad_specific_Vdev = new ArrayList(); //lista devuelta
        
        // Tesoros específicos Ocultos
        ArrayList <TreasureKind> copia_specificH = new ArrayList(); // auxiliar
        ArrayList <TreasureKind> bad_specific_Hdev = new ArrayList(); // lista devuelta
        
        /* Copiamos los tesoros específicos visibles que tiene el jugador
           en una lista auxiliar
                */
        
        /* VISIBLES */
        if (v != null) {
            System.out.println("Estoy quitando especificos visibles");
            for (TreasureKind visibleBad : this.specificVisibleTreasures) {
                copia_specificV.add(visibleBad);
            }

            /* Seleccionamos los tesoros que se ajustan al badconsequence que
             puede cumplir el jugador*/
             System.out.println("Estoy quitando especificos visibles Antes"+ copia_specificV+"\n");
            for (Treasure dadoBad : v) {
                if (copia_specificV.contains(dadoBad.getType())) { //si contiene el tipo
                    bad_specific_Vdev.add(dadoBad.getType());   //añadimos a la lista
                    copia_specificV.remove(dadoBad.getType()); //eliminamos elemento de la copia
                }
            }
             System.out.println("Estoy quitando especificos visibles Despues"+ copia_specificV+"\n");
        }
        /* OCULTOS */
        
        if(h != null){
            
            for (TreasureKind ocultoBad : this.specificHiddenTreasures) {
                copia_specificH.add(ocultoBad);
              
            }

            /* Seleccionamos los tesoros que se ajustan al badconsequence que
             puede cumplir el jugador*/
            System.out.println("Estoy quitando especificos ocultos Antes"+ copia_specificH+"\n");
            for (Treasure dadoBad : h) {
                if (copia_specificH.contains(dadoBad.getType())) { //si contiene el tipo
                    bad_specific_Hdev.add(dadoBad.getType()); //añadimos a la lista 
                    copia_specificV.remove(dadoBad.getType()); //eliminamos elemento de la copia

                }

            }
             System.out.println("Estoy quitando especificos ocultos Despues"+ copia_specificH+"\n");
        }
        bad = new SpecificBadConsequence(this.text,0,bad_specific_Vdev,bad_specific_Hdev);
        return bad;
    }
//    @Override
//    public BadConsequence adjustToFitTreasureList(ArrayList<Treasure> v, ArrayList<Treasure> h) {
//        int tamV = v.size();
//        int tamH = h.size();
//
//        ArrayList<Treasure> vaux = new ArrayList(v); //Para no tocar el valor de v
//        ArrayList<Treasure> haux = new ArrayList(h); //Para no tocar el valor de h
//        
//        ArrayList<TreasureKind> copiaV = new ArrayList(specificVisibleTreasures);
//        ArrayList<TreasureKind> copiaH = new ArrayList(specificHiddenTreasures);
//        
//        ArrayList<TreasureKind> nuevoV = new ArrayList();
//        ArrayList<TreasureKind> nuevoH = new ArrayList();
//        
//        SpecificBadConsequence badConsequence; 
//        
//        
//        //Para tesoros visibles V2
//        for(TreasureKind listav : copiaV){//El mal rollo
//            for(Treasure listajv : vaux){//lo que tenemos en el array
//                if(listav == listajv.getType()){
//                    nuevoV.add(listav);
//                    vaux.remove(listajv);
//                }
//            }
//        }
//        
//        //Para tesoros ocultos V2
//        for(TreasureKind listah : copiaH){//El mal rollo
//            for(Treasure listajh : haux){//lo que tenemos en el array
//                if(listah == listajh.getType()){
//                    nuevoV.add(listah);
//                    vaux.remove(listajh);
//                }
//            }
//        }
//             
//        badConsequence = new SpecificBadConsequence(text, levels, nuevoV, nuevoH);
//        return badConsequence;
//        
//    }
//    
       
    @Override
    public String toString() {
        return "BadConsequence = "
                + super.toString()
                + ", specificVisibleTreasures = " +  this.specificVisibleTreasures 
                + ", specificHiddenTreasures = " +  this.specificHiddenTreasures  ;
    }
}
