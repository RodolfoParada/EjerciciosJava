/*
 Crea una función que pasados 2 números y muestra todos los pares
 entre esos 2 números.
 */
package ejerciciojava23;
/**
 * @author Rodolfo
 */
public class EjercicioJava23 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        paresEntre(10,1);
          
}
    public static void paresEntre(int inicio,int fin){
      
   //   if (inicio > fin) {
    //      int aux = inicio;
     //     inicio=fin;
       //   fin = aux;
    
        
        for (int i = inicio; i <= fin; i++) {
            if(i % 2 ==0){
                System.out.println(i);
            }
            
        }
       
        
    }
}

 