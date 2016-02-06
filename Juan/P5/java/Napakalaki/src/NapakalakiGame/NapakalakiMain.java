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
    
    public static void main(String[] args) {
        
        Napakalaki game = Napakalaki.getInstance();
        NapakalakiView napakalakiView = new NapakalakiView();
        
        Dice.createInstance(napakalakiView);
        
        napakalakiView.setNapakalaki(game);
        
        
        //Apartado D
        ArrayList<String> names = new ArrayList();
        PlayerNamesCapture namesCapture = new PlayerNamesCapture(napakalakiView,true);
        names = namesCapture.getNames();
        game.initGame(names);
        
        napakalakiView.setVisible(true);//Esta siempre tiene que ser la ultima instruccion
    }
    
}
