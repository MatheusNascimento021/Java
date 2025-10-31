

package com.mycompany.beecrowd2344;

import java.util.Scanner;

public class Beecrowd2344 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int nota = sc.nextInt();
        
       if(nota == 0){
           System.out.println("E");
       }
       else if(nota >0 && nota <=35){
           System.out.println("D");
       }
       else if(nota > 35 && nota <= 60){
           System.out.println("C");
       }
       else if(nota > 60 && nota <= 85){
           System.out.println("B");
       }
       else{
           System.out.println("A");
       }
       
       sc.close();
                
    }
}
