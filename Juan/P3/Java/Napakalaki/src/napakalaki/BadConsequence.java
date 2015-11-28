package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author juane
 * @version 2.1
 * 
 * Clase BadConsequence para el mal rollo del monstruo
 */
public class BadConsequence {
   /* si no se pone nada visibilidad de package*/ 
   /*constante*/
   static final int MAXTREASURES = 10;
    /**
     * Atributos propios de la clase *
     */

    private String text; //lo que dice el mal royo
    private int levels; // niveles que se pierden 
    private int nVisibleTreasures; // número de tesoros visibles que si pierden
    private int nHiddenTreasures; // número de tesoros ocultos que se pierden
    private boolean death; // representa un mal royo de tipo muerte

    /**
     * Atributos de tipo lista de TreasureKind *
     */
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();

    /**
     * constructores 
     * Todos los atributos hay que inicializarlos
     */
    BadConsequence(String text, int levels, int nVisible, int nHidden) {
        this.text = text;
        this.levels = levels;
        this.nVisibleTreasures = nVisible;
        this.nHiddenTreasures = nHidden;
        this.death = false;
        this.specificVisibleTreasures = new ArrayList();
        this.specificVisibleTreasures = new ArrayList();
    }

    BadConsequence(String text, boolean death) {
        this.text = text;
        this.death = death;
        this.levels = 0;
        this.nVisibleTreasures = 10;
        this.nHiddenTreasures = 10; 
        this.specificVisibleTreasures = new ArrayList();        
        this.specificHiddenTreasures  = new ArrayList();
       
        
    }

    BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible,
            ArrayList<TreasureKind> tHidden) {
        this.text = text;
        this.levels = levels;
        this.nVisibleTreasures = 10; // valor por defecto que no va a a ser nunca así
        this.nHiddenTreasures = 10;
        this.death = false;
        this.specificVisibleTreasures = tVisible;
        this.specificHiddenTreasures = tHidden;
    }

    /** Consultores **/

    /**
     * Método isEmpty()
     * @return 
     */
    public boolean isEmpty(){
        
        if(this.nHiddenTreasures==0 && this.nVisibleTreasures==0 
                && this.death == false
                && this.specificVisibleTreasures.isEmpty() 
                && this.specificHiddenTreasures.isEmpty()){
            return true;
        }
        else
            return false; 
    }
    
     /**
     * Método getLevels() 
     * Devuelve los niveles que se pierden
     *
     * @return levels de tipo int
     */
    public int getLevels() {
        return this.levels;
    }
    
    /**
     * Método getnVisibleTreasures() 
     * Devuelve el número de tesoros visibles que
     * si pierden
     *
     * @return nVisibleTreasures de tipo int
     */
    public int geNVisibleTreasures() {
        return this.nVisibleTreasures;
    }
    
    /**
     * Método getnHiddenTreasures() 
     * Devuelve el número de tesoros ocultos que se
     * pierden
     *
     * @return nHiddenTreasures de tipo int
     */
    public int getNHiddenTreasures() {
        return this.nHiddenTreasures;
    }
    
    /**
     * Método getSpecificHiddenTreasures()
     * Devuelve una lista con los Tesoros Ocultos
     * @return specificHiddenTreasures de tipo ArrayList
     */
    public ArrayList<TreasureKind> getSpecificHiddenTreasures() {
        return specificHiddenTreasures;
    }

    /**
     * Método getSpecificVisibleTreasures
     * Devuelve una lista con los Tesoros Visibles
     * @return specificVisibleTreasures de tipo ArrayList
     */
    public ArrayList<TreasureKind> getSpecificVisibleTreasures() {
        return specificVisibleTreasures;
    }
    
    /**
     * Método substractVisibleTreasure(Treasure t)
     * @param t 
     */
    public void substractVisibleTreasure(Treasure t){
        this.specificVisibleTreasures.remove(t);
    }
    
    /**
     * Método  substractHiddenTreasure(Treasure t)
     * @param t 
     */
    public void substractHiddenTreasure(Treasure t){
        this.specificHiddenTreasures.remove(t);
    }
    
    /**
     * Método adjustToFitTreasureList(ArrayList<Treasure> v,ArrayList<Treasure> h)
     * @param v
     * @param h
     * @return 
     */
    public BadConsequence adjustToFitTreasureList(ArrayList<Treasure> v,ArrayList<Treasure> h){
        int tamV = v.size();
        int tamH = h.size();
        
        int nVisibleAux=nVisibleTreasures;
        int nHiddenAux=nHiddenTreasures;
        
        ArrayList<Treasure> vaux; //Sin Usar ?? 
        ArrayList<Treasure> haux; // Sin Usar ?? 
        BadConsequence badConsequence ; //Sin Usar ??
        
        
        if(tamV>0 || tamH>0){ // Si los vectores que recibimos tienen cosas entramos aqui
            
            ///si los arrays de tesoros especificos a perder estan vacíos entramos
            
            if( this.specificHiddenTreasures.isEmpty() && this.specificVisibleTreasures.isEmpty()){ 
                
                //si perdemos un numero de ocultos o visibles mayor de lo que tenemos
                
                if(this.nHiddenTreasures > 0 || this.nVisibleTreasures > 0){ 
                    
                    //y se pierden más de lo que tenemos de uno u otro 
                    if(nVisibleTreasures> v.size() || nHiddenTreasures > h.size()){ 
                        
                        //Puede darse que se pierdan mas de los visibles pero los otros no
                        if(nVisibleTreasures > v.size() && nHiddenTreasures <= h.size()){
                            nVisibleAux = v.size(); //igualamos el valor
                            
                        }
                        //Puede darse que se pierdan mas de los ocultos pero los otros no
                        if(nVisibleTreasures <= v.size() && nHiddenTreasures > h.size()){
                            nHiddenAux = h.size(); //igualamos el valor
                            
                        }
                        //Puede darse que se pierdan más de ambos
                        if(nVisibleTreasures > v.size() && nHiddenTreasures > h.size()){
                             nHiddenAux = h.size(); //igualamos el valor
                             nVisibleAux = v.size();
                        }
                    }
                }
                

              return badConsequence = new BadConsequence(text,levels, nVisibleAux, nHiddenAux);
            }
            if(this.nVisibleTreasures==0 && this.nHiddenTreasures==0){ // si se pierden 0 tesoros es porque se pierden especificos
                
                ArrayList <TreasureKind> vcopia = new ArrayList();
                ArrayList <TreasureKind> hcopia = new ArrayList();
           
                // si ninguno de los dos arrays está vacío
                if(!this.specificHiddenTreasures.isEmpty() && !this.specificVisibleTreasures.isEmpty()){ 
                    //de cada elemento de la lista de específicos ocultos
                    for(TreasureKind sht : specificHiddenTreasures){ 
                        boolean esta = false;
                        //for(Treasure vTreasure : v){ // Comprobamos si está en el otro 
                        
                        // Comprobamos si está en el otro 
                        for(int i=0; i< v.size() || esta; i++){
                            if(sht == v.get(i).getType()){ //si son iguales
                                vcopia.add(v.get(i).getType());// se mete en el vector de copias
                                esta =true; //esta pasa a valer true(esto es para el que el for salte)
                                v.remove(v.get(i));//se quita de la lista, para que no siga contandolo
                                
                            }
                        }
                    }
                    
                    for(TreasureKind svt : specificHiddenTreasures){
                        boolean esta = false;
                       // for(Treasure hTreasure : h){
                        for(int i=0; i< h.size() || esta; i++){
                            if(svt == h.get(i).getType()){
                                hcopia.add(h.get(i).getType());
                                h.remove(h.get(i));
                            }
                        }
                    }
                }
                ///////////////////////////////////////////////////////////////////////////////////////////
                
                // si uno de ellos está vacio se hace lo mismo que antes
                if(this.specificHiddenTreasures.isEmpty() && !this.specificVisibleTreasures.isEmpty()){
                    for(TreasureKind sht : specificHiddenTreasures){ //de cada elemento de la lista de específicos ocultos
                        boolean esta = false;
                        //for(Treasure vTreasure : v){ // Comprobamos si está en el otro 
                        for(int i=0; i< v.size() || esta; i++){// Comprobamos si está en el otro 
                            if(sht == v.get(i).getType()){ //si son iguales
                                vcopia.add(v.get(i).getType());// se mete en el vector de copias
                                esta =true; //esta pasa a valer true(esto es para el que el for salte)
                                v.remove(v.get(i));//se quita de la lista, para que no siga contandolo
                                
                            }
                        }
                    }
                }
                ///////////////////////////////////////////////////////////////////////////////////////////
                if(!this.specificHiddenTreasures.isEmpty() && this.specificVisibleTreasures.isEmpty()){
                    for(TreasureKind svt : specificHiddenTreasures){
                        boolean esta = false;
                       // for(Treasure hTreasure : h){
                        for(int i=0; i< h.size() || esta; i++){
                            if(svt == h.get(i).getType()){
                                hcopia.add(h.get(i).getType());
                                h.remove(h.get(i));
                            }
                        }
                    }
                }
              return badConsequence = new BadConsequence(text,levels, vcopia, hcopia);// devolvemos ???
                
            }
            
            
        }
        
        
        return null; //cambiar
        
    }
    /**
     * Método getText() 
     * Devuelve lo que dice el mal royo
     *
     * @return text de tipo String
     */
    public String getText() {
        return this.text;
    }

   

    /**
     * Método isDeath() Devuelve true o false del mal royo de tipo muerte
     *
     * @return death de tipo boolean
     */
    public boolean isDeath() {
        return death;
    }

    

    /**
     * Método toString()
     * @return 
     */
    @Override
    public String toString() {
        return "BadConsequence = " +  this.text + ", levels = " +  this.levels 
                + ", nVisibleTreasures = "  + this.nVisibleTreasures 
                + ", nHiddenTreasures = " +  this.nHiddenTreasures 
                + ", death = " +  this.death + ", specificVisibleTreasures = " 
                +  this.specificVisibleTreasures + ", specificHiddenTreasures = " 
                +  this.specificHiddenTreasures  ;
    }
}
