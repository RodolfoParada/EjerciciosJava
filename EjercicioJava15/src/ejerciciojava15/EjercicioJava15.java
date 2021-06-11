/*
 Pide una frase por consola e indica si es palindromo.
 Es palindromo cuando se lee una frase igual de izquierda a derecha
 que de derecha a izquierda. por ejemplo, alola.
 */
package ejerciciojava15;

import java.util.Scanner;

/**
 *
 * @author Rodolfo
 */
public class EjercicioJava15 {

    public static void main(String[] args) {
       
     Scanner sc = new Scanner(System.in);
     sc.useDelimiter("\n");
     
     System.out.println("Escriba un frase o palabra");
     String frase = sc.next().trim();
     
     String invertida= "";
     
     char caracter;
        for (int i = frase.length()-1; i >= 0; i--) {
        caracter = frase.charAt(i);
        invertida+=caracter;
        }
       if(frase.equals(invertida)){
         System.out.println("Es palindromo");
    }else{
            System.out.println("no es palindromo");
    }
  }
}
