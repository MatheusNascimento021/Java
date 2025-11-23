

package com.mycompany.beecrowd1073;

import java.util.Scanner;

public class Beecrowd1073 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        for(int i=1; i<=x; i++){
            if(i % 2 == 0){
               System.out.println(i + "^2" + " = " + i*i);   
            }
        }
        
        sc.close();
                
    }
}
