

package com.mycompany.vetormediaesoma;

import java.util.Scanner;
import java.util.Locale;

public class VetorMediaeSoma {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double soma = 0.0, media = 0.0;
        
        int n = sc.nextInt();
        double [] vet = new double[n];
        
        for(int i=0; i<n; i++){
            vet[i] = sc.nextDouble();
            soma+=vet[i];
        }
        for(int i=0; i<n; i++){
            System.out.print(vet[i] + " ");
        }
        System.out.println();
        
        media = soma / n;
        
        System.out.printf("Soma: %.2f%n",soma);
        System.out.printf("Média: %.2f%n",media);
        
        sc.close();
        
    }
}
