

package com.mycompany.beecrowd1985;

import java.util.Scanner;
public class Beecrowd1985 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int qtdCasos = sc.nextInt();
        double soma = 0;
        double somaTotal=0;
        
        
        for(int i=0; i<qtdCasos; i++){
            double numeroProduto = sc.nextInt();
            int qtdProdutos = sc.nextInt();
            
            if(numeroProduto == 1001){
                soma = 1.50 * qtdProdutos;
            }
            else if(numeroProduto == 1002){
                soma = 2.50 * qtdProdutos;
            }
            else if(numeroProduto == 1003){
                soma = 3.50 * qtdProdutos;
            }
            else if(numeroProduto == 1004){
                soma = 4.50 *qtdProdutos;
            }
            else if(numeroProduto == 1005){
                soma = 5.50 * qtdProdutos;
            }
            
            somaTotal+=soma;
        }
        
        System.out.printf("%.2f%n",somaTotal);
        
        sc.close();
    }
}
