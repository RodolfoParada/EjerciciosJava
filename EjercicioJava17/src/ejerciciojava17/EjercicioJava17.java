package ejerciciojava17;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Rodolfo
 */
public class EjercicioJava17 {
/*
Pide dos números por teclado y crea un pequeño menú con las
siguientes opciones;

1) Sumar
2) Restar
3) Multiplicar
4) Dividir
5) Módulo

Al final debemos preguntar si queremos realizar 
más, en caso afirmativo, volvemos a empezar.
 */
  
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion, num1,num2, resultado = 0; // Guardaremos la opcion del Usuario
        String respuesta; 
        
        while (!salir){
            
            System.out.println("Escribe un numero");
            num1=sc.nextInt();
            
            System.out.println("Escribe un numero");
            num2=sc.nextInt();
        
            System.out.println("1. Sumar       1");
            System.out.println("2. Restar      2");
            System.out.println("3. Multiplicar 3");
            System.out.println("4. Dividir     4");
            System.out.println("5. Modulo      5");
            
            
            try {
                System.out.println("Escribe una de las Opciones");   
                opcion = sc.nextInt();
                 
                switch (opcion){
                    case 1:
                        resultado = num1+num2;
                        break;
                    case 2:
                        resultado = num1-num2;
                        break;
                    case 3:
                        resultado = num1*num2;
                        break;
                    case 4:
                        if (num2 == 0){
                            System.out.println("No puedes dividir entre 0");
                        }else{
                            double div= (double)num1/num2;
                            System.out.println("El resultado es "+ div);
                        }
                        break;
                    case 5:
                        resultado = num1 % num2;
                        break;    
                        
                    
                        
                    default:
                        System.out.println("Solo numeros entre 1 y 5");     
                }
                        if (opcion != 4) {
                            System.out.println("El resultado es " +resultado);
                            
                        
                }
               
            
            }catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
                            
                }
            System.out.println("Quieres continuar? (S/N)");  
             respuesta = sc.next().toLowerCase().trim();
                    
            if (respuesta.charAt(0)=='n'){
             salir=true;
        
        }        
       }
      }
    }

                    
       
                
                
            
            
  
    
