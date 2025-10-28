

package com.mycompany.beecrowd1132;

import java.util.Scanner;

public class Beecrowd1132 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = 0;
        int maior,menor;
        
        if(x > y){
            maior = x;
            menor = y;
        }
        else{
            maior = y;
            menor = x;
        }
        
      
        for(int i=menor; i<=maior; i++){
            if(i % 13 != 0){
                soma+=i;
            }
        }
        
        System.out.println(soma);
        
        
        sc.close();
    }
}
