

package com.mycompany.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int contador = 3;
        System.out.println("Quantos termos da sequência de Fibonacci você quer ver?");
        int termos = sc.nextInt();
        int f1 = 0, f2 = 1;
        
        System.out.print(f1 + " » ");
        System.out.print(f2 + " » ");
        
        while (contador <= termos){
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            contador +=1;
            System.out.print(f3 + " » ");

        }
        System.out.print("FIM");
        
        sc.close();
    }
}
