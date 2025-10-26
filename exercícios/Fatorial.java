

package com.mycompany.fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Digite um número para ver o seu fatorial:");
        int numero = sc.nextInt();
        int contador = numero;
        int f = 1;
        
        while(contador > 0){
            f = f*contador;
            contador -=1;
        }
        System.out.println("Fatorial de " + numero + " = " + f);
        
        sc.close();
    }
}
