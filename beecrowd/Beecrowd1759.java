

package com.mycompany.beecrowd1759;

import java.util.Scanner;

public class Beecrowd1759 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i==n){
                System.out.print("Ho!");
            }
            else{
                System.out.print("Ho ");
            }
           
        }
        
        System.out.println();
        sc.close();
        
        
    }
}
