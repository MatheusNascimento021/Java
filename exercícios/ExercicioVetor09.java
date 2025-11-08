

package com.mycompany.exerciciovetor09;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioVetor09 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String[] produtos = new String[n];
        double[] preco = new double[n];
        double[] venda = new double[n];
        
        for(int i=0; i<n; i++){
            produtos[i] = sc.next();
            preco[i] = sc.nextDouble();
            venda[i] = sc.nextDouble();
            
        }
        double lucro = 0;
        int lucro10a20 = 0;
        int lucroMenor10 = 0;
        int lucroMaior20 = 0;
        for(int i=0; i<n; i++){
            lucro = (venda[i] - preco[i]) / preco[i] * 100;
            if(lucro < 10){
                lucroMenor10++;
            }
            else if(lucro >=10 && lucro <= 20){
                lucro10a20++;
            }
            else {
                lucroMaior20++;
            }
        }
        double totalCompra = 0.0;
        for(int i=0; i<n; i++){
            totalCompra+=preco[i];
        }
        double totalVenda = 0.0;
        for(int i=0; i<n; i++){
            totalVenda+=venda[i];
        }
        double lucroTotal = totalVenda - totalCompra;
    
        System.out.println("Lucro abaixo de 10%: " + lucroMenor10);
        System.out.println("Lucro entre 10% e 20%: " + lucro10a20);
        System.out.println("Lucro acima de 20%: " + lucroMaior20);
        System.out.printf("Valor total de compra: %.2f%n", totalCompra);
        System.out.printf("Valor total de venda: %.2f%n", totalVenda);
        System.out.printf("Lucro total: %.2f%n", lucroTotal);
        
        sc.close();
    
    }
}
