
package com.mycompany.exerciciovetor07;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioVetor07 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String[] nomes= new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        
        for(int i=0; i<n; i++){
            nomes[i]=sc.next();
            nota1[i]=sc.nextDouble();
            nota2[i]=sc.nextDouble();
        }
        
        System.out.println("Alunos Aprovados:");
        for(int i=0; i<n; i++){
             double media = (nota1[i] + nota2[i])/2.0;
             if(media >= 6.0){
                 System.out.println(nomes[i]);
             }
        }
       
        sc.close();
    
    }
}
