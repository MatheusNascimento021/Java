

package com.mycompany.beecrowd1174;

import java.util.Scanner;

public class Beecrowd1174 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double[] vet = new double[100];
        
        for(int i=0; i<100; i++){
            vet[i] = sc.nextDouble();
        }
        
        for(int i=0; i<100; i++){
            if(vet[i] <=10){
               System.out.printf("A[%d] = %.1f%n", i, vet[i]);            
            }   
            
        }
        
        sc.close();
    }
}
