/*
 Crear una función que me devuelva la suma del 1 al numero pasado
 por parámetro (este incluido).
 */
package ejerciciojava21;

import static ejerciciojava21.EjercicioJava21.suma1N;

/**
 * @author Rodolfo
 */
public class EjercicioJava21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int n =10;
   
   //int res = suma1N(n);
   // System.out.println(res);    
       
   
       System.out.println(suma1N(n));
       
    
    }
    public static int suma1N(int n){
       int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma +=i;
        }
        return suma;
              
        
    }
    
  
}
