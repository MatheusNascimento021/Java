

package com.mycompany.advinheonumero;

import java.util.Scanner;
import java.util.Random;

public class AdvinheoNumero {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int numeroSecreto = aleatorio.nextInt(100) + 1;
        int tentativas = 0;
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-");
        System.out.println("BEM VINDO AO JOGO DO NÚMERO SECRETO!");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-");
        System.out.println("ESTOU PENSANDO EM UM NÚMERO ENTRE 1 E 100!");
        System.out.println("VOCÊ TER�? 8 TENTATIVAS PARA ADIVINHAR O NÚMERO!");
        System.out.println("DICA: USE A PESQUISA BIN�?RIA!");
        System.out.println("EST�? PRONTO? ENTÃO VAMOS JOGAR!");
        System.out.println("-----=-----=-----=-----=-----=-----=-----=-----=");
        
       while(true){
           tentativas++;
           System.out.println("TENTATIVA " + tentativas + " DE 8");
           System.out.println("EM QUAL NÚMERO EU ESTOU PENSANDO?");
           int jogador = sc.nextInt();
           if (jogador > numeroSecreto){
               System.out.println("O NÚMERO E MUITO ALTO!");
           }
           else if(jogador < numeroSecreto){
               System.out.println("O NÚMERO E MUITO BAIXO!");
           }
           else if(jogador == numeroSecreto){
               System.out.println("PARABÉNS VOCÊ ACERTOU, PRECISOU DE " + tentativas + " TENTATIVAS!");
               break;
           }
           if (tentativas == 8){
               System.out.println("VOCÊ NÃO CONSEGUIU ADIVINHAR =(");
               System.out.println("O NÚMERO ERA " + numeroSecreto + " MELHOR SORTE NA PROX�?MA VEZ!");
               break;
           }
           
         
       }
       
       sc.close();
    }        
        

        
        
    
}
