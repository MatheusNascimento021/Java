

package com.mycompany.beecrowd1131;

import java.util.Scanner;

public class Beecrowd1131 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int vitInter = 0;
       int vitGremio = 0;
       int empate = 0;
       int novoGrenal = 1;
       
       while (novoGrenal == 1){
           int golInter = sc.nextInt();
           int golGremio = sc.nextInt();
           
           if (golInter > golGremio){
               vitInter += 1;
           }
           else if (golGremio > golInter){
               vitGremio += 1;
           }
           else{
               empate += 1;
           }
           
           System.out.println("Novo grenal (1-sim 2-nao)");
           novoGrenal = sc.nextInt();
       }   
       
       int totalJogos = vitInter + vitGremio + empate;
       
       System.out.println(totalJogos + " grenais");
       System.out.println("Inter:"+vitInter);
       System.out.println("Gremio:"+vitGremio);
       System.out.println("Empates:"+empate);
       
       if (vitInter > vitGremio){
           System.out.println("Inter venceu mais");
       }
       else{
           System.out.println("Gremio venceu mais");
       }
       
       sc.close();
        
    }
}
