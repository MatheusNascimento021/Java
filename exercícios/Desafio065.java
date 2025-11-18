

package com.mycompany.desafio065;

import java.util.Scanner;

public class Desafio065 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int cont = 0;
        int soma = 0;
        int maior = 0;
        int menor = 0;
        
        String opcao = "S";
    
        while(!opcao.equalsIgnoreCase("N")){
      
            System.out.print("Digite um número:");
            int numero = sc.nextInt();
            soma+=numero;
            cont++;
            if (cont == 1){
                maior = menor = numero;
            }
            else if(numero > maior){
                maior = numero;
            }
            else if(numero < menor){
                menor = numero;
            }
            
            System.out.print("Quer continuar? [S/N]: ");
            opcao = sc.next();    
        }
        double media = (double) soma/cont;
        System.out.println("Você digitou " + cont + " números e a média foi " + media);
        System.out.println("O maior valor digitado foi " + maior + " e o menor foi " + menor);
        
        sc.close();
    }
    
    
}
