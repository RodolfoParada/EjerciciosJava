/*
Crea un método que dado un número, muestre sus dígitos.
 */
package ejerciciojava27;
/**
 * @author Rodolfo
 */
public class EjercicioJava27 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        muestraDigitos(10);
    }
    public static void muestraDigitos (int numero){
    
        final int DIVISOR =10;
    
        for (int i = numero; i > 0; i /= DIVISOR) {
            
            System.out.print(i % DIVISOR+ " ");
            
            
        }
        
    }
    
}
