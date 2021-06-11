/*
Pide un numero y valida que ese número este entre 0 y 10.
Hazlo con un do-while.
 */
package ejerciciojava10;

import java.util.Scanner;

 /** @author Rodolfo**/

public class EjercicioJava10 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
                      
        int numero;
        do{
            System.out.println("Escribe un numero");
            numero = sc.nextInt();
            
            if(!(numero>=0 && numero<=10)){
                System.out.println("Debes escribir un numero entre 0 y 10");
            }
                    
        }while( !(numero>=0 && numero<=10));
        System.out.println("El numero "+numero+" esta entre 0 y 10");
       
        
    
    }
    }
    
