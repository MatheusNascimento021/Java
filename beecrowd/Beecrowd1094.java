

package com.mycompany.beecrowd1094;

import java.util.Scanner;

public class Beecrowd1094 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int contador = 1;
        int casos = sc.nextInt();
        int totalCobaias = 0,totalSapos = 0,totalCoelho = 0,totalRato = 0;
        
        
        while(contador <= casos){
            int cobaias = sc.nextInt();
            String animal = sc.next();
            contador+=1;
            totalCobaias += cobaias;
            
            if (animal.equals ("C") || animal.equals ("c")){
                totalCoelho += cobaias;
            }
            else if(animal.equals("R") || animal.equals ("r")){
                totalRato += cobaias;
            }
            else if (animal.equals ("S") || animal.equals ("s")){
                totalSapos += cobaias;
            }
        }
        
        double percentualCoelho = (double)(totalCoelho * 100) / totalCobaias;
        double percentualSapo = (double)(totalSapos * 100 ) / totalCobaias;
        double percentualRato = (double)(totalRato * 100) / totalCobaias;
        
        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelho);
        System.out.println("Total de ratos: " + totalRato);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n",percentualCoelho);
        System.out.printf("Percentual de ratos: %.2f %%\n",percentualRato);
        System.out.printf("Percentual de sapos: %.2f %%\n",percentualSapo);
        
        sc.close();
    }
}
