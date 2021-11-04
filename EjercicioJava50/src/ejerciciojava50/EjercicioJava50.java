
package ejerciciojava50;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioJava50 {

    /**
     Teniendo una matriz de char de 8x8 simular el movimiento de una 
     torre de ajedrez.
     Pudiendose moverse en diagonal dentro del tablero.
     Deberas mostrar donde se encuentra en cada momento.
     Su posicion inicial sera a aleatoria.
     Mi consejo es que use un menú.
     */
    public static void main(String[] args) {
           final char VACIO ='X';
          final char TORRE = 'O';
        
        char[][]matriz = new char[8][8];
        
        rellenarMatriz(matriz,VACIO);
        
        int posActualTorreX = generaNumeroAleatorio(0,matriz.length -1);// fila
        int posActualTorreY = generaNumeroAleatorio(0,matriz[0].length);// columna
        
        
        int posAntiguaTorreX, dirX = 0;
        int posAntiguaTorreY, dirY = 0;       
        
        matriz[posActualTorreX][posActualTorreY] = TORRE;
       
       
        
        
        Scanner sn= new Scanner(System.in);
        boolean salir = true;
        int opcion; // Guardaremos la opcion del usuario.
    
      
      while (!salir){
        
        mostrarMatriz(matriz);
        
        System.out.println("¿Donde queieres moverte?");
        System.out.println("1.Mover arriba");
        System.out.println("2.Mover derecha");
        System.out.println("3.Mover abajo");
        System.out.println("4.Mover izquierda");
        System.out.println("5.Salir");
        
        try {
        
        System.out.println("Escribe una de las opciones");
        opcion = sn.nextInt();
        
        
        
       posAntiguaTorreX = posActualTorreX;
       posAntiguaTorreY = posActualTorreY;  


        switch (opcion){
            case 1:
                dirX = -1;
                dirY = 0;
                break;
            case 2:
                dirX =  0;
                dirY = 1;
                break;
            case 3:
                dirX = 1;
                dirY = 0;
                break;
            case 4:
                dirX = 0;
                dirY = -1;
                break;
           
            case 5:
                salir = true;
                break;
            default:
                System.out.println("Solo números entre 1 y 5");
        }
        
        while (estaDentroMatriz(matriz.length, matriz[0].length,
                posActualTorrreX + dirX, posActualTorrreY + dirY )){
              posActualTorreX += dirX;
              posActualTorreY += dirY;
        }
          
         matriz[posAntiguaTorreX][posAntiguaTorrreY] = VACIO;
        matriz[posActualTorreX][posActualTorreY] = TORRE;
               
       
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();
            }
          }   
        }
   
    public static int generaNumeroAleatorio(int minimo,int maximo) {
         return (int) (Math.random() * (maximo - minimo +1) + (minimo));
    }

  
    public static void mostrarMatriz (char[][] matriz){
 
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.println(matriz[i][j] + " ");
              }
              System.out.println("");
             }
            }
    public static void rellenarMatriz (char[][] matriz,char simbolo){
 
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
              matriz[i][j] = simbolo;  
              }
             
             }
            }
    public static boolean  estaDentroMatriz(int longitudFilas, int longitudColumnas, int x,int y){
      
    return x >= 0 && x < longitudFilas && y>=0 && y < longitudColumnas;
    } 
}


