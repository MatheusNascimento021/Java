

package com.mycompany.impostoderenda;

import java.util.Scanner;
import java.util.Locale;

public class ImpostoDeRenda {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double renda = sc.nextDouble();
        double valor,imposto18,imposto08,imposto28,somaImposto;
        
        if (renda <= 2000.00){
            System.out.println("Isento");
        }
        else if (renda > 2000.00 && renda <= 3000.00){
            valor = renda - 2000.00;
            imposto08 = valor * 0.08;
            System.out.printf("R$ %.2f%n",imposto08);
        }
        else if (renda > 3000.00 && renda <= 4500.00){
            imposto08 = 1000.00 * 0.08;
            imposto18 = (renda - 3000.00) * 0.18;
            somaImposto = imposto08 + imposto18;
            System.out.printf("R$ %.2f%n",somaImposto);
           
        }
        else{
            imposto08 = 1000.00 * 0.08;
            imposto18 = 1500.00 * 0.18;
            imposto28 = (renda - 4500.00) * 0.28;
            somaImposto = imposto08 + imposto18 + imposto28;
            System.out.printf("R$ %.2f%n",somaImposto);
        }
        
        sc.close();
      
    }
}
