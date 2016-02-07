
package NapakalakiGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author juane
 * @version 3.1
 */
public class CardDealer {
    private static final CardDealer instance = new CardDealer();
    
    
    /** Relaciones **/
    
    private ArrayList <Monster> unusedMonsters = new ArrayList(); // Relación con Monster
    private ArrayList <Monster> usedMonsters = new ArrayList(); // Relación con Monster
    
    private ArrayList <Treasure> unusedTreasures = new ArrayList(); //Relación con Treasure
    private ArrayList <Treasure> usedTreasures = new ArrayList(); // Relación con Treasure
    
    private ArrayList <Cultist> unusedCultists = new ArrayList();
    
    
    
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
        
        this.unusedTreasures.add(new Treasure("¡Si mi amo!",4,TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("Botas de invetigación",3,TreasureKind.SHOES));
        this.unusedTreasures.add(new Treasure("Capucha de Cthulhu",3,TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("A prueba de babas",2,TreasureKind.ARMOR));
        this.unusedTreasures.add(new Treasure("Botas de lluvia ácida",1,TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Casco minero",2,TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("Amatralladora Thompson",4,TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Camiseta de la UGR",1,TreasureKind.ARMOR));
        this.unusedTreasures.add(new Treasure("Clavo de rail ferroviario",3,TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Cuchillo de sushi arcano",2,TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Fez alópdo",3,TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("Hacha prehistórica",2,TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("El aparato del Pr. Tesla",4,TreasureKind.ARMOR));
        this.unusedTreasures.add(new Treasure("Gaita",4,TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Insecticida",2,TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Escopeta de 3 cañones",4,TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Garabato místico",2,TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("La rebeca metálica",2,TreasureKind.ARMOR));
        this.unusedTreasures.add(new Treasure("Lanzallamas",4,TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Necro-comicón",1,TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Necronomicón",5,TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Linterna a 2 manos",3,TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Necrognomicón",2,TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Necrotelecom",2,TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("Mazo de los antiguos",3,TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Necro-playbocón",3,TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Porra preternatural",2,TreasureKind.ONEHAND));        
        this.unusedTreasures.add(new Treasure("Shogulador",1,TreasureKind.BOTHHANDS));
        this.unusedTreasures.add(new Treasure("Varita de atizamiento",3,TreasureKind.ONEHAND));
        this.unusedTreasures.add(new Treasure("Tentáculo de pega",2,TreasureKind.HELMET));
        this.unusedTreasures.add(new Treasure("Zapato deja-amigos",1,TreasureKind.SHOES));
        
                
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
       badConsequence = new SpecificBadConsequence("Pierdes tu armadura visible y otra oculta"
               + "",0,tVisible,tHidden);
       prize = new Prize(2,1);
       this.unusedMonsters.add(new Monster("3 Byakhees de bonanza",8,badConsequence,prize));
       
       // Chibithulhu 
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.HELMET));
       tHidden = new ArrayList();
       badConsequence = new SpecificBadConsequence("Embobados con el lindo primigenio te descartas de tu"
               + "casco visible",0,tVisible,tHidden);
       prize = new Prize(1,1);
       this.unusedMonsters.add(new Monster("Chibithulhu",2,badConsequence,prize));
       
       // El sopor de Dunwich
       tVisible = new ArrayList(Arrays.asList(TreasureKind.SHOES));
       tHidden = new ArrayList();
       badConsequence = new SpecificBadConsequence("El primordial bostezo contagioso.Pierdes el calzado visible"
                ,0,tVisible,tHidden);
       prize = new Prize(1,1);
       this.unusedMonsters.add(new Monster("El sopor de Dunwich",2,badConsequence,prize));       
       
       
        // Ángeles de la noche ibicenca
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
       tHidden = new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
       badConsequence = new SpecificBadConsequence("Te atrapan para llevarte de fiesta "
               + "y te dejan caer en mitadl del vuelo. Descarta 1 mano visible "
               + "y 1 mano oculta",0,tVisible,tHidden);
       prize = new Prize(4,1);
       this.unusedMonsters.add(new Monster("Ángeles de la noche ibicenca",14,badConsequence,prize));
       
       //El gorrón en el umbral  
       
       badConsequence = new NumericBadConsequence("Pierdes todos tus tesoros visibles",0,BadConsequence.MAXTREASURES,0);
       prize = new Prize(3,1);       
       this.unusedMonsters.add(new Monster("El gorron en el umbral",10,badConsequence,prize));
       
       // H.P. Munchcraft
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ARMOR));
       tHidden = new ArrayList();
       badConsequence = new SpecificBadConsequence("Pierdes la armadura visible",0,tVisible,tHidden);
       prize = new Prize(2,1);
       this.unusedMonsters.add(new Monster("H.P Munchcraft",6,badConsequence,prize));
         
       
       // Bichgooth
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ARMOR));
       tHidden = new ArrayList();
       badConsequence = new SpecificBadConsequence("Sientes bichos bajo la ropa.Descarta la armadura visible"
               ,0,tVisible,tHidden);
       prize = new Prize(1,1);
       this.unusedMonsters.add(new Monster("Bichgooth",2,badConsequence,prize));
       
       
        
       // El rey de rosa
       badConsequence = new NumericBadConsequence("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
       prize = new Prize(4,2);
       this.unusedMonsters.add(new Monster("El rey de rosa",13,badConsequence,prize));
       
        //La que redacta en las tinieblas
       
       badConsequence = new NumericBadConsequence("Toses los pulmones y "
               + "pierdes 2 niveles",2,0,0);
       prize = new Prize(1,1);
       this.unusedMonsters.add(new Monster("La que redacta en las tinieblas",2
               ,badConsequence,prize));
       
       
       // Los hondos
       
       badConsequence = new DeathBadConsequence("Estos monstrous resultan"
               + "bastante superficiales y te aburren mortalmente."
               + "Estas muerto",true);
       prize = new Prize(2,1);
       this.unusedMonsters.add(new Monster("Los hondos",8,badConsequence,prize));
       
       
       // Semillas Cthulhu
       
       badConsequence = new NumericBadConsequence("Pierdes 2 niveles y 2 tesoros "
               + "ocultos",2,0,2);
       prize = new Prize(2,1);
       this.unusedMonsters.add(new Monster("Semillas Cthulhu",4,badConsequence,prize));
       
       // Dameargo
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
       tHidden = new ArrayList();
       prize = new Prize(2,1);
       badConsequence = new SpecificBadConsequence("Te intentas escaquear. Pierdes"
               + "una mano visible",0,tVisible,tHidden);
       
       this.unusedMonsters.add(new Monster("Dameargo",1,badConsequence,prize));
       
       // Pollipólipo volante
       
       badConsequence = new NumericBadConsequence("Da mucho asquito. Pierdes"
               + "3 niveles",3,0,0);
       prize = new Prize(1,1);
       this.unusedMonsters.add(new Monster("Pollipólipo volante",3,badConsequence,prize));
       
       // Yskhtihyssg-Goth
       
       badConsequence = new DeathBadConsequence("No le hace gracia que pronuncien mal "
               + "su nombre. Estas muerto",true);
       prize = new Prize(3,1);
       this.unusedMonsters.add(new Monster("Yskhtihyssg-Goth",12,badConsequence,prize));
       
       // Familia feliz
       
       badConsequence = new DeathBadConsequence("La familia te atrapa.Estás muerto"
               + "",true);
       prize = new Prize(4,1);
       this.unusedMonsters.add(new Monster("Familia Feliz",1,badConsequence,prize));
       
       
       //Roboggoth
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS));
       tHidden = new ArrayList();
       prize = new Prize(2,1);
       badConsequence = new SpecificBadConsequence("La quinta directiva primaria te obliga"
               + " a perder 2 niveles y un tesoro, 2 manos visibles",2,tVisible,tHidden);
       this.unusedMonsters.add(new Monster("Roboggoth",8,badConsequence,prize));
       
       //El espia
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.HELMET));
       tHidden = new ArrayList();
       badConsequence = new SpecificBadConsequence("Te asusta en la noche. Pierdes un "
               + "casco visible",0,tVisible,tHidden);
       prize = new Prize(1,1);
       this.unusedMonsters.add(new Monster("El espia",5,badConsequence,prize));
       
       // El Lenguas
       
       badConsequence = new NumericBadConsequence("Menudo susto te llevas."
               + " Pierdes 2 niveles y 5 tesoros visibles",2,5,0);
       prize = new Prize(1,1);
       this.unusedMonsters.add(new Monster("El Lenguas",20,badConsequence,prize));
       
       // Bicéfalo
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
       tVisible.add(TreasureKind.ONEHAND);
       tVisible.add(TreasureKind.BOTHHANDS);
       tHidden = new ArrayList();
       
       badConsequence = new SpecificBadConsequence("Te faltan manos para tanta cabeza. "
               + "Pierdes 3 niveles y tus tesoros visibles de las manos",3,tVisible,tHidden);
       prize = new Prize(1,1);
       this.unusedMonsters.add(new Monster("Bicéfalo",20,badConsequence,prize));
       
       // El mal indecible impronunciable
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
       tHidden = new ArrayList();
       badConsequence = new SpecificBadConsequence("Pierdes una mano visible",0,tVisible,tHidden);
       prize = new Prize(3,1);
       this.unusedMonsters.add(new Monster("El mal indecible impronunciable",10,badConsequence,prize,-2));
       
       // Testigos Oculares
       
       badConsequence = new NumericBadConsequence("Pierdes tus tesoros visibles. Jajaja",0,10,0);
       prize = new Prize(2,1);
       this.unusedMonsters.add(new Monster("Testigos Oculares",6,badConsequence,prize,2));
       
       //El gran cthulhu
       badConsequence = new DeathBadConsequence("Hoy no es tu dia de suerte. Mueres",true);
       prize = new Prize(2,5);
       this.unusedMonsters.add(new Monster("El gran cthulhu",20,badConsequence,prize,4));
       
       //Serpiente Político
       badConsequence = new NumericBadConsequence("Tu gobierno te recorta 2 niveles",2,0,0);
       prize = new Prize(2,1);
       this.unusedMonsters.add(new Monster("Serpiente Politico",8,badConsequence,prize,-2));
       
       //Felpuggoth
       tVisible = new ArrayList(Arrays.asList(TreasureKind.HELMET));
       tVisible.add(TreasureKind.ARMOR);
       tHidden = new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
       tHidden.add(TreasureKind.ONEHAND);
       tHidden.add(TreasureKind.BOTHHANDS);
       badConsequence = new SpecificBadConsequence("Pierdes tu casco y tu armadura visible. Pierdes tus manos ocultas",2,tVisible,tHidden);
       prize = new Prize(1,1);
       this.unusedMonsters.add(new Monster("Serpiente Político",8,badConsequence,prize,5));
       
       //Shogooth
       badConsequence = new NumericBadConsequence("Pierdes 2 niveles",2,0,0);
       prize = new Prize(4,2);
       this.unusedMonsters.add(new Monster("Serpiente Político",16,badConsequence,prize,-4));
       
       //Lolitagooth
       badConsequence = new NumericBadConsequence("Pintalabios negro. Pierdes 2 niveles",2,0,0);
       prize = new Prize(1,1);
       this.unusedMonsters.add(new Monster("Lolitagooth",2,badConsequence,prize,3));
       
    }
    
    private void initCultistsCardDeck(){

        Cultist cultist; 
        cultist = new Cultist("Sectario",+1);
        this.unusedCultists.add(cultist);
        
        cultist = new Cultist("Sectario",+2);
        this.unusedCultists.add(cultist);
        
        cultist = new Cultist("Sectario",+1);
        this.unusedCultists.add(cultist);
        
        cultist = new Cultist("Sectario",+2);
        this.unusedCultists.add(cultist);
        
        cultist = new Cultist("Sectario",+1);
        this.unusedCultists.add(cultist);
        
        cultist = new Cultist("Sectario",+1);
        this.unusedCultists.add(cultist);
        
        
    }
    
    /**
     * Método shuffleTreasure()
     * Baraja el mazo de los tesoros
     */
    private void shuffleTreasures(){
        Collections.shuffle(this.unusedTreasures);
    }
    
    /**
     * Método shuffleMonsters()
     * baraja la mazo de los monstruos
     */
    
    private void shuffleMonsters(){
        Collections.shuffle(this.unusedMonsters);
    }
    
    private void shuffleCultists(){
        Collections.shuffle(this.unusedCultists);
    }
    /**
     * Método getInstance()
     * @return devuelve la instancia
     */
    public static CardDealer getInstance(){
        return instance;
    }
    
    /**
     * Método nextTresure()
     * @return siguiente tesoro
     */
    public Treasure nextTreasure(){
       
        Treasure aux; 
            if (this.unusedTreasures.isEmpty()) 
            {
              
                for (Treasure tesoro: this.usedTreasures)
                {                
                    this.unusedTreasures.add(tesoro);                
                }
            
                this.shuffleTreasures(); //barajamos el mazo de tesoros
                this.unusedTreasures.clear(); //quitamos las cartas de los descartes
            }
            
                //Ponemos la primera carta
                
                aux = this.unusedTreasures.get(0);
                
                this.usedTreasures.add(aux);
                this.unusedTreasures.remove(aux);
        return aux;
        
    }
    
    /**
     * Método nextMonster()
     * @return siguiente monstruo
     */
    public Monster nextMonster(){
        Monster monster;
            if (unusedMonsters.isEmpty()) {
                
                for (Monster mons: this.usedMonsters){
                    this.unusedMonsters.add(mons);
                }
                
                this.shuffleMonsters();
                
                this.usedMonsters.clear();
            }
        
            monster = this.unusedMonsters.get(0);
            this.usedMonsters.add(monster);
            this.unusedMonsters.remove(monster);
            
        return monster;
        
    }
    
    public Cultist nextCultist(){
        return this.unusedCultists.get(0);
    }
    
    /**
     * Método giveTreasureBack(Treasure t)
     * Da el siguiente Tesoro
     * @param t de tipo Treasure
     * 
     */
    public void giveTreasureBack(Treasure t){
       this.usedTreasures.add(t);
    }
    
    /**
     * Método giveMonsterBack(Monster m)
     * Da el siguiente Monster
     * @param m  de tipo Monster
     */
    public void giveMonsterBack(Monster m){
        this.usedMonsters.add(m);
    }
    
    /**
     * Método initCards()
     * Inicia el mazo de cartas de tesoros
     * Inicia el mazo de cartas de monstruos
     */
    public void initCards(){
        this.initTreasureCardDeck();
        this.shuffleTreasures();
        this.initMonsterCardDeck();
        this.shuffleMonsters();
        this.initCultistsCardDeck();
        this.shuffleCultists();
    }
/*
    @Override
    public String toString() {
        return "CardDealer{" + "unusedMonster=" + unusedMonsters + ", usedMonsters=" + usedMonsters + ", unusedTreasures=" + unusedTreasures + ", usedTreasures=" + usedTreasures + '}';
    }*/
    
}
