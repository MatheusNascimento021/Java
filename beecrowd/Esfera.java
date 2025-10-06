
package com.mycompany.esfera;
import java.util.Scanner;
import java.util.Locale;

public class Esfera {
  
    public static void main(String[] args) {
     
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        
        double volume = sc.nextDouble();
        double raio = (4.0/3) * 3.14159 * Math.pow(volume,3) ;
        
        System.out.printf("VOLUME = %.3f", raio);
        
        sc.close();
        
    }

    
}
