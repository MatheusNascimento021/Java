
package com.mycompany.calculadodescontos;
import java.util.Scanner;
import java.util.Locale;

public class CalculadoDescontos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("========================");
        System.out.println("CALCULADORA DE DESCONTOS");
        System.out.println("========================");
        
        System.out.print("Qual o preço do produto?R$");
        double preco = sc.nextDouble();
        System.out.println("Digite qual tipo de cliente você é, assim poderá receber descontos.");
        System.out.println("1 - CLIENTE COMUM");
        System.out.println("2 - CLIENTE VIP");
        System.out.println("3 - CLIENTE PREMIUM");
        int cliente = sc.nextInt();
        double descontos,novoPreco;
        
        if (cliente == 1){
            System.out.println("Sinto muito clientes comuns não tem descontos =(");
            System.out.println("Valor final da sua compra R$" + preco);
        }
        else if (cliente == 2){
            System.out.println("Legal você e cliente VIP, terá 10% de desconto!");
            descontos = (preco * 10) / 100;
            novoPreco = preco - descontos;
            
            System.out.println("Valor do seu produto era R$" + preco + " com o desconto de 10% ficou R$" + novoPreco);
            
        }
        else if (cliente == 3){
            System.out.println("Ótimo cliente PREMIUM, você tem direito a 20% de desconto!");
            descontos = (preco * 20) / 100;
            novoPreco = preco - descontos;
            System.out.println("Valor do seu produto era R$" + preco + " com o desconto de 20% ficou R$" + novoPreco);
            
        }
        else{
            System.out.println("Tipo de cliente inválido!");
        }
            
        sc.close();                  
                

    }
}
