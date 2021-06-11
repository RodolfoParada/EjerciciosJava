/*
 Vamos a jugar a un pequeño juego.
 vamos a generar un numero aleatorio entre 1 y 100.
 Debes pedir al usuario números que estén entre estos dos números
 (debes controlarlos). Si el usuario falla, debes indicarle si el 
 número que introdujo es mayor o menor que el que debe acertar.
 El programa termina cuando el usuario acierta. No hay limite de 
 intentos.
 */
package ejerciciojava16;

import java.util.Scanner;

/**
 @author Rodolfo
 */
public class EjercicioJava16 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int maximo = 100;
        int minimo = 1;
        
        int numeroAcertar = (int) (Math.random() * (maximo - minimo +1) + (minimo));
        int numeroUsuario;
        boolean fin= false;
        
        while(!fin){
          
            do{
                 System.out.println("Dame un numero entre 1 y 100");
                 numeroUsuario = sc.nextInt();
            
            if(!(numeroUsuario >=minimo && numeroUsuario <=maximo)){
                System.out.println("Debes escribir un numero entre "+ minimo + " y " + maximo);
            }
        
        } while (!(numeroUsuario >= minimo && numeroUsuario <=maximo));
        
        if(numeroUsuario < numeroAcertar ){
              System.out.println("Es mayor que el que introdujiste");      
        
        }else if (numeroUsuario > numeroAcertar){
              System.out.println("Es menor que el que instrodujiste");
        }else{
              System.out.println("¡Haz acertado! el número era el "+numeroAcertar);
           fin = true;   
        }                
    }
  }
}

    

