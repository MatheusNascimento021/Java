
package com.mycompany.somaalternada;

import java.util.Scanner;

public class SomaAlternada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int soma = 0;
        int numero = sc.nextInt();
        
        for(int i=1; i<=numero; i++){
            int x = sc.nextInt();
            if(x % 2 == 0){
                soma-=x;
            }
            else{
                soma+=x;
            }
        }
        
        System.out.println(soma);
        
        sc.close();
    }
}
