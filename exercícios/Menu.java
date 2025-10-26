

package com.mycompany.menu;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor:");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int numero2 = sc.nextInt();
        System.out.println("O que deseja fazer com os números?");
        System.out.println("[1]-SOMAR");
        System.out.println("[2]-MULTIPLICAR");
        System.out.println("[3]-MAIOR");
        System.out.println("[4]-NOVOS NÚMEROS");
        System.out.println("[5]-SAIR DO PROGRAMA");
        System.out.print("Escolha uma opção:");
        int opcao = sc.nextInt();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        while(opcao != 5){
            if(opcao == 1){
                int soma = numero1 + numero2;
                System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + soma);
                System.out.println("=-=-=-==-=-=-=-=-==-=-=-=-==-=-=");
            }
            else if(opcao == 2){
                int multipli = numero1 * numero2;
                System.out.println("Resultado: " + numero1 + " x " + numero2 + " = " + multipli);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=");
            }
            else if(opcao == 3){
                if (numero1 > numero2){
                    int maior = numero1;
                    System.out.println("Maior valor: " + maior);
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
                }
                else if(numero1 == numero2){
                    System.out.println("Os valores são iguais.");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
                }
                else{
                    int maior = numero2;
                    System.out.println("Maior valor: " + maior);
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
                }
            }
            else if(opcao == 4){
                System.out.println("Digite o primeiro valor:");
                numero1 = sc.nextInt();
                System.out.println("Digite o segundo valor:");
                numero2 = sc.nextInt();
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
                
            }
            else{
                System.out.println("Opção inválida tente novamente!");
            }
             System.out.println("O que deseja fazer com os números?");
             System.out.println("[1]-SOMAR");
             System.out.println("[2]-MULTIPLICAR");
             System.out.println("[3]-MAIOR");
             System.out.println("[4]-NOVOS NÚMEROS");
             System.out.println("[5]-SAIR DO PROGRAMA");
             System.out.print("Escolha uma opção:");
             opcao = sc.nextInt();
             System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            
            
        
            
        }
        
        System.out.println("OBRIGADO POR USAR O NOSSO PROGRAMA!");
        
        sc.close();
    }
}
