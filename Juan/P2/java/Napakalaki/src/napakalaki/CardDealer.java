
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author juane
 * @version 2.1
 */
public class CardDealer {
    /**
     * Atributos referenciales
     */
    private ArrayList <Monster> unusedMonsters;
    private ArrayList <Monster> usedMonsters;
    private ArrayList <Treasure> unusedTreasures;
    private ArrayList <Treasure> usedTreasures;
    
    private static final CardDealer instance = null;
    
    /** Constructor ****/
    
    /**
     * Constructor CardDealer()
     * visibilidad privada
     */
    private CardDealer(){
        
    }
     
    /**
     * Método initTreasureCardDeck()
     */
    private void initTreasureCardDeck(){
        
         unusedTreasures.add(new Treasure("¡Si mi amo!",4,TreasureKind.HELMET));
         
         unusedTreasures.add(new Treasure("Botas de investigacion",3,TreasureKind.SHOES));
         
         unusedTreasures.add(new Treasure("Capucha de Cthulhu",3,TreasureKind.HELMET));
         
         unusedTreasures.add(new Treasure("A prueba de babas",2,TreasureKind.ARMOR));
         
         unusedTreasures.add(new Treasure("Botas de lluvia ácida",1,TreasureKind.BOTHHANDS));
         
         unusedTreasures.add(new Treasure("Casco minero",2,TreasureKind.HELMET));
         
         unusedTreasures.add(new Treasure("Ametralladora Thompson",4,TreasureKind.BOTHHANDS));
         
         unusedTreasures.add(new Treasure("Camiseta de la UGR",1,TreasureKind.ARMOR));
         
         unusedTreasures.add(new Treasure("Clavo de rail ferroviario",3,TreasureKind.ONEHAND));
         
         unusedTreasures.add(new Treasure("Cuchillo de sushi arcano",2,TreasureKind.ONEHAND));
         
         unusedTreasures.add(new Treasure("Fez alópodo",3,TreasureKind.HELMET));
         
         unusedTreasures.add(new Treasure("Hacha prehistórica",2,TreasureKind.ONEHAND));
         
         unusedTreasures.add(new Treasure("El aparato del Pr. Tesla",4,TreasureKind.ARMOR));
         
         unusedTreasures.add(new Treasure("Gaita",4,TreasureKind.BOTHHANDS));
        
         unusedTreasures.add(new Treasure("Insecticida",2,TreasureKind.ONEHAND));
         
         unusedTreasures.add(new Treasure("Escopeta de 3 cañones",4,TreasureKind.BOTHHANDS));
         
         unusedTreasures.add(new Treasure("Garabato místico",2,TreasureKind.ONEHAND));
         
         unusedTreasures.add(new Treasure("La rebeca metálica",2,TreasureKind.ARMOR));
         
         unusedTreasures.add(new Treasure("Lanzallamas",4,TreasureKind.BOTHHANDS));
         
         unusedTreasures.add(new Treasure("Necromicón",1,TreasureKind.ONEHAND));
         
         unusedTreasures.add(new Treasure("Necronomicón",5,TreasureKind.BOTHHANDS));
         
         unusedTreasures.add(new Treasure("Linterna a 2 manos",3,TreasureKind.BOTHHANDS));
         
         unusedTreasures.add(new Treasure("Necrognomicón",2,TreasureKind.ONEHAND));
         
         unusedTreasures.add(new Treasure("Necrotelecom",2,TreasureKind.HELMET));
         
         unusedTreasures.add(new Treasure("Mazo de los antiguos",3,TreasureKind.ONEHAND));
         
         unusedTreasures.add(new Treasure("Necroplayboycón",3,TreasureKind.ONEHAND));
         
         unusedTreasures.add(new Treasure("Porra preternatural",2,TreasureKind.ONEHAND));
         
         unusedTreasures.add(new Treasure("Shogulador",1,TreasureKind.BOTHHANDS));
         
         unusedTreasures.add(new Treasure("Varita de atizamiento",3,TreasureKind.ONEHAND));
         
         unusedTreasures.add(new Treasure("Tentáculo de pega",2,TreasureKind.HELMET));
         
         unusedTreasures.add(new Treasure("Zapato deja-amigos",1,TreasureKind.SHOES));
    }
    
    /**
     * Método initMonsterCarDeck()
     */
    private void initMonsterCardDeck(){
       BadConsequence badConsequence ;  // mal royo
       Prize prize; // buen royo
      
       ArrayList<TreasureKind> tVisible = new ArrayList(); // Lista de TreasureKind Visible
       ArrayList<TreasureKind> tHidden = new ArrayList(); // Lista de TresaureKind Oculto
       
       // 3 Byakhees de bonanza
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ARMOR));
       tHidden = new ArrayList(Arrays.asList(TreasureKind.ARMOR));
       badConsequence = new BadConsequence("Pierdes tu armadura visible y otra oculta"
               + "",0,tVisible,tHidden);
       prize = new Prize(2,1);
       unusedMonsters.add(new Monster("3 Byakhees de bonanza ",8,badConsequence,prize));
       
       // Chibithulhu 
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.HELMET));
       tHidden = new ArrayList();
       badConsequence = new BadConsequence("Embobados con el lindo primigenio te descartas de tu"
               + "casco visible",0,tVisible,tHidden);
       prize = new Prize(1,1);
       unusedMonsters.add(new Monster("Chibithulhu",2,badConsequence,prize));
       
       // El sopor de Dunwich
       tVisible = new ArrayList(Arrays.asList(TreasureKind.SHOES));
       tHidden = new ArrayList();
       badConsequence = new BadConsequence("El primordial bostezo contagioso.Pierdes el calzado visible"
                ,0,tVisible,tHidden);
       prize = new Prize(1,1);
       unusedMonsters.add(new Monster("El sopor de Dunwich",2,badConsequence,prize));       
       
       
        // Ángeles de la noche ibicenca
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
       tHidden = new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
       badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta "
               + "y te dejan caer en mitadl del vuelo. Descarta 1 mano visible "
               + "y 1 mano oculta",0,tVisible,tHidden);
       prize = new Prize(4,1);
       unusedMonsters.add(new Monster("Ángeles de la noche ibicenca",14,badConsequence,prize));
       
       //El gorrón en el umbral  
       
       badConsequence = new BadConsequence("Pierdes todos tus tesoros visibles",0,10,0);
       prize = new Prize(3,1);       
       unusedMonsters.add(new Monster("El gorrón en el umbral",10,badConsequence,prize));
       
       // H.P. Munchcraft
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ARMOR));
       tHidden = new ArrayList();
       badConsequence = new BadConsequence("Pierdes la armadura visible",0,tVisible,tHidden);
       prize = new Prize(2,1);
       unusedMonsters.add(new Monster("H.P Munchcraft",6,badConsequence,prize));
         
       
       // Bichgooth
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ARMOR));
       tHidden = new ArrayList();
       badConsequence = new BadConsequence("Sientes bichos bajo la ropa.Descarta la armadura visible"
               ,0,tVisible,tHidden);
       prize = new Prize(1,1);
       unusedMonsters.add(new Monster("Bichgooth",2,badConsequence,prize));
       
       
        
       // El rey de rosa
       badConsequence = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
       prize = new Prize(4,2);
       unusedMonsters.add(new Monster("El rey de rosa",13,badConsequence,prize));
       
        //La que redacta en las tinieblas
       
       badConsequence = new BadConsequence("Toses los pulmones y "
               + "pierdes 2 niveles",2,0,0);
       prize = new Prize(1,1);
       unusedMonsters.add(new Monster("La que redacta en las tinieblas",2,badConsequence,prize));
       
       
       // Los hondos
       
       badConsequence = new BadConsequence("Estos monstrous resultan"
               + "bastante superficiales y te aburren mortalmente."
               + "Estas muerto",true);
       prize = new Prize(2,1);
       unusedMonsters.add(new Monster("Los hondos",8,badConsequence,prize));
       
       
       // Semillas Cthulhu
       
       badConsequence = new BadConsequence("Pierdes 2 niveles y 2 tesoros "
               + "ocultos",2,0,2);
       prize = new Prize(2,1);
       unusedMonsters.add(new Monster("Semillas Cthulhu",4,badConsequence,prize));
       
       // Dameargo
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
       tHidden = new ArrayList();
       prize = new Prize(2,1);
       badConsequence = new BadConsequence("Te intentas escaquear. Pierdes"
               + "una mano visible",0,tVisible,tHidden);
       
       unusedMonsters.add(new Monster("Dameargo",1,badConsequence,prize));
       
       // Pollipólipo volante
       
       badConsequence = new BadConsequence("Da mucho asquito. Pierdes"
               + "3 niveles",3,0,0);
       prize = new Prize(1,1);
       unusedMonsters.add(new Monster("Pollipólipo volante",3,badConsequence,prize));
       
       // Yskhtihyssg-Goth
       
       badConsequence = new BadConsequence("No le hace gracia que pronuncien mal "
               + "su nombre. Estas muerto",true);
       prize = new Prize(3,1);
       unusedMonsters.add(new Monster("Yskhtihyssg-Goth",12,badConsequence,prize));
       
       // Familia feliz
       
       badConsequence = new BadConsequence("La familia te atrapa.Estás muerto"
               + "",true);
       prize = new Prize(4,1);
       unusedMonsters.add(new Monster("Familia Feliz",1,badConsequence,prize));
       
       
       //Roboggoth
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS));
       tHidden = new ArrayList();
       prize = new Prize(2,1);
       badConsequence = new BadConsequence("La quinta directiva primaria te obliga"
               + " a perder 2 niveles y un tesoro, 2 manos visibles",2,tVisible,tHidden);
       unusedMonsters.add(new Monster("Roboggoth",8,badConsequence,prize));
       
       //El espia
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.HELMET));
       tHidden = new ArrayList();
       badConsequence = new BadConsequence("Te asusta en la noche. Pierdes un "
               + "casco visible",0,tVisible,tHidden);
       prize = new Prize(1,1);
       unusedMonsters.add(new Monster("El espia",5,badConsequence,prize));
       
       // El Lenguas
       
       badConsequence = new BadConsequence("Menudo susto te llevas."
               + " Pierdes 2 niveles y 5 tesoros visibles",2,5,0);
       prize = new Prize(1,1);
       unusedMonsters.add(new Monster("El Lenguas",20,badConsequence,prize));
       
       // Bicéfalo
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
       tHidden = new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS));;
       badConsequence = new BadConsequence("Te faltan manos para tanta cabeza. "
               + "Pierdes 3 niveles y tus tesoros visibles de las manos",3,tVisible,tHidden);
       prize = new Prize(1,1);
       unusedMonsters.add(new Monster("Bicéfalo",20,badConsequence,prize));
    }
    
    /**
     * Método shuffleTreasure()
     */
    private void shuffleTreasures(){
         Collections.shuffle(unusedTreasures);
    }
    
       
    /**
     * Método shuffleMonsters()
     */
    //Si usamos Collentions.shuffle(nombreaArray) las desordena tambien
    private void shuffleMonsters(){
        Collections.shuffle(unusedMonsters);
    }
    /**
     * Método getInstance()
     * @return 
     */
    public static CardDealer getInstance(){
        return instance;
    }
    
    /**
     * Método nextTresure()
     * @return 
     */
    public Treasure nextTreasure(){
        return null; //cambiar
    }
    
    /**
     * Método nextMonster()
     * @return 
     */
    public Monster nextMonster(){
        return null; //cambiar
    }
    
    /**
     * Método giveTreasureBack(Treasure t)
     * @param t 
     */
    public void giveTreasureBack(Treasure t){
       int j=0;
        
        usedTreasures.add(t);
              
       
    }
    
    /**
     * Método giveMonsterBack(Monster m)
     * @param m 
     */
    public void giveMonsterBack(Monster m){
        int j=0;
        
        usedMonsters.add(m);
               
        //unusedMonsters.remove(m);//si le metemos el ojeto lo busca y lo quita, si el objeto no existe no hace nada
    }
    
    /**
     * Método initCards()
     */
    public void initCards(){
        
    }
}
