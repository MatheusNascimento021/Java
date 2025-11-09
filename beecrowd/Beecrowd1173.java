

package com.mycompany.beecrowd1173;

import java.util.Scanner;

public class Beecrowd1173 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] vetor = new int[10];
        
        vetor[0] = n;
        
        for(int i=1; i<10; i++){
            vetor[i]= vetor [i-1]*2;
        }
        for(int i=0; i<10; i++){
            System.out.println("N["+i+"]"+ " = " + vetor[i]);

        }
      
        
        sc.close();
    }
}
