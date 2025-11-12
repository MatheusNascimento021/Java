

package com.mycompany.beecrowd1180;

import java.util.Scanner;

public class Beecrowd1180 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] vetor = new int[n];
        
        for(int i=0; i<n; i++){
            vetor[i]=sc.nextInt();
        }
        
        int menor = vetor[0];
        int posicao = 0;
        
        for(int i=0; i<n; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
                posicao = i;
            }
        }
        
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
        
        sc.close();
      
    }
}
