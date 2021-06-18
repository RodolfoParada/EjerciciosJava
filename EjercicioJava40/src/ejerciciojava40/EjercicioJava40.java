/*
 Dado un array de caracteres (te lo doy yo) y tu numero de RUT, debes
sacar la letra de tu rut.

Para obtenerla solo deber sacar el módulo de 23 y ese sera el 
indice del array.
 */
package ejerciciojava40;

import java.util.Scanner;
/**
 * @author Rodolfo
 */
public class EjercicioJava40 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
              
        char letrasNIF[]= {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 
            'S' ,'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
    

        System.out.println("Escribe tu numero de RUT");
        int rut = sc.nextInt();
    
        final int DIVISOR= 23;
        int indiceLetra = rut % DIVISOR;
    
      
        System.out.println(letrasNIF[indiceLetra]);


}

}











