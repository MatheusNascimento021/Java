

package com.mycompany.desafio059;

import java.util.Scanner;

public class Desafio059 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número:");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número:");
        int n2 = sc.nextInt();
        
        int resposta;
        do{
           System.out.println("[1]-SOMAR");
           System.out.println("[2]-MULTIPLICAR");
           System.out.println("[3]-MAIOR");
           System.out.println("[4]-NOVOS NÚMEROS");
           System.out.println("[5]-SAIR DO PROGRAMA");
           System.out.print("QUAL OPERAÇÃO DESEJA FAZER?:");
           resposta = sc.nextInt();
           System.out.println();
           switch(resposta){
               case 1:
                   int soma = n1 + n2;
                   System.out.println("RESULTADO: " + n1 + " + " + n2 + " = " + soma);
                   System.out.println();
                   break;
               case 2:
                   int mult = n1 * n2;
                   System.out.println("RESULTADO: " + n1 + " X " + n2 + " = " + mult);
                   System.out.println();
                   break;
               case 3:
                   if(n1 > n2){
                       
                       System.out.println("RESULTADO MAIOR NÚMERO = " + n1);
                       System.out.println();
                   }
                   else{
                       System.out.println("RESULTADO MAIOR NÚMERO = " + n2);
                       System.out.println();
                   }
                   break;
               case 4:
                   System.out.print("Digite o primeiro número:");
                   n1 = sc.nextInt();
                   System.out.print("Digite o segundo número:");
                   n2 = sc.nextInt();
                   System.out.println();
                   break;
               case 5:
                   System.out.println("ENCERRANDO O PROGRAMA...");
                   break;
               default:
                   System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENT.");
           } 
        }while(resposta != 5);
        
        sc.close();
    }
}
