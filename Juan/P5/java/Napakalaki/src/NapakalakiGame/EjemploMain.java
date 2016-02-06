
package NapakalakiGame;

import Test.GameTester;

public class EjemploMain {

    public static void main(String[] args) throws CloneNotSupportedException {
      Napakalaki game = Napakalaki.getInstance();
      GameTester test = GameTester.getInstance();
      
      // Poner el numero de jugadores con el que se quiera probar
      
      test.play(game, 3); 
      
              
    }
}
