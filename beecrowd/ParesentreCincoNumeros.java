

package com.mycompany.paresentrecinconumeros;

import java.util.Scanner;

public class ParesentreCincoNumeros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int totalPar;
        
        totalPar = 0;
        
        if (n1 % 2 == 0){
            totalPar += 1; 
        }
        if (n2 % 2 == 0){
            totalPar += 1;
        }
        if (n3 % 2 == 0){
            totalPar += 1;
        }
        if (n4 % 2 == 0){
            totalPar += 1;
        }
        if (n5 % 2 == 0){
            totalPar += 1;
        }
        
        System.out.println(totalPar + " valores pares");
        
        sc.close();
    }
}
