
package napakalaki;

/**
 *
 * @author juane
 * @version 1.0
 */
public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BadConsequence bd = new BadConsequence("la pistola",11,1,1);
       Prize price = new Prize(1,1);
       Monster prueba = new Monster("prueba",1,bd,price);
       
       System.out.println(prueba);
    }
    
}
