/*
 Crea un array de 3 posiciones,rellenalo pidiendo los números al 
usuario y recorrelo para mostrarlo.
 */
package ejerciciojava31;

import java.util.Scanner;

/**
 * * @author Rodolfo
 */
public class EjercicioJava31 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
       int[] numeros= new int[3];
       int numero;
        System.out.println("Insertando Numeros");
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("Inserta un numero en la posición "+i);
            numero=sc.nextInt();
            numeros[i]=numero;
            
        }
        System.out.println("Mostrat array");
        for (int i = 0; i < numeros.length; i++) {
             System.out.println(numeros[i]);
            
        }
       
       
       
    }
    
}
