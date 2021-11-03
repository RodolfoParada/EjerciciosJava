/*
 Vamos a hacer un pequeño ahorcado.
 Tendremos un pequeño array con palabras que tu elijas, créalo tu mismo.
 Debes mostrar la palabra cogida con guiones e ir pidiendo letras.
 Si falla 6 veces, el usuario pierde.
 */
package ejerciciojava42;

import java.util.Scanner;

/**
 * @author Rodolfo
 */
public class EjercicioJava42 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        final int NUM_FALLOS_MAX=6;
        
        
       final  String[] palabras = {
          "chiste",
          "elefante",
          "alberto",
          "coche",
          "llaves",
          "naranja"  
        };
        Scanner sc = new Scanner (System.in);
        
        String palabraAdivinar = palabras[generaNumeroAleatorio(0,palabras.length-1)];
        
       char[] caracteres = palabraAdivinar.toCharArray();
       boolean[] acertados = new boolean[caracteres.length];
       int numeroFallos=0;
       boolean ganaUsuario = false;
       
       char caracter;
       while(!palabraAcertada(acertados) && numeroFallos < NUM_FALLOS_MAX){
           
       
       mostrarCaracteres(caracteres,acertados);
        System.out.println("Escribe una letra");
       caracter = sc.next().toLowerCase().charAt(0);
       
       
       if(revelarCaracteres(caracter,caracteres,acertados)> 0){
           System.out.println("Has acertado con el caracter");
       }else{
           numeroFallos++;
           System.out.println("Has fallado te quedan "+(NUM_FALLOS_MAX - numeroFallos)+"fallos");
       }
    }
    
    if (palabraAcertada(acertados)){
            System.out.println("Has ganado");
    }else{
            System.out.println("Has perdido");
}
    }

    
    public static int generaNumeroAleatorio (int minimo, int maximo){
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }

    public static void mostrarCaracteres(char[] caracteres, boolean[] acertados){
           
        for (int i = 0; i < caracteres.length; i++) {
            if(acertados[i]) {
                System.out.println(caracteres[i]+" ");
                
            }else{
                System.out.println("_ ");
            }
        }
        System.out.println("");
     
    }
    public static boolean palabraAcertada(boolean[] acertados){
        
        for (int i = 0; i < acertados.length; i++) {
            if(!acertados[i]){
                return false;
            }
        }
        return true;
    }
    public static int  revelarCaracteres(char caracter, char[] caracteres, boolean[] acertados){
     
        int acertadas=0; 
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i]==caracter){
                acertados[i]=true;
                acertadas++;
            }
            
        }
        return acertadas;
    }

}