

package com.mycompany.beecrowd1151;

import java.util.Scanner;

public class Beecrowd1151 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int f1 = 0;
        int f2 = 1;
        
        int fibonacci = sc.nextInt();
        System.out.print(f1+" ");
        System.out.print(f2+" ");
        
        for(int i=3; i<=fibonacci; i++){
            int f3 = f1 + f2 ;
            f1 = f2;
            f2 = f3;
            System.out.print(f3+" ");
        }
        
        sc.close();
    }
}
