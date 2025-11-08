

package com.mycompany.exerciciovetor06;

import java.util.Scanner;

public class ExercicioVetor06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idade = new int[n];
        
        for(int i=0; i<n; i++){
            nomes[i]=sc.next();
            idade[i]=sc.nextInt();
        }
        
        int maiorIdade = idade[0];
        String maisVelho = nomes[0];
        
        for(int i=1; i<n; i++){
            if(idade[i] > maiorIdade){
                maiorIdade=idade[i];
                maisVelho=nomes[i];
            }
        }
        
        System.out.println("Pessoa mais velha: " + maisVelho + " com " + maiorIdade + " anos de idade.");
        
        
        sc.close();
    }
}
