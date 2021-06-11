/*
 Pedir un número por consola y mostrar la tabla del 10
 */
package ejerciciojava6;

import java.util.Scanner;


public class EjercicioJava6 {
 
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Inserta un numero");
        int num =sc.nextInt();
        
        int res = 0;
        for (int i = 1; i <= 10; i++) {
            res = i * num;
            System.out.println(num+" * "+i+" = "+res);
        }
       
    }
    
}
