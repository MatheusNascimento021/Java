

package com.mycompany.exerciciomatriz04;

import java.util.Scanner;

public class ExercicioMatriz04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] numeros = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                numeros[i][j] = sc.nextInt();
            }
        }
        int soma = 0;
        for (int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                soma+=numeros[i][j];
            }
            
        }
        
        System.out.println(soma);
        
        sc.close();
    }
}
