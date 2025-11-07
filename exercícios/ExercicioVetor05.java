
package com.mycompany.exerciciovetor05;

import java.util.Scanner;

public class ExercicioVetor05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] vetor = new int[n];
        
        for(int i=0; i<n; i++){
            vetor[i] = sc.nextInt();
        }
        
        int soma = 0;
        int pares = 0;
        for(int i=0; i<n; i++){
            if(vetor[i] % 2 == 0){
                soma+=vetor[i];
                pares+=1;
            }
        }
        
        if(pares == 0){
            System.out.println("Não havia nenhum número par.");
        }
        else{
            double media = soma / pares;
            System.out.printf("%.1f%n",media);

        }
        
        sc.close();
      
    }
}
