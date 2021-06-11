/*
Pide una frase o palabra con consola e inviertela
 */
package ejerciciojava13;

import java.util.Scanner;

/**
 *
 * @author Rodolfo
 */
public class EjercicioJava13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.println("Escribir una frase o palabra");
        String frase = sc.next();
        
        String invertida="";
        char caracter;
        for (int i = frase.length()-1; i>=0;i--){
            caracter = frase.charAt(i);
            invertida+=caracter;
        }
        System.out.println("invertida: "+invertida);
    }
    
}
