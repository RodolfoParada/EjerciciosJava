/*
 Crea una función que dándole un número decimal nos lo pase a octal.
 Por ejemplo: 123 = 1 * 10^2 + 7 * 10^1 + 3 * 10^0
 */
package ejerciciojava24;
/**
 * @author Rodolfo
 */
public class EjercicioJava24 {
/**
* @param args the command line arguments
*/
    public static void main(String[] args) {
        System.out.println(decimalaAOctal(123));
    }
        
     public static int decimalaAOctal(int decimal){
   
    int octal =0;
    int digito;
    final int DIVISOR= 8;
    
            for (int i = decimal, j = 0; i > 0; i /=8,j++) {
                digito = i % DIVISOR;
                
                octal +=digito * Math.pow(10, j);
                
            }
            return octal;
            
        }
      
    }

