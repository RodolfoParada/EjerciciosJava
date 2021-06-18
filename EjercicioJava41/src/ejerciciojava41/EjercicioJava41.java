/*
 Teniendo un array de String con el nombre de personas y otro de 
números con su edad, indicar quien es la persona mas mayor.
 */
package ejerciciojava41;
/**
 * @author Rodolfo
 */
public class EjercicioJava41 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres = {"Fernado","Jaime","Alberto","Pepito"};
        int[] edades = {28,31,20,40};
        
        int edadMayor = edades[0];
        int posicionMayor = 0;
        
        for (int i = 1; i < edades.length; i++) {
            
            if(edades[i] > edadMayor ){
                edadMayor = edades[i];
                posicionMayor =i;
            }
            
        }
        System.out.println("La persona mas mayor es "+nombres[posicionMayor]+" con "+edadMayor);
    }
    
}
