
package ejerciciojava18;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Rodolfo
 */
public class EjercicioJava18 {

    /**
     Pide un Salario base por consola y su puesto por consola.
     Calcula su sueldo sabiendo lo siguiente:
     
    Si es vendedor, cobra 3000  dolares más.
    Si es director, cobra 10000 dólares más.
    Si es conserje, cobra 1000  dólares más.
    
    Utiliza en un enumerado para almacenar los tipos de puestos de trabajos.
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       sc.useDelimiter("\n");
       sc.useLocale(Locale.ENGLISH);
       
        System.out.println("Escribe un salario");
        double salarioBase = sc.nextDouble();
        
        System.out.println("Escribe un puesto");
        String puesto = sc.next().toUpperCase().trim();
        
        boolean existe = false;
        for (PuestoTrabajo p:PuestoTrabajo.values()) {
            if(puesto.equals(p.name())){
                existe = true;
            
        }
    }
       if (existe){
           
           double salarioFinal = salarioBase;
           PuestoTrabajo p = PuestoTrabajo.valueOf(puesto);
           
           switch(p){
               case VENDEDOR:
                   salarioFinal += 3000;
               break;
               case DIRECTOR:
                   salarioFinal += 10000;
               break;
               case CONSERJE:
                   salarioFinal += 1000;
               break;
                            
           }
           System.out.println("El salario final es "+salarioFinal);
       }else{
           System.out.println("ese puesto no lo puedo contabilizar");
       }
       
       
    }
    
}
