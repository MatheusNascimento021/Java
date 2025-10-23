

package com.mycompany.beecrownd1154;

import java.util.Scanner;

public class Beecrownd1154 {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        int idade,somaIdades=0,contaIdade=0;
        idade = sc.nextInt();
        
        while (idade >= 0){
            somaIdades += idade;
            contaIdade += 1;
            idade = sc.nextInt();
        }
        double media = (double) somaIdades / contaIdade;
        System.out.printf("%.2f%n",media);
        
        sc.close();
        
    }
}
