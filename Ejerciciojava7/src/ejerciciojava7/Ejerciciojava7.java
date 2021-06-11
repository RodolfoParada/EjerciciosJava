/*
 pide una cadena por consola y muestra sus caracteres uno a uno.
 */
package ejerciciojava7;

import java.util.Scanner;

public class Ejerciciojava7 {

    public static void main(String[] args) {
       
            Scanner sc = new Scanner(System.in);
            sc.useDelimiter("\n");
            
            System.out.println("Insertar una frase");
            String frase = sc.next();
            
            char caracter;
            for (int i = 0; i < frase.length(); i++) {
                caracter = frase.charAt(i);
                System.out.println(caracter);
        }
            
    }
    
}
