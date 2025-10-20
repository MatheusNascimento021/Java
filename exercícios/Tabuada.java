

package com.mycompany.tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número para ver a sua tabuada:");
        int numero = sc.nextInt();
        int i = 1;
        int resultado;
        
        while (i <= 10){
            resultado = i * numero;
            System.out.println(numero + " X " + i + " = " + resultado);
            i++;
        }
        
        sc.close();
                
        
    }
}
