

package com.mycompany.beecrowd1067;

import java.util.Scanner;

public class Beecrowd1067 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero = sc.nextInt();
        int valor = 1;
       
       while(valor <= numero){
           if (valor % 2 == 1){
               System.out.println(valor);
           }
           valor += 1;
       }
        
        
        sc.close();
    }
}
