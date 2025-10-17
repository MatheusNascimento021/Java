

package com.mycompany.positivosemedia;

import java.util.Scanner;
import java.util.Locale;

public class PositivoseMedia {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double valor1 = sc.nextDouble();
        double valor2 = sc.nextDouble();
        double valor3 = sc.nextDouble();
        double valor4 = sc.nextDouble();
        double valor5 = sc.nextDouble();
        double valor6 = sc.nextDouble();
        
        int positivos;
        double media,soma;
        
        positivos = 0;
        soma = 0;
        
        if (valor1 > 0){
            positivos += 1;
            soma += valor1;
        }
        if (valor2 > 0){
            positivos += 1;
            soma += valor2;
        }
        if (valor3 > 0){
            positivos += 1;
            soma += valor3;
        }
        if (valor4 > 0){
            positivos += 1;
            soma += valor4;
        }
        if (valor5 > 0){
            positivos += 1;
            soma += valor5;
        }
        if (valor6 > 0){
            positivos += 1;
            soma += valor6;
        }
        
        media = soma / positivos;
        
        
        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f%n",media);
        
        sc.close();
    }
}
