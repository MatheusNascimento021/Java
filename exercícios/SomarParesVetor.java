
package com.mycompany.somarparesvetor;

import java.util.Scanner;

public class SomarParesVetor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int somaPar=0;
        int n = sc.nextInt();
        int [] vet = new int [n];
        
        for(int i=0; i<n; i++){
            vet[i]=sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            if(vet[i] % 2 == 0){
                somaPar+=1;
            }
            
            System.out.println("Posição " + i +": " + vet[i]);
        }
        
        System.out.println("Total de pares digitados no vetor: " + somaPar);
        
        
        sc.close();
    }
}
