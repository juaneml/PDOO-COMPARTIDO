package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author juane
 * @version 2.1
 */
public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       BadConsequence badConsequence ;  // mal royo
       Prize prize; // buen royo
      
       ArrayList<Monster> monstruos = new ArrayList(); // Lista de Monstrous
       ArrayList<TreasureKind> tVisible = new ArrayList(); // Lista de TreasureKind Visible
       ArrayList<TreasureKind> tHidden = new ArrayList(); // Lista de TresaureKind Oculto
       
       // 3 Byakhees de bonanza
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ARMOR));
       tHidden = new ArrayList(Arrays.asList(TreasureKind.ARMOR));
       badConsequence = new BadConsequence("Pierdes tu armadura visible y otra oculta"
               + "",0,tVisible,tHidden);
       prize = new Prize(2,1);
       monstruos.add(new Monster("3 Byakhees de bonanza ",8,badConsequence,prize));
       
       // Chibithulhu 
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.HELMET));
       tHidden = new ArrayList();
       badConsequence = new BadConsequence("Embobados con el lindo primigenio te descartas de tu"
               + "casco visible",0,tVisible,tHidden);
       prize = new Prize(1,1);
       monstruos.add(new Monster("Chibithulhu",2,badConsequence,prize));
       
       // El sopor de Dunwich
       tVisible = new ArrayList(Arrays.asList(TreasureKind.SHOES));
       tHidden = new ArrayList();
       badConsequence = new BadConsequence("El primordial bostezo contagioso.Pierdes el calzado visible"
                ,0,tVisible,tHidden);
       prize = new Prize(1,1);
       monstruos.add(new Monster("El sopor de Dunwich",2,badConsequence,prize));       
       
       
        // Ángeles de la noche ibicenca
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
       tHidden = new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
       badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta "
               + "y te dejan caer en mitadl del vuelo. Descarta 1 mano visible "
               + "y 1 mano oculta",0,tVisible,tHidden);
       prize = new Prize(4,1);
       monstruos.add(new Monster("Ángeles de la noche ibicenca",14,badConsequence,prize));
       
       //El gorrón en el umbral  
       
       badConsequence = new BadConsequence("Pierdes todos tus tesoros visibles",0,10,0);
       prize = new Prize(3,1);       
       monstruos.add(new Monster("El gorrón en el umbral",10,badConsequence,prize));
       
       // H.P. Munchcraft
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ARMOR));
       tHidden = new ArrayList();
       badConsequence = new BadConsequence("Pierdes la armadura visible",0,tVisible,tHidden);
       prize = new Prize(2,1);
       monstruos.add(new Monster("H.P Munchcraft",6,badConsequence,prize));
         
       
       // Bichgooth
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ARMOR));
       tHidden = new ArrayList();
       badConsequence = new BadConsequence("Sientes bichos bajo la ropa.Descarta la armadura visible"
               ,0,tVisible,tHidden);
       prize = new Prize(1,1);
       monstruos.add(new Monster("Bichgooth",2,badConsequence,prize));
       
       
        
       // El rey de rosa
       badConsequence = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
       prize = new Prize(4,2);
       monstruos.add(new Monster("El rey de rosa",13,badConsequence,prize));
       
        //La que redacta en las tinieblas
       
       badConsequence = new BadConsequence("Toses los pulmones y "
               + "pierdes 2 niveles",2,0,0);
       prize = new Prize(1,1);
       monstruos.add(new Monster("La que redacta en las tinieblas",2
               ,badConsequence,prize));
       
       
       // Los hondos
       
       badConsequence = new BadConsequence("Estos monstrous resultan"
               + "bastante superficiales y te aburren mortalmente."
               + "Estas muerto",true);
       prize = new Prize(2,1);
       monstruos.add(new Monster("Los hondos",8,badConsequence,prize));
       
       
       // Semillas Cthulhu
       
       badConsequence = new BadConsequence("Pierdes 2 niveles y 2 tesoros "
               + "ocultos",2,0,2);
       prize = new Prize(2,1);
       monstruos.add(new Monster("Semillas Cthulhu",4,badConsequence,prize));
       
       // Dameargo
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
       tHidden = new ArrayList();
       prize = new Prize(2,1);
       badConsequence = new BadConsequence("Te intentas escaquear. Pierdes"
               + "una mano visible",0,tVisible,tHidden);
       
       monstruos.add(new Monster("Dameargo",1,badConsequence,prize));
       
       // Pollipólipo volante
       
       badConsequence = new BadConsequence("Da mucho asquito. Pierdes"
               + "3 niveles",3,0,0);
       prize = new Prize(1,1);
       monstruos.add(new Monster("Pollipólipo volante",3,badConsequence,prize));
       
       // Yskhtihyssg-Goth
       
       badConsequence = new BadConsequence("No le hace gracia que pronuncien mal "
               + "su nombre. Estas muerto",true);
       prize = new Prize(3,1);
       monstruos.add(new Monster("Yskhtihyssg-Goth",12,badConsequence,prize));
       
       // Familia feliz
       
       badConsequence = new BadConsequence("La familia te atrapa.Estás muerto"
               + "",true);
       prize = new Prize(4,1);
       monstruos.add(new Monster("Familia Feliz",1,badConsequence,prize));
       
       
       //Roboggoth
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS));
       tHidden = new ArrayList();
       prize = new Prize(2,1);
       badConsequence = new BadConsequence("La quinta directiva primaria te obliga"
               + " a perder 2 niveles y un tesoro, 2 manos visibles",2,tVisible,tHidden);
       monstruos.add(new Monster("Roboggoth",8,badConsequence,prize));
       
       //El espia
       
       tVisible = new ArrayList(Arrays.asList(TreasureKind.HELMET));
       tHidden = new ArrayList();
       badConsequence = new BadConsequence("Te asusta en la noche. Pierdes un "
               + "casco visible",0,tVisible,tHidden);
       prize = new Prize(1,1);
       monstruos.add(new Monster("El espia",5,badConsequence,prize));
       
       // El Lenguas
       
       badConsequence = new BadConsequence("Menudo susto te llevas."
               + " Pierdes 2 niveles y 5 tesoros visibles",2,5,0);
       prize = new Prize(1,1);
       monstruos.add(new Monster("El Lenguas",20,badConsequence,prize));
       
       // Bicéfalo
       tVisible = new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
       tHidden = new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS));;
       badConsequence = new BadConsequence("Te faltan manos para tanta cabeza. "
               + "Pierdes 3 niveles y tus tesoros visibles de las manos",3,tVisible,tHidden);
       prize = new Prize(1,1);
       monstruos.add(new Monster("Bicéfalo",20,badConsequence,prize));
       
       
       /*Consultas*/
       Monster mon;
       int total = 0;
       
       System.out.println("Nivel de Combate superior a 10"+"\n");
        for (int i = 0; i < monstruos.size(); i++) {
            mon = monstruos.get(i);
            
            if (mon.getCombatLevel() > 10) {
                total++;

                System.out.println(monstruos.get(i) + "\n");
            }
        }
       
       System.out.println("Total:" + total+"\n");
       
       
       
       int perLevel;
       
       total = 0;
       System.out.println("Mal rollo que implica sólo la pérdida de niveles"+"\n");
       
       for(int i = 0; i < monstruos.size();i++){
           perLevel = monstruos.get(i).getBadConsequence().getLevels();
         
           if(perLevel > 0 ){
               System.out.println(monstruos.get(i)+"\n");
               total++;
           }
           
          
       }
       System.out.println("Total: " + total);
       
       
       total = 0;
       int level_prize;
       System.out.println("buen rollo ganancia de niveles superor a 1"+"\n");
       
       for(int i = 0; i < monstruos.size();i++){
           level_prize = monstruos.get(i).getPrice().getLevel();
           
           if(level_prize > 1){
               System.out.println(monstruos.get(i)+"\n");
               total++;
           }
       }
       System.out.println("Total: " + total);
       
       total = 0;
      
       for(int i = 0; i < monstruos.size();i++){
            tVisible = monstruos.get(i).getBadConsequence().getSpecificVisibleTreasures();
            tHidden = monstruos.get(i).getBadConsequence().getSpecificHiddenTreasures();
       
            if(!tVisible.isEmpty() || !tHidden.isEmpty()){
                System.out.println(monstruos.get(i)+"\n");               
                total++;
            }
       }
       
       System.out.println("Total " + total +"\n");
    }
    
}
