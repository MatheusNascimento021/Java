

package com.mycompany.notasemoedas;

import java.util.Scanner;
import java.util.Locale;
public class NotasEMoedas {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        int notas100,notas50,notas20,notas10,notas5,notas2,moedas1,resto,valorEmCentavos,moedas050,moedas025,moedas010,moedas05,moedas01;
        double valor;
        
        valor = sc.nextDouble();
        
        valorEmCentavos = (int)(valor * 100);
        notas100 = valorEmCentavos / 10000;
        resto = valorEmCentavos % 10000;
        
        notas50 = resto / 5000;
        resto = resto % 5000;
        
        notas20 = resto / 2000;
        resto = resto % 2000;
        
        notas10 = resto / 1000;
        resto = resto % 1000;
        
        notas5 = resto / 500;
        resto = resto % 500;
        
        notas2 = resto / 200;
        resto = resto % 200;
        
        moedas1 = resto / 100;
        resto = resto % 100;
        
        moedas050 = resto / 50;
        resto = resto % 50;
        
        moedas025 = resto / 25;
        resto = resto % 25;
        
        moedas010 = resto / 10;
        resto = resto % 10;
        
        moedas05 = resto / 5;
        resto = resto % 5;
        
        moedas01 = resto / 1;
        resto = resto % 1;
        
        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");            
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas050 + " moeda(s) de R$ 0.50");
        System.out.println(moedas025 + " moeda(s) de R$ 0.25");
        System.out.println(moedas010 + " moeda(s) de R$ 0.10");
        System.out.println(moedas05 + " moeda(s) de R$ 0.05");
        System.out.println(moedas01 + " moeda(s) de R$ 0.01");
        
        
        sc.close();
        
        
    }
}
