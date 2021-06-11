/*
 Pide un año por teclado(numero) e indica si es bisiesto o no.
Es bisiesto cuando divisible entre 4 y no divisible entre 100.
o si es divisible entre 400.
 */
package ejerciciojava9;

import java.util.Scanner;

/**
 *
 * @author Rodolfo
 */
public class EjercicioJava9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un Año");
        int anio = sc.nextInt();
        
        if(anio % 4 == 0 && anio % 100 !=0 || anio % 400 == 0){
            System.out.println("Es bisiesto");  
            
        }else{
            System.out.println("No es bisiesto");
        }
        
        
    }
    
}
