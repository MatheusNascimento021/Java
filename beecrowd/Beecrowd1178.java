

package com.mycompany.beecrowd1178;

import java.util.Scanner;
import java.util.Locale;

public class Beecrowd1178 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextDouble();
        double[] vet = new double[100];
        
        double valor = x;
        
        for(int i=0; i<100; i++){
            vet[i] = valor;
            if(vet[i] == valor){
                valor = valor/2;
            }
            System.out.printf("N[%d] = %.4f%n", i, vet[i]);
        }
        
        sc.close();
    }
}
