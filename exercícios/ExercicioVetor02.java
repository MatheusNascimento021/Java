

package com.mycompany.exerciciovetor02;

import java.util.Scanner;

public class ExercicioVetor02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] numeros = new int[n];
        int totalPar=0;
        
        for(int i=0; i<n; i++){
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2 == 0){
                totalPar+=1;
                System.out.print(numeros[i]+" ");
            }
        }
        System.out.println();
        System.out.println(totalPar);
        
        
        sc.close();
        
    }
}
