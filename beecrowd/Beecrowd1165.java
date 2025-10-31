

package com.mycompany.beecrowd1165;

import java.util.Scanner;

public class Beecrowd1165 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int contaDiv = 0;
            
            for(int j=1; j<=x; j++ ){
                if(x % j == 0){
                    contaDiv+=1;
                }
            }
            if(contaDiv == 2){
                System.out.println(x + " eh primo");
            }
            else{
                System.out.println(x + " nao eh primo");
            }
        }
        
        sc.close();
    }    
}
