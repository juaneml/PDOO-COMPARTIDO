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
  
   
     
   
   /*D) comenzar el juego leyendo los nombres*/
   
   /*3*/ PlayerNamesCapture namesCapture = new PlayerNamesCapture(napakalakiView,true);
         namesCapture.setVisible(true);
   /*4*/ names = namesCapture.getNames();
   /*5*/ game.initGame(names);
   
   
   CardDealer a = CardDealer.getInstance();
   
   /*Player*/
    
   Player currentPlayer;
   currentPlayer = game.getCurrentPlayer();
   PlayerView playerModel = new PlayerView();  
   
   System.out.println(game.getCurrentPlayer().getName());
   playerModel.setPlayer(currentPlayer);
   playerModel.setVisible(true);
   /*Treasure*/
   Treasure treasure;
   TreasureView treasureModel = new TreasureView();
   treasure = a.nextTreasure();
   //treasureModel.setTreasure(treasure);
   
   /*Monstrous*/
   
   Monster monster;
   MonsterView monsterModel = new MonsterView();
   monster = a.nextMonster();
   /*BadConsequende*/
   BadConsequence badconsequence;
   BadConsequenceView badConsequenceModel = new BadConsequenceView();
   badconsequence = monster.getBadConsequence();
   badConsequenceModel.setBadConsequence(badconsequence);
   
   System.out.println(monster.getIcon());
  // monsterModel.setMonster(monster);
   
   
   
    /*4*/     napakalakiView.setNapakalaki(game);
   /*6*/ napakalakiView.setVisible(true);
    }
    
    
}
