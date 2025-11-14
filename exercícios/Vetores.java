

package com.mycompany.vetores;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o tamanho do vetor?");
        int num = sc.nextInt();
        int[]vet = new int[num];
        
        System.out.println("Digite os valores do vetor.");
    
        for(int i=0; i<num; i++){
            vet[i] = sc.nextInt();
            
        }
        
        int somaTotal = 0;
        for(int i=0; i<num; i++){
            somaTotal+=vet[i];
        }
        
        int somaPar = 0;
        for(int i=0; i<num; i++){
            if(vet[i] % 2 == 0){
                somaPar+=vet[i];
            }
        }
        
        int somaImpar = 0;
        for(int i=0; i<num; i++){
            if(vet[i] % 2 != 0){
                somaImpar+=vet[i];
            }
        }
        
        int maior = vet[0];
        for(int i=0; i<num; i++){
            if(vet[i] > maior){
                maior = vet[i];
            }
        }
        
        int menor = vet[0];
        for(int i=0; i<num; i++){
            if(vet[i] < menor){
                menor = vet[i];
            }
        }
        
        System.out.println("SOMA TOTAL DO VETOR: " + somaTotal);
        System.out.println("SOMA DOS NÚMEROS PARES DO VETOR: " + somaPar);
        System.out.println("SOMA DOS NÚMEROS ÍMPARES DO VETOR: " + somaImpar);
        System.out.println("MAIOR VALOR DIGITADO NO VETOR: " + maior);
        System.out.println("MENOR VALOR DIGITADO NO VETOR: " + menor);
        
        
        sc.close();
    }
}
