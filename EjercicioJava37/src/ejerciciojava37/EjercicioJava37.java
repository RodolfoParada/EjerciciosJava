/*
 Pide una frase por consola y guarda en un array todos sus caracteres.
 */
package ejerciciojava37;

import java.util.Scanner;

/**
 * @author Rodolfo
 */
public class EjercicioJava37 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Scanner sc = new Scanner(System.in);
     sc.useDelimiter("\n");
     
        System.out.println("Escribe una frase");
        String frase = sc.next();

    
    // forma primera
       /* char[] caracteres = new char[frase.length()];
        
        char caracter;
        for (int i = 0; i < caracteres.length; i++) {
            caracter = frase.charAt(i);
            caracteres[i] = caracter;
        }
        
      mostrarArray(caracteres);  
               */
        
    //forma segunda  
     char[] caracteres = frase.toCharArray();
      mostrarArray(caracteres);  
      
    }
    public static void mostrarArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
