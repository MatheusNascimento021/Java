

package com.mycompany.exerciciovetor04;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor04 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double[] numero = new double[n];
        double soma = 0.0;
        double media = 0.0;
        
        for(int i=0; i<n; i++){
            numero[i] = sc.nextDouble();  
        }
        for(int i=0; i<n; i++){
            soma+=numero[i];
        }
        for(int i=0; i<n; i++){
            media = soma / n;
        }
        
        System.out.println(media);
        
        for(int i=0; i<n; i++){
            if(numero[i] < media){
                System.out.println(numero[i]);
            }
        }
       
        sc.close();
    
    }
}
