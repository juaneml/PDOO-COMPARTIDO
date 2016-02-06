/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NapakalakiGame;

import GUI.*;
import java.util.ArrayList;
/**
 *
 * @author Raul
 */
public class NapakalakiMain {
    /*Variable local de tipo ArrayList para añadir los nombre*/
    
    
    
    public static void main(String[] args) {
     ArrayList names = new ArrayList();
        
   /*1*/     Napakalaki game = Napakalaki.getInstance();   
   /*2*/     NapakalakiView napakalakiView = new NapakalakiView();        
   /*3*/     Dice.createInstance(napakalakiView);        
   /*4*/     napakalakiView.setNapakalaki(game);
   
     
   
   /*D) comenzar el juego leyendo los nombres*/
   
   /*3*/ PlayerNamesCapture namesCapture = new PlayerNamesCapture(napakalakiView,true);
         namesCapture.setVisible(true);
   /*4*/ names = namesCapture.getNames();
   /*5*/ game.initGame(names);
   
   
   /*6*/ napakalakiView.setVisible(true);
    }
    
    
}
