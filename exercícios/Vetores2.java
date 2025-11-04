

package com.mycompany.vetores2;

import java.util.Scanner;

public class Vetores2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] vet = new int [5];
        vet[0]=10;
        vet[1]=3;
        vet[2]=4;
        vet[3]=6;
        vet[4]=8;
        for(int i=0; i<vet.length; i++){
            System.out.println("Posição "+ i +": " + vet[i]);
                   
            
        }
        
        sc.close();
                
        
    }
}
