/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava3;

import java.util.Scanner;

/**
 *
 * @author Rodolfo
 */
public class EjercicioJava3 {

    /**
     * pide dos numeros por consola y muestra su suma, resta, multiplicacion y 
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     
        System.out.println("Escribe el numero 1");
        int num1 = sc.nextInt();
        
        System.out.println("Escribe el numero 2");
        int num2 = sc.nextInt();
        
        int suma = num1+num2;
        System.out.println("La suma es: "+suma);
        
        int resta = num1-num2;
        System.out.println("La resta es: "+resta);
        
        int mult = num1 *num2;
        System.out.println("La multiplicacion es: "+mult);
        
        if (num2==0){
            System.out.println("No puedes dividir entre 0");
        }else {
        double division =(double)num1/num2;
        System.out.println("La division es: "+division);
        
        
    }
    
    }
}
