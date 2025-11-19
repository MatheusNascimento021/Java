
package com.mycompany.praticandodowhile;

import java.util.Scanner;

public class PraticandoDoWhile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int totPar = 0;
        int totImpar = 0;
        int total = 0;
        int maior100 = 0;
        int valores = 0;
        int numero;
      
        do{
            System.out.print("Digite um valor(0 para parar):");
            numero = sc.nextInt();
            
            if(numero == 0){
                break;
            }
            if(numero % 2 == 0){
                totPar++;
            }else{
                totImpar++;
            }
            
            if(numero > 100){
                maior100++;
            }
            
            valores++;
            total+=numero;
            
        }while(numero !=0);
        double media = (double) total / valores;
       
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("----------------");
        System.out.println("TOTAL DE VALORES DIGITADOS: " + valores);
        System.out.println("TOTAL DE PARES DIGITADOS: " + totPar);
        System.out.println("TOTAL DE ÍMPARES DIGITADOS: " + totImpar);
        System.out.println("VALORES ACIMA DE 100 DIGITADOS: " + maior100);
        System.out.printf("MÉDIA DOS VALORES DIGITADOS: %.1f%n " , media);
        
        sc.close();
    }
}
