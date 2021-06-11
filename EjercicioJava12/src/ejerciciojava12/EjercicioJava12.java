/*
 Pide un número de segundos e indica cuantas horas, minutos 
 y segundos equivalen.
 */
package ejerciciojava12;

import java.util.Scanner;

/**
 *
 * @author Rodolfo
 */
public class EjercicioJava12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                      
        Scanner sc = new Scanner(System.in);
       
        final int SEG_HOR = 3600;
        
        System.out.println("Escribe el numero de segundos");
        int segundos = sc.nextInt();
        
        int horas = segundos / SEG_HOR;
        
        int segundos_restantes = segundos % SEG_HOR;
        
        int minutos = segundos_restantes / 60;
        
        segundos = segundos_restantes % 60;
        
        System.out.println("son "+horas+"hora/s, "+minutos+" minuto/s,y "+segundos+"segundos");
        
        
        
        
    }
    
}
