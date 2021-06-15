/*
 Crear un función que genere un número aleatorio entre dos números
 pasados parámetros.
*/
package ejerciciojava22;

/**
 *
 * @author Rodolfo
 */
public class EjercicioJava22 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            System.out.println(generaNumeroAleatorio(1,10));
            
        }
        
    }
 public static int generaNumeroAleatorio(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1)+(minimo));
     }
}
