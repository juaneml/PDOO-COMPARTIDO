/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NapakalakiGame;

/**
 *
 * @author Raul
 */
public class prueba extends Absprueba implements Interfaceprueba {
    
    prueba(){
        super.valor=3;
    }
    
    @Override
    public void diHola(){
        super.diHola();
        System.out.print(" tu culo no mola" + numero);
    }
    
    @Override
    public void diAdios(){
        super.diAdios();
        System.out.print(" tu culo no mola");
    }
}
