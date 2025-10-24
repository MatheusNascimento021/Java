

package com.mycompany.beecrowd1075;

import java.util.Scanner;

public class Beecrowd1075 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int contador = 1;
        int numero = sc.nextInt();
        
        while (contador <= 10000){
            if (contador % numero == 2){
                System.out.println(contador);
            }
            contador += 1;
        }
        
        sc.close();
    }
}
