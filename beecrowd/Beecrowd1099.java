
package com.mycompany.beecrowd1099;

import java.util.Scanner;

public class Beecrowd1099 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int maior,menor;
        
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int somaImpar =0;
            
            if (x > y){
                maior = x;
                menor = y;
            }
            else{
                maior = y;
                menor = x;
            }
            for(int j=menor+1; j<maior; j++){
                if(j % 2 != 0){
                  somaImpar+=j;
                }
                
            
               
            }
            
            System.out.println(somaImpar);
        }
        
        sc.close();
    }
}
