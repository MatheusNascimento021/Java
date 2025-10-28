
package com.mycompany.beecrowd1072;

import java.util.Scanner;

public class Beecrowd1072 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int intervalo = 0;
        int foraIntervalo = 0;
        
        for(int i=0; i<x; i++){
            int y = sc.nextInt();
            if (y >=10 && y <=20){
                intervalo+=1;
            }
            else{
                foraIntervalo+=1;
            }
        }
        
        System.out.println(intervalo + " in");
        System.out.println(foraIntervalo + " out");
        
        
        sc.close();
    }
}
