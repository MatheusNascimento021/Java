

package com.mycompany.jogoadvinharnumero;

import java.util.Scanner;
import java.util.Random;
public class JogoAdvinharNumero {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numero = rand.nextInt(11);
        System.out.println("JOGO DO ADVINHE O NÚMERO");
        System.out.println("-------------------------");
        System.out.println("ESTOU PENSANDO EM UM NÚMERO ALEATÓRIO ENTRE 0 E 10 TENTE ADVINHAR");
        System.out.println("PALPITE :");
        int resposta = sc.nextInt();
        int tentativas = 1;
        while(resposta != numero){
            System.out.println("VOCÊ ERROU, TENTE NOVAMENTE: ");
            resposta = sc.nextInt();
            tentativas++;
        }
        System.out.println("PARABÉNS VOCÊ ACERTOU!");
        System.out.println("VOCÊ PRECISOU DE " + tentativas + " TENTATIVA(S)");
        
        sc.close();
    }
}
