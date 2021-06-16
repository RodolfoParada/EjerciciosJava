/*
 Crea una función que dado dos parámetros, siendo el primero un String
 y el segundo un boolean, cuente las letras minúsculas o mayúsculas,
Según el valor del segundo parámetro.

true = mayusculas, falso = minusculas
 */
package ejerciciojava28;
/**
 * @author Rodolfo
 */
public class EjercicioJava28 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(cuentaLetras("hola",false));
       
    }
    public static int cuentaLetras(String frase,boolean mayus){
        
     int min,max,contador=0;
    
     if(mayus){
         min = 65;
         max = 90;
     
    }else{
         min = 97;
         max = 122;
     }
    char caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            if(caracter >= min && caracter <= max){
               contador++;
            }    
           }
        return contador;
          }
        }
