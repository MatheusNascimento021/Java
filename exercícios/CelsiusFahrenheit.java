
package com.mycompany.celsiusfahrenheit;

import java.util.Scanner;
import java.util.Locale;

public class CelsiusFahrenheit {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        char resp;
        do{
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (9.0 * celsius / 5.0) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n",fahrenheit);
            System.out.print("Deseja repetir? [S/N]:");
            resp = sc.next().charAt(0);
        }while(resp != 'n');
                    
        sc.close();
    }
}
