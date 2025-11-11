
package com.mycompany.matriz03;

import java.util.Scanner;
import java.util.Locale;

public class Matriz03 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        double[][] mat = new double[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextDouble();
            }
        }
        
        double[] vetor = new double[m];
        
        for(int i=0; i<m; i++){
            double soma = 0.0;
            for(int j=0; j<n; j++){
                soma = soma + mat[i][j];
            }
            vetor[i] = soma;
        }
        
        for(int i=0; i<m; i++){
            System.out.printf("%.1f%n", vetor[i]);
        }
        
        sc.close();
    }
}
