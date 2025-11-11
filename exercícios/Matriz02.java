

package com.mycompany.matriz02;

import java.util.Scanner;

public class Matriz02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
                
            }
        }
        
        System.out.println("Diagonal principal:");
        for(int i=0; i<n; i++){
            System.out.print(mat[i][i] + " ");
        }
        
        int contNegativo = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] < 0){
                    contNegativo++;
                }
            }
        }
        
        System.out.println();
        System.out.println("Quantidade de negativos = " + contNegativo);
       
        
        sc.close();
    }
}
