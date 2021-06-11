/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava2;

import java.util.Scanner;

/**
 *
 * @author Rodolfo
 */
public class EjercicioJava2 {

    /**
     * pide un nombre por consola y saludalo por consola.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.println("Escribe un nombre");
        String nombre = sc.next();
        
        System.out.println("¡Hola " +nombre+"!");
       
      
        
        
    }
   
}
