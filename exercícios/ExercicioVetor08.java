

package com.mycompany.exerciciovetor08;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioVetor08 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        double[] altura = new double[n];
        char[] sexo = new char[n];
        
        for(int i=0; i<n; i++){
            altura[i]=sc.nextDouble();
            sexo[i]=sc.next().charAt(0);
        }
        double menorAltura = altura[0];
        for(int i=1; i<n; i++){
            if(altura[i] < menorAltura){
                menorAltura = altura[i];
            }
        }
        
        double maiorAltura = altura[0];
        for(int i=1; i<n; i++){
            if(altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
              
        }
        double soma = 0.0;
        int totalF = 0;
        for(int i=0; i<n; i++){
            if(sexo[i] == 'f' || sexo[i] == 'F'){
                soma+=altura[i];
                totalF++;
            }
        }
        if(totalF == 0){
            System.out.println("Não ha nenhuma mulher dentre as pessoas.");
        }
        else{
            double media = soma / totalF;
            System.out.printf("Media das alturas das mulheres = %.2f%n",media);
        }
        int totalH = 0;
        for(int i=0; i<n; i++){
            if(sexo[i] == 'm' || sexo[i] == 'M'){
                totalH++;
            }
        }
        
        System.out.printf("Menor altura = %.2f%n",menorAltura);
        System.out.printf("Maior altura = %.2f%n",maiorAltura);
        System.out.println("Numero de homens = " + totalH);
        
        sc.close();
    }
}
