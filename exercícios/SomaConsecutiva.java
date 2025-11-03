

package com.mycompany.somaconsecutiva;

import java.util.Scanner;

public class SomaConsecutiva {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char continuar;
        int soma = 0;
        do{
            System.out.print("Digite um número:");
            int n = sc.nextInt();
            soma+=n;
            
            System.out.print("Deseja continuar? (S/N):");
            continuar = sc.next().charAt(0);
            
        }while(Character.toLowerCase(continuar) != 'n');
        
        System.out.println("Soma total: "+ soma);
        
        sc.close();
    }
}
