/*
 Crea una función que indique si una frase o palabra pasada 
por parámetro es un palindromo. Usa las funciones adicionales 
que consideres adicionales.
 */
package ejerciciojava26;
/**
 * @author Rodolfo
 */
public class EjercicioJava26 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     if(esPalindromo("Alola")){
         System.out.println("Es palindromo");
     }else{
         System.out.println("No es palindromo");
     }   
        
    }
    
    public static String invertirString(String frase){
        
        String invertida = "";
        
        char caracter;
        for (int i = frase.length() -1; i >= 0; i--) {
        caracter = frase.charAt(i);
        invertida+=caracter;
        }
        return invertida;
    } 
                
     public static boolean esPalindromo (String frase){
      
     frase = frase.toLowerCase().trim();
         
     String invertida = invertirString(frase);
     
     if (frase.equals(invertida)){
         return true;
     }else{
      return false;
        
    }
  }  
}
