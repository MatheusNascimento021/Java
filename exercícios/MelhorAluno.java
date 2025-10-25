
package com.mycompany.melhoraluno;

import java.util.Scanner;
import java.util.Locale;

public class MelhorAluno {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------------");
        System.out.println("ESCOLA SANTA PACIÊNCIA");
        System.out.println("----------------------");
        
        int contador = 1;
        double melhorNota = 0;
        String melhorAluno ="";
        
        System.out.println("Quantos alunos tem na turma?");
        int contaAluno = sc.nextInt();
       
        
        while (contador <= contaAluno){
            System.out.println("--------------------------");
            System.out.println("ALUNO " + contador);
            System.out.print("Nome do aluno:");
            String nomeAluno = sc.next();
            System.out.print("Nota do " + nomeAluno + ":");
            double nota = sc.nextDouble();
            
            if (nota > melhorNota){
               melhorAluno = nomeAluno;
               melhorNota = nota;
            }
            contador++;
        }
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("O melhor aproveitamento foi de " + melhorAluno + " com a nota " + melhorNota + ".");
        
        sc.close();
        
                
    }
}
