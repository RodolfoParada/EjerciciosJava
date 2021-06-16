/*
 Crea una función que dado un numero, decir cual es el digito
mas alto que tiene.
 */
package ejerciciojava29;
/**
 * @author Rodolfo
 */
public class EjercicioJava29 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(digitoMasAlto(51895423));    
        
    }
    
    public static int digitoMasAlto(int numero){    
        
        final int DIVISOR= 10;
        int mayor =0;
        
        for (int i = numero; i > 0; i /=DIVISOR) {
           if((i % DIVISOR) > mayor){
            mayor = i % DIVISOR;
        }
        }
        return mayor;
        }
    }



        
        
       
   
    

