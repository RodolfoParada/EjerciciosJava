/*
 Pedir palabras al usuario hasta que el usuario escriba una cadena vacia.
 Muestra la concatenación de esas palabras al final.
 */
package ejerciciojava8;

import java.util.Scanner;

public class EjercicioJava8 {

 
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter("\n");
    
        System.out.println("Dame una cadena");
        String cadUsuario = sc.next();
        
        String concatenar = "";
        
        while(!cadUsuario.isEmpty()){
            
            concatenar += cadUsuario;
            
            System.out.println("dame una cadena");
            cadUsuario = sc.next();
        
        }
        System.out.println(concatenar);
    }
    
}
