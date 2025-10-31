

package com.mycompany.beecrowd2060;

import java.util.Scanner;

public class Beecrowd2060 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int mult2=0,mult3=0,mult4=0,mult5=0;
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            if(x % 2 == 0){
                mult2+=1;
            }
            if(x % 3 == 0){
                mult3+=1;
            }
            if(x % 4 == 0){
                mult4+=1;
            }
            if(x % 5 == 0){
                mult5+=1;
            }
              
            
        }
        
        System.out.println(mult2 + " Multiplo(s) de 2");
        System.out.println(mult3 + " Multiplo(s) de 3");
        System.out.println(mult4 + " Multiplo(s) de 4");
        System.out.println(mult5 + " Multiplo(s) de 5");
        
        sc.close();
    }
}
