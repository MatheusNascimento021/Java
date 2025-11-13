
package com.mycompany.exerciciomatriz06;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioMatriz06 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double[][] mat = new double[n][n];
        
        //leitura do dados de entrada
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextDouble();
            }
        }
        
        int linha = sc.nextInt();
        int coluna = sc.nextInt();
       
        //soma dos positivos
        double somaPositivos = 0.0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] > 0){
                    somaPositivos+=mat[i][j];
                }

            }
        }
        System.out.printf("SOMA DOS POSTIVOS: %.1f%n ", somaPositivos);
        
        //imprimir os elementos da linha escolhida
        System.out.print("LINHA ESCOLHIDA: ");
        for(int j=0; j<n; j++){
            System.out.printf("%.1f ", mat[linha][j]);
        }
        System.out.println();
        
        //imprimir os elementos da coluna escolhida
        System.out.print("COLUNA ESCOLHIDA: ");
        for(int i=0; i<n; i++){
            System.out.printf("%.1f ", mat[i][coluna]);
        }
        System.out.println();
        
        //imprimir a diagonal principal
        System.out.print("DIAGONAL PRINCIPAL: ");
        for(int i=0; i<n; i++){
            System.out.printf("%.1f ", mat[i][i]);
        }
        System.out.println();
        
        //alterar a matriz elevando os negativos ao quadrado
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] < 0.0){
                    mat[i][j] = mat[i][j] * mat[i][j];
                }
            }
        }
        
        //imprimir a matriz alterada
        System.out.println("MATRIZ ALTERADA");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.printf("%.1f ", mat[i][j]);
            }
            System.out.println();
        }
       
        sc.close();
    
    }
}
