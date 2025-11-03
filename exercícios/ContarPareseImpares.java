

package com.mycompany.contarpareseimpares;

import java.util.Scanner;

public class ContarPareseImpares {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int somaPar=0;
        int somaImpar=0;
        System.out.print("Quantos números você quer digitar?");
        int numero = sc.nextInt();
        for(int i=1; i<=numero; i++){
            System.out.print("Digite o " + i +"º número:");
            int x = sc.nextInt();
            if(x % 2 == 0){
                somaPar+=1;
            }
            else{
                somaImpar+=1;
            }
        }
        
        System.out.println("Total de Pares digitados: " + somaPar);
        System.out.println("Total de Impares digitados: " + somaImpar);
          
        sc.close();
    }
}
