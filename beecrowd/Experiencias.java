

package com.mycompany.experiencias;

import java.util.Scanner;

public class Experiencias {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int totalSapo=0,totalCoelho=0,totalRato=0;
        
        int qtdCasos = sc.nextInt();
        
        for(int i=1; i<=qtdCasos; i++){
            
            int qtd = sc.nextInt();
            String animal = sc.next(); 
            
            if(animal.equalsIgnoreCase("C")){
                totalCoelho+=qtd;
            }
            else if(animal.equalsIgnoreCase("S")){
                totalSapo+=qtd;
            }
            else if(animal.equalsIgnoreCase("R")){
                totalRato+=qtd;
            }
        }
        
        int totalCobaias = totalCoelho + totalSapo + totalRato;
        double porcentagemCoelhos = (double)(totalCoelho * 100) / totalCobaias;
        double porcentagemRatos = (double)(totalRato * 100) / totalCobaias;
        double porcentagemSapos = (double)(totalSapo * 100) / totalCobaias;
        
        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelho);
        System.out.println("Total de ratos: " + totalRato);
        System.out.println("Total de sapos: " + totalSapo);
        System.out.printf("Percentual de coelhos: %.2f %%%n",porcentagemCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n",porcentagemRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n",porcentagemSapos);
        
        sc.close();
    }
}
