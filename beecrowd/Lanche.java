

package com.mycompany.lanche;
import java.util.Scanner;
import java.util.Locale;

public class Lanche {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        System.out.println("TABELA DE PREÇOS E CÓDIGOS DOS ITENS.");
        System.out.println("1 - CACHORRO QUENTE - PREÇO R$ 4,00  ");
        System.out.println("2 - X-SALADA - PREÇO R$ 4,50   ");
        System.out.println("3 - X-BACON - PREÇO R$ 5,00  ");
        System.out.println("4 - TORRADA SIMPLES - PREÇO R$ 2,00  ");
        System.out.println("5 - REFRIGERANTE - PREÇO R$ 1,50  ");
        
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total;
        total = 0;
        
        if (codigo == 1){
            total = 4 * quantidade; 
            System.out.printf("Total: R$ %.2f%n",total);
        }
        else if (codigo == 2){
            total = 4.5 * quantidade;
            System.out.printf("Total: R$ %.2f%n",total);
            
        }
        else if (codigo == 3){
            total = 5 * quantidade;
            System.out.printf("Total: R$ %.2f%n",total);
        }
        else if (codigo == 4){
            total = 2 * quantidade;
            System.out.printf("Total: R$ %.2f%n",total);
        }
        else if (codigo == 5){
            total = 1.5 * quantidade;
            System.out.printf("Total: R$ %.2f%n",total);
        }
        else{
            System.out.println("OPÇÃO INVÁLIDA!");
        }
        
        sc.close();
            

    }
}
