
package com.mycompany.zoologico;

import java.util.Scanner;

public class Zoologico {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       
        int totalLeao = 0;
        int totalMacaco = 0;
        int totalElefante = 0;
        int totalTigre = 0;
        
        int registros=sc.nextInt();
        
        for(int i=0; i<registros; i++){
            int minutos = sc.nextInt();
            char tipo = sc.next().charAt(0);
            
            switch (Character.toUpperCase(tipo)){
                case 'L':
                    totalLeao += minutos;
                    break;
                case 'E':
                    totalElefante += minutos;
                    break;
                case 'T':
                    totalTigre += minutos;
                    break;
                case 'M':
                    totalMacaco += minutos;
                    break;
                default:
                    break;
            }            
            
        }
        int total = totalLeao + totalElefante + totalMacaco + totalTigre;
        
        double tempoLeao = (double) totalLeao / total * 100;
        double tempoTigre = (double) totalTigre / total * 100;
        double tempoElefante = (double) totalElefante / total * 100;
        double tempoMacaco = (double) totalMacaco / total * 100;
        
        System.out.println("Tempo total: " + total + " minutos");
        System.out.println("Total de Leões: " + totalLeao + " minutos");
        System.out.println("Total de Tigres: " + totalTigre + " minutos");
        System.out.println("Total de Elefantes: " + totalElefante + " minutos");
        System.out.println("Total de Macacos: " + totalMacaco + " minutos");
        
        System.out.printf("Percentual de Leões: %.2f %%%n",tempoLeao);
        System.out.printf("Percentual de Tigres: %.2f %%%n",tempoTigre);
        System.out.printf("Percentual de Elefantes: %.2f %%%n",tempoElefante);
        System.out.printf("Percentual de Macacos: %.2f %%%n",tempoMacaco);
        
        sc.close();
  
    }
}
