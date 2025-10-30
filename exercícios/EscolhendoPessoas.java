

package com.mycompany.escolhendopessoas;

import java.util.Scanner;

public class EscolhendoPessoas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("===================");
        System.out.println("SELETOR DE PESSOAS");
        System.out.println("===================");
        
        String opcoes;
        int homens = 0;
        int mulheres = 0;
        do{
            System.out.println("Qual o Sexo? [M/F]:");
            String sexo = sc.next();
            
            System.out.println("Qual a idade?");
            int idade = sc.nextInt();
            
            System.out.println("Qual a cor do cabelo?");
            System.out.println("---------------------");
            System.out.println("[1] Preto");
            System.out.println("[2] Castanho");
            System.out.println("[3] Loiro");
            System.out.println("[4] Ruivo");
            int cabelo = sc.nextInt();
            
            
            if(sexo.equalsIgnoreCase("m") && idade > 18 && cabelo == 2){
                homens+=1;
            }
            if(sexo.equalsIgnoreCase("f") && idade > 25 && idade <30 && cabelo == 3){
                mulheres+=1;
            }
            
            System.out.println("Quer continuar? [S/N]");
            opcoes = sc.next();
            
        }while(opcoes.equalsIgnoreCase("S"));
        
        System.out.println("Resultado Final");
        System.out.println("---------------------");
        System.out.println("Total de homens com mais de 18 e cabelos castanhos: " + homens);
        System.out.println("Total de mulheres entre 25 e 30 e cabelos loiros: " + mulheres);
        
        
        sc.close();
    }
}
