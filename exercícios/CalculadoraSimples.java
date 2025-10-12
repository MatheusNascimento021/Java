

package com.mycompany.calculadorasimples;
import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double soma,subtracao,divisao,multiplicacao;
        
        System.out.println("===================");
        System.out.println("CALCULADORA SIMPLES");
        System.out.println("===================");
        System.out.print("Digite o primeiro número:");
        double numero1 = sc.nextDouble();
        System.out.print("Digite o segundo número:");
        double numero2 = sc.nextDouble();
        
        System.out.println("Oque deseja fazer com os número digitados?");
        System.out.println(" 1 - PARA SOMAR");
        System.out.println(" 2 - PARA SUBTRAIR");
        System.out.println(" 3 - PARA MULTIPLICAR");
        System.out.println(" 4 - PARA DIVIDIR");
        int opcoes = sc.nextInt();
        
        if (opcoes == 1){
            soma = numero1 + numero2;
            System.out.printf("RESULTADO: %.2f + %.2f = %.2f",numero1,numero2,soma);    
            
        }
        else if (opcoes == 2){
            subtracao = numero1 - numero2;
            System.out.printf("RESULTADO: %.2f - %.2f = %.2f",numero1,numero2,subtracao);    
                    }
        else if (opcoes == 3){
            multiplicacao = numero1 * numero2;
            System.out.printf("RESULTADO: %.2f x %.2f = %.2f",numero1,numero2,multiplicacao);    
                    }
        else if (opcoes == 4){
            if (numero2 == 0){
                 System.out.println("ERRO, Não e possível dividir por zero!");
            }else{
               divisao = numero1 / numero2;
               System.out.printf("RESULTADO: %.2f / %.2f = %.2f",numero1,numero2,divisao);    
            }   
        }
        else{
            System.out.println("OPÇÃO INVÁLIDA!");
        }
 
       
        sc.close();

    }
}
