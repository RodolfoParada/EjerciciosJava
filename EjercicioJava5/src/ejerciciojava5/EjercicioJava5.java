/*
 Mostrar los numeros pares que hay entre el 1 y 10 (while y for)
 
 */
package ejerciciojava5;

public class EjercicioJava5 {


    public static void main(String[] args) {
       
    // while
        System.out.println("while");
        System.out.println("-----");
    
    int i=1;
    while(i <= 10){
       if(i % 2 == 0){
           System.out.println(i);
       }
             i++;
    }
    
    // For
        System.out.println("For");
        System.out.println("---");
        
        for (int j = 1; j <= 10; j++){
            if(j % 2 == 0){
             System.out.println(j);   
            }
           
        }
        
        
        // For akteranativo
        System.out.println("For");
        System.out.println("---");
        for (int h = 2; h <= 10; h+=2){
           // if(h % 2 == 0){
             System.out.println(h);
    
    }  
        
    
            
        }
        
   
   }
 

