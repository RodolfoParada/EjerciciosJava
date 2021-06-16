/*
 Crea una función que genere una password aleatoriamente con letras
 mayúsculas, minúsculas y números.
 Pasale por parámetro la longitud del password .
 */
package ejerciciojava30;

/**
 *
 * @author Rodolfo
 */
public class EjercicioJava30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(generaPassword(30));
     
    }
    public static int generaNumeroAleatorio(int minimo,int maximo){
        return (int) (Math.random() * (maximo - minimo +1) + (minimo));
        
    }
    
    public static char generaMayusAleatoria(){
        return (char) generaNumeroAleatorio(65,90);
        
    }    
    public static char generaMinusculaAleatoria(){
        return (char) generaNumeroAleatorio(97,122);
    }
    public static String generaPassword(int longitud){
        String password ="";
        int eleccion;            
        for (int i = 0; i < longitud; i++) {
            
            eleccion = generaNumeroAleatorio(1,2);
            
        switch (eleccion){
            case 1://numero
              password +=generaNumeroAleatorio(0,9);
            break;    
            case 2:
               password +=generaMayusAleatoria();
            break;
            case 3:
               password +=generaMinusculaAleatoria();
             break;
            
        }    
        }

     return password;
     
    }
}
