
package com.mycompany.alunos;

import java.util.Scanner;

public class Alunos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos alunos tem na turma?");
        int n = sc.nextInt();
        int vet[] = new int [n];
        double maiorNota = 0;
        double menorNota = 0;
        double soma = 0;
        
        for(int i=1; i<=n; i++){
            System.out.println("Digite a nota do aluno: " + i);
            double nota = sc.nextDouble();
            if(i == 1){
                maiorNota = menorNota = nota;
            }
            else if(nota > maiorNota){
                maiorNota = nota;
            }
            else if(nota < menorNota){
                menorNota = nota;
            }
            soma+=nota;
            
        }
        
        double media = 0;
        for(int i=1; i<=n; i++){
            media = soma/n;
        }
        
        System.out.printf("Média da turma: %.2f%n ", media);
        System.out.println("Maior nota: " + maiorNota );
        System.out.println("Menor nota: " + menorNota);
        
        sc.close();
    }
}
    