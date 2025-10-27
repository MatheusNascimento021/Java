

package com.mycompany.beecrowd1074;

import java.util.Scanner;

public class Beecrowd1074 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero = sc.nextInt();
        
        for(int i=1; i<=numero; i++){
            
            int x = sc.nextInt();
            
            if(x % 2 == 0 && x > 0){
                System.out.println("EVEN POSITIVE");
            }
            else if(x % 2 == 0 && x < 0){
                System.out.println("EVEN NEGATIVE");
            }
            else if(x % 2 != 0 && x > 0){
                System.out.println("ODD POSITIVE");
            }
            else if (x % 2 !=0 && x < 0){
                System.out.println("ODD NEGATIVE");
            }
            else if(x == 0){
                System.out.println("NULL");
            }
            
        }
        
        sc.close();
    }
}
