

package com.mycompany.beecrowd1177;

import java.util.Scanner;

public class Beecrowd1177 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] vet = new int[1000];
        
        int valor = 0;
        for(int i=0; i<1000; i++){
            vet[i] = valor;
            valor++;
            if(valor == n){
                valor = 0;
            }
            System.out.println("N["+i+"] = " + vet[i]);
        }
       
        sc.close();
    }
}
