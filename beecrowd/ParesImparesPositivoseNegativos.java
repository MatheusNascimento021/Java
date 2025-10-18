

package com.mycompany.paresimparespositivosenegativos;

import java.util.Scanner;

public class ParesImparesPositivoseNegativos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int negativos = 0;
        int positivos = 0;
        int pares = 0;
        int impares = 0;
        
        if (n1 > 0){
            positivos += 1;
        }
        if (n1 < 0){
            negativos += 1;
        }
        if (n1 % 2 == 0){
            pares += 1;
        }
        else{
            impares += 1;
        }
        if (n2 > 0){
            positivos += 1;
        }
        if (n2 < 0){
            negativos += 1;
        }
        if (n2 % 2 == 0){
            pares += 1;
        }
        else{
            impares += 1;
        }
        if (n3 > 0){
            positivos += 1;
        }
        if (n3 < 0){
            negativos += 1;
        }
        if (n3 % 2 == 0){
            pares += 1;
        }
        else{
            impares += 1;
        } 
        if (n4 > 0){
            positivos += 1;
        }
        if (n4 < 0){
            negativos += 1;
        }
        if (n4 % 2 == 0){
            pares += 1;
        }
        else{
            impares += 1;
        }
        if (n5 > 0){
            positivos += 1;
        }
        if (n5 < 0){
            negativos += 1;
        }
        if (n5 % 2 == 0){
            pares += 1;
        }
        else{
            impares += 1;
        }
        
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
        
        sc.close();
    }
}
