/*
Pide un numero real que represente a un precio y muestra el 
precio con IVA. El IVA es de 21%. 
 */
package ejerciciojava11;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Rodolfo
 */
public class EjercicioJava11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      sc.useLocale(Locale.US);
      
      final double IVA = 0.21;
      
        System.out.println("Escribe un numero real");
        double precioSinIVA = sc.nextInt();
        
      //  double precioConIva = precioSinIVA + (precioSinIVA * IVA);
        double precioConIVA = precioSinIVA * ( 1 + IVA);
        
        System.out.println("El precio final es de" +precioConIVA );
    }
    
}
