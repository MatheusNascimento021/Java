

package com.mycompany.beecrowd1080;

import java.util.Scanner;

public class Beecrowd1080 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int valor = 1;
        int numero = sc.nextInt();
        int maior = numero;
        int posicaoMaior = 1;
        int posicaoAtual = 2;
        while(valor <= 99){
            numero = sc.nextInt();
            if (numero > maior){
                maior = numero;
                posicaoMaior = posicaoAtual;
            }
            posicaoAtual++;
            valor += 1;
        } 
        
        System.out.println (maior); 
        System.out.println(posicaoMaior);

        sc.close();
    }
}
