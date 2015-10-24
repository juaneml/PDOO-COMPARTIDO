/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Raul
 */
public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // public BadConsequence(String text, int levels, int nVisibleTreasures, int nHiddenTreasures) {
        
        
        ArrayList<Monster> monstruos = new ArrayList();
        ArrayList<TreasureKind> tVisible = new ArrayList();
        ArrayList<TreasureKind> tHidden = new ArrayList();
        Prize prize ;
        
        
        tVisible= new ArrayList(Arrays.asList(TreasureKind.ARMOR));
        tHidden= new ArrayList(Arrays.asList(TreasureKind.ARMOR));
        BadConsequence badConsequence = new BadConsequence ("Pierdes tu armadura visible y otra oculta",0,tVisible,tHidden);
        prize = new Prize(2,1);
        monstruos.add(new Monster("3 Byakhees de bonanza",8, badConsequence,prize));
        
        tVisible= new ArrayList(Arrays.asList(TreasureKind.HELMET));
        tHidden= new ArrayList();
        badConsequence = new BadConsequence ("Emboscados con el lindo primigenio te descartas de tu casco visible",0,tVisible,tHidden);
        prize =new Prize(1,1);
        monstruos.add(new Monster("Chibithulhu",2, badConsequence,prize));
        
        tVisible= new ArrayList(Arrays.asList(TreasureKind.SHOES));
        tHidden= new ArrayList();
        badConsequence = new BadConsequence("El primordial bostezo contagioso. Pierdes el calzado visible",0 ,tVisible,tHidden );
        prize= new Prize(1,1);
        monstruos.add(new Monster("El sopor de Dunwich",2,badConsequence,prize));
        
        tVisible= new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
        tHidden= new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
        badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",0,tVisible,tHidden);
        prize= new Prize(4,1);
        monstruos.add(new Monster("Ángeles de la noche ibicenca",14,badConsequence,prize));
        
        tVisible= new ArrayList();//ARREGLAR ESTO, Numero suficientemente alto para borrarlos todos
        tHidden = new ArrayList();//ARREGLAR ESTO 
        badConsequence = new BadConsequence("Pierdes todos tus tesoros visibles",0,10,0);
        prize= new Prize(3,1);
        monstruos.add(new Monster("El gorrón del umbral",10,badConsequence,prize));
        
        tVisible= new ArrayList(Arrays.asList(TreasureKind.ARMOR));
        tHidden =new ArrayList();
        badConsequence = new BadConsequence("Pierdes la armadura visible",0,tVisible,tHidden);
        prize=new Prize(2,1);
        monstruos.add(new Monster("H.P. Munchcraft",6,badConsequence,prize));
        
        tVisible= new ArrayList(Arrays.asList(TreasureKind.ARMOR));
        tHidden=new ArrayList();
        badConsequence = new BadConsequence("Sientes bichos bajo la ropa. Descata la armadura visible",0,tVisible,tHidden);
        prize=new Prize(1,1);
        monstruos.add(new Monster("Bichgooth",2,badConsequence,prize));
        
        tVisible=new ArrayList();
        tHidden=new ArrayList();
        badConsequence = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
        prize=new Prize(4,2);
        monstruos.add(new Monster("El rey de rosa",13,badConsequence,prize));
        
        tVisible=new ArrayList();
        tHidden=new ArrayList();
        badConsequence = new BadConsequence("Toses los pulmones y pierdes 2 niveles",2,0,0);
        prize=new Prize(1,1);
        monstruos.add(new Monster("La que redacta en las tinieblas",2,badConsequence,prize));
        
        tVisible=new ArrayList();
        tHidden=new ArrayList();
        badConsequence = new BadConsequence("Estos monstruos resultan bastante superficiales y te aburren mortalmente. Estas muerto",true);
        prize=new Prize(2,1);
        monstruos.add(new Monster("Los hondos",8,badConsequence,prize));
        
        tVisible=new ArrayList();
        tHidden=new ArrayList();
        badConsequence = new BadConsequence("Pierdes dos niveles y dos tesoros ocultos",2,0,2);
        prize=new Prize(2,1);
        monstruos.add(new Monster("Semillas Cthulhu",4,badConsequence,prize));
        
        tVisible= new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
        tHidden=new ArrayList();
        badConsequence = new BadConsequence("Te intentas escaquear. Pierdes una mano visible",0,tVisible,tHidden);
        prize=new Prize(2,1);
        monstruos.add(new Monster("Dameargo",1,badConsequence,prize));
        
        tVisible= new ArrayList();
        tHidden=new ArrayList();
        badConsequence = new BadConsequence("Da mucho asquito. Pierdes 3 niveles",3,0,0);
        prize=new Prize(1,1);
        monstruos.add(new Monster("Pollipólipo volante",3,badConsequence,prize));
        
        tVisible= new ArrayList();
        tHidden=new ArrayList();
        badConsequence = new BadConsequence("No le hace gracia que pronuncien mal su nombre. Estas muerto",true);
        prize=new Prize(3,1);
        monstruos.add(new Monster("Yskhtihyssg-Goth",12,badConsequence,prize));
        
        tVisible= new ArrayList();
        tHidden=new ArrayList();
        badConsequence = new BadConsequence("La familia te atrapa. Estás muerto",true);
        prize=new Prize(4,1);
        monstruos.add(new Monster("Familia feliz",1,badConsequence,prize));
        
        tVisible= new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS));
        tHidden=new ArrayList();
        badConsequence = new BadConsequence("La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible",2,tVisible,tHidden);
        prize=new Prize(2,1);
        monstruos.add(new Monster("Roboggoth",8,badConsequence,prize));
        
        tVisible= new ArrayList(Arrays.asList(TreasureKind.HELMET));
        tHidden=new ArrayList();
        badConsequence = new BadConsequence("Te asusta en la noche. Pierdes un casco visible",0,tVisible,tHidden);
        prize=new Prize(1,1);
        monstruos.add(new Monster("El espia",5,badConsequence,prize));
        
        tVisible=new ArrayList();
        tHidden=new ArrayList();
        badConsequence = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles",2,5,0);
        prize=new Prize(1,1);
        monstruos.add(new Monster("El Lenguas",20,badConsequence,prize));
        
        tVisible= new ArrayList(Arrays.asList(TreasureKind.ONEHAND));
        tVisible.add(TreasureKind.ONEHAND);
        tVisible.add(TreasureKind.BOTHHANDS);        
        tHidden=new ArrayList(Arrays.asList());
        badConsequence = new BadConsequence("Te faltan manos para tanta cabeza. Pierdes 3 niveles y tus tesoros visibles de las manos",0,tVisible,tHidden);
        prize=new Prize(1,1);
        monstruos.add(new Monster("Bicéfalo",20,badConsequence,prize));
        
        
        
        
        
        
        
        
        
        ///------------PRUEBAS------------//////
        /* Prize p = new Prize(4,2);
         BadConsequence b = new BadConsequence("hola",1,2,3);
        
        System.out.println(p);
        System.out.println(b);*/
        
        //muestra todos los monstruos//
        System.out.println("\nTODOS LOS MONSTRUOS\n");
        for(int i=0; i< monstruos.size();i++)
            System.out.println(monstruos.get(i));
        
        //Niveles por encima de 10
        System.out.println("\nNIVELES ENCIMA DE 10\n");
        for(int i=0; i< monstruos.size();i++){
            if(monstruos.get(i).getCombatLevel()>10)
                System.out.println(monstruos.get(i));
        }
        
        //Malrollo, pérdida de niveles
        System.out.println("\nSÓLO PERDIDA DE NIVELES\n");
        for(int i=0; i< monstruos.size();i++){
           if(monstruos.get(i).getBadconsequence().getLevels() >0  && 
                   monstruos.get(i).getBadconsequence().getnVisibleTreasures() == 0 && monstruos.get(i).getBadconsequence().getnHiddenTreasures() == 0 &&
                   monstruos.get(i).getBadconsequence().getSpecificHiddenTreasures().isEmpty() && monstruos.get(i).getBadconsequence().getSpecificVisibleTreasures().isEmpty())
                System.out.println(monstruos.get(i));
        }
        
        //buen rollo ganancia de niveles mas que uno
        System.out.println("\nBUEN ROLLO, GANANCIA DE NIVELES MÁS DE 1\n");
        for(int i=0; i< monstruos.size();i++){
           if(monstruos.get(i).getPrize().getLevel()>1)
                System.out.println(monstruos.get(i));
        }
        
        
        //mal rollo perdida de tesoros determinados (ONEHAND o algo asi)
        int contador=0;
        System.out.println("\nPÉRDIDA DE UN TESORO DETERMINADO \n");
        for(int i=0; i< monstruos.size();i++){
            
                       if(!monstruos.get(i).getBadconsequence().getSpecificHiddenTreasures().isEmpty() ||
                        !monstruos.get(i).getBadconsequence().getSpecificVisibleTreasures().isEmpty()  ){
                        System.out.println(monstruos.get(i));
                        contador++;
                    }
             
        }
        System.out.println(contador);
    }
    
}
