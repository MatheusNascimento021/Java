

package com.mycompany.beecrowd1117;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1117 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double somaNotas = 0;
        int contador = 0 ;
    
        while(contador < 2){
            double nota = sc.nextDouble();
            if (nota < 0 || nota > 10){
                System.out.println("nota invalida");
            }
            else{
                contador += 1;
                somaNotas = somaNotas + nota;
            }
             
        }
        double media = (double) somaNotas / contador;
        System.out.printf("media = %.2f%n",media);
     
        sc.close();
        
    }
}
