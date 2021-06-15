/*
 Crea una función que valide un número entre dos números.
 Necesitas dos parámettros numéricos.
 */
package ejerciciojava25;

import java.util.Scanner;

/**
 * @author Rodolfo
 */
public class EjercicioJava25 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(validaNumero(1000,10));
    
    }
    public static int validaNumero(int minimo, int maximo){
      
         Scanner sc= new Scanner(System.in);
                
        if ( minimo >maximo){
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }
    
        int numero;
    
    do {
    System.out.println("Escribe un numero");
    numero = sc.nextInt();
    
            if (!(numero >=minimo && numero <=maximo)) {
                System.out.println("Debes escribir un numero entre "+minimo+ "y "+maximo);
                
            }
    }while (!(numero >=minimo && numero <=maximo));
        
    return numero;
   
}
}
    
    
    

