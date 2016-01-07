/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import NapakalakiGame.Napakalaki;


/**
 *
 * @author juane
 */
public class prueba2 {
    
   private static final prueba2 instance = new prueba2();
   
   private static prueba2 dameinstance(){
       return instance;
   }
   private int a;
    
    public int num(){
        return a;
    }
    
    public prueba2(){
        a = 1;
    }
}
