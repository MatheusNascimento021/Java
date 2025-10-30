

package com.mycompany.futebol;

import java.util.Scanner;

public class Futebol {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("BANGU X MADUREIRA");
        System.out.println("------------------");
        System.out.print("Quantos gols do BANGU?");
        int golsBangu = sc.nextInt();
        System.out.print("Quantos gols do MADUREIRA?");
        int golsMadu = sc.nextInt();
        System.out.println("--------------------------");
        
        int dif;
        
        if(golsBangu > golsMadu){
             dif = golsBangu - golsMadu;
        }
        else{
             dif = golsMadu - golsBangu;
        }
        switch(dif){
            case 0:
                System.out.println("DIFERENÇA: "+dif);
                System.out.println("STATUS: EMPATE");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("DIFERENÇA:" + dif);
                System.out.println("STATUS: PARTIDA NORMAL");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("DIFERENÇA: "+dif);
                System.out.println("STATUS: GOLEADA");
                break;
            default:
                System.out.println("DIFERENÇA: "+dif);
                System.out.println("STATUS: GOLEADA HISTÓRICA");
        }
    }
}
