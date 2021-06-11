
package ejerciciojava4;

import java.util.Scanner;

/**
 Pide 2 números por consola e indica cual es el menor de los 2 numeros.
 * En caso de que sean iguales, tambien lo debes indicar.
 
 */
public class EjercicioJava4 {

 
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserta el primer numero");
        int num1 = sc.nextInt();
        
        System.out.println("Inserta el segundo numero");
        int num2 = sc.nextInt();
        
        if(num1<=num2){
            if(num1==num2){
            System.out.println("el num1 y el num2 son iguales");     
            }else{
            System.out.println("el num1 es menor que el num2");
            }
            }else{
            System.out.println("el numero es menor que el num1");
        }
    }
    
}
