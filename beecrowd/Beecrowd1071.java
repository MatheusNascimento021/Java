
package com.mycompany.beecrowd1071;

import java.util.Scanner;

public class Beecrowd1071 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        int x = sc.nextInt();
        int y = sc.nextInt();
        int maior,menor;
        int soma = 0;
        
        if(x > y){
            maior = x;
            menor = y;
        }
        else{
            maior = y;
            menor = x;
        }
        
        for(int i=menor+1; i<maior; i++){
            if(i % 2 !=0){
                soma+=i;
            }
        }
        
        System.out.println(soma);
        
        sc.close();
            
    }
 
}
