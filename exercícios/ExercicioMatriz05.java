

package com.mycompany.exerciciomatriz05;

import java.util.Scanner;

public class ExercicioMatriz05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] matrizA = new int[m][n];
        int[][] matrizB = new int [m][n];
        int [][] matrizC = new int [m][n];
        
        //leitura da matriz A
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrizA[i][j] = sc.nextInt();
            }
        }
        
        //leitura da matri B
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrizB[i][j] = sc.nextInt();
            }
        }
        
        // geracao da matriz C
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        
        
        // impressao da matriz C na tela
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
        
        
        sc.close();
    }
}
