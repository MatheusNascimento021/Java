

package com.mycompany.beecrowd1078;

import java.util.Scanner;

public class Beecrowd1078 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int contador = 1;
        int numero = sc.nextInt();
        
        while(contador <= 10){
            int resultado = numero * contador;
            System.out.println(contador + " x " + numero + " = " + resultado);
            contador++;
        }
        
        sc.close();
    }
}
