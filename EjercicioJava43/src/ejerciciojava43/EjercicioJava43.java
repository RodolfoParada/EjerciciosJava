
package ejerciciojava43;

import java.util.Scanner;

/**
 * @author Rodolfo
 */
public class EjercicioJava43 {
    /**
     Crea una matriz de números de 3x3, pidiendo cada numero.
     Al final recorde la matriz y muestrala.
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int[][] matriz= new int [3][3];
    
        for (int i =0; i<matriz.length; i++){  
    
             for (int j = 0; j < matriz[0].length; j++){
            
                System.out.println("Escribe un numero en la posicion i: "+i+" j:"+j  );
                 matriz[i][j] = sc.nextInt();
             
             }             
          }
        
        for (int i =0; i<matriz.length; i++){    
               
        for (int j = 0; j < matriz[0].length; j++){
                 System.out.println(matriz[i][j]+" ");
        }
            System.out.println("");
           
     }
    }
   }





