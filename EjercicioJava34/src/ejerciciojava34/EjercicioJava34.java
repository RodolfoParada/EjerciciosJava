/*
 Crea dos arrays e indica si son iguales
 */
package ejerciciojava34;

import java.util.Arrays;

/**
 * @author Rodolfo
 */
public class EjercicioJava34 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5,6};
        
        if(Arrays.equals(a1, a2)){
            System.out.println("Los arrays son iguales");
        }else{ 
            System.out.println("Loa arrays no son iguales");
            
        }
    
    }
    
}
