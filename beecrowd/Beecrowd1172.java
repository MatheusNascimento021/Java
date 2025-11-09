

package com.mycompany.beecrowd1172;

import java.util.Scanner;

public class Beecrowd1172 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numero = new int[10];
        
        for(int i=0; i<10; i++){
            numero[i] = sc.nextInt();
            if(numero[i] <= 0){
                numero[i] = 1;
            }
        }
        for(int i=0; i<10; i++){
            System.out.println("X[" + i + "]" + " = " + numero[i]);
        }
        
        sc.close();
    }
}
