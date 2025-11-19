
package com.mycompany.desafio064;

import java.util.Scanner;

public class Desafio064 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        int cont = 0;
        int soma = 0;
        System.out.println("DIGITE UM NÚMERO [999] PARA PARAR:");
        numero = sc.nextInt();
        while(numero != 999){
            cont++;
            soma+=numero;
            System.out.println("DIGITE UM NÚMERO [999] PARA PARAR");
            numero = sc.nextInt();
        }
        System.out.println("FORAM DIGITADOS " + cont + " NÚMEROS");
        System.out.println("E A SOMA ENTRE ELES FOI " + soma);
        
        sc.close();
    }    
}
