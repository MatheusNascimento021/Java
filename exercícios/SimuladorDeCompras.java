

package com.mycompany.simuladordecompras;

import java.util.Scanner;
import java.util.Locale;

public class SimuladorDeCompras {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("BEM-VINDO AO CAIXA AUTOMÁTICO!");
        System.out.println("DIGITE O VALOR DOS SEUS PRODUTOS."); 
        System.out.println("QUANDO DIGITAR 0 IREMOS CALCULAR O VALOR TOTAL.");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        double soma = 0.0;
        
        
        while(true){
            System.out.print("Digite o valor do produto(ou 0 para encerrar): R$");
            double valorProduto = sc.nextDouble();
            
            if(valorProduto == 0){
                break;
            }
            soma += valorProduto; 
        }
        
        System.out.printf("Total da compra: R$%.2f%n",soma);
        
        System.out.print("POR FAVOR, DIGITE O VALOR PARA PAGAR AS COMPRAS: R$");
        double valor = sc.nextDouble();
        while (valor < soma){
            System.out.println("O VALOR QUE DIGITOU E MENOR DO QUE A SOMA DAS COMPRAS!");
            System.out.println("POR FAVOR, DIGITE UM VALOR MAIOR!");
            System.out.print("DIGITE O VALOR: R$");
            valor = sc.nextDouble();
        }
        double troco = valor - soma;
        System.out.printf("MUITO OBRIGADO! O SEU TROCO É DE: R$%.2f%n",troco);
        System.out.println("OBRIGADO POR USAR O NOSSO CAIXA AUTOMÁTICO, ATÉ A PRÓXIMA COMPRA!");
        
        sc.close();
    }
}
