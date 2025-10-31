

package com.mycompany.beecrowd1133;

import java.util.Scanner;

public class Beecrowd1133 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int maior,menor;
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if (x > y){
            maior = x;
            menor = y;
        }
        else{
            maior = y;
            menor = x;
        }
        for(int i=menor+1; i<maior; i++){
            if(i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
