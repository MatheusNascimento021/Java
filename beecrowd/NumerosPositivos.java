
package com.mycompany.numerospositivos;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPositivos {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        
        int positivo;
        
        positivo = 0;
        
        if (a > 0){
            positivo +=1;
        }
        if (b > 0){
            positivo +=1;
        }
        if (c > 0){
            positivo +=1;
        }
        if (d > 0){
            positivo +=1;
        }
        if(e > 0){
            positivo +=1;
        }
        if (f > 0){
            positivo +=1;
        }
        
        System.out.println(positivo + " valores positivos");
        
        sc.close();
    }
}
