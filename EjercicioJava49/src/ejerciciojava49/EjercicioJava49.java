/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava49;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioJava49 {

    /**
    Teniendo una matriz de char de 8x8 simular el lmovimiento de un 
    alfil de ajedrez.
    Pudiendose moverse en diagonal dentro del tablero.
    Deberas mostrar donde se encuentra en cada momento.
    Su posicion inicial sera aleatoria.
    Mi consejo es que uses un menú.
     */
    public static void main(String[] args) {
       
          final char VACIO ='X';
          final char ALFIL = 'O';
        
        char[][]matriz = new char[8][8];
        
        rellenarMatriz(matriz,VACIO);
        
        int posActualAlfilX = generaNumeroAleatorio(0,matriz.length -1);// fila
        int posActualAlfilY = generaNumeroAleatorio(0,matriz[0].length);// columna
        
        
        int posAntiguaAlfilX, dirX = 0;
        int posAntiguaAlfilY, dirY = 0;       
        
        matriz[posActualAlfilX][posActualAlfilY] = ALFIL;
       
       
        
        
        Scanner sn= new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario.
    
      
      while (!salir){
        
        mostrarMatriz(matriz);
        
        System.out.println("¿Donde queieres moverte?");
        System.out.println("1.Mover arriba-derecha");
        System.out.println("2.Mover abajo-derecha");
        System.out.println("3.Mover abajo-izquierda");
        System.out.println("4.Mover arriba-izquierda");
        System.out.println("5.Salir");
        
        try {
        
        System.out.println("Escribe una de las opciones");
        opcion = sn.nextInt();
        
        
        
       posAntiguaAlfilX = posActualAlfilX;
       posAntiguaAlfilY = posActualAlfilY;  


        switch (opcion){
            case 1:
                dirX = -1;
                dirY = 1;
                break;
            case 2:
                dirX = 1;
                dirY = 1;
                break;
            case 3:
                dirX = 1;
                dirY = -1;
                break;
            case 4:
                dirX = -1;
                dirY = -1;
                break;
           
            case 5:
                salir = true;
                break;
            default:
                System.out.println("Solo números entre 1 y 5");
        }
        
        while (estaDentroMatriz(matriz.length, matriz[0].length,
                posActualAlfilX + dirX, posActualAlfilY + dirY )){
              posActualAlfilX += dirX;
              posActualAlfilY += dirY;
        }
          
         matriz[posAntiguaAlfilX][posAntiguaAlfilY] = VACIO;
        matriz[posActualAlfilX][posActualAlfilY] = ALFIL;
               
       
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

