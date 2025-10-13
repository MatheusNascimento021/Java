
package com.mycompany.aumentosalario;
import java.util.Scanner;
import java.util.Locale;

public class AumentoSalario {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double salario = sc.nextDouble();
        double reajuste,novoSalario;
        int porcentagem;
        
        if (salario <= 400){
            reajuste = salario * 0.15;
            novoSalario =  salario + reajuste;
            porcentagem = 15;
            
            System.out.printf("Novo salario: %.2f%n" ,novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n" ,reajuste);
            System.out.println("Em percentual: " + porcentagem + " %");
            
        }
        else if(salario <= 800){
                reajuste = salario * 0.12;
                novoSalario = salario + reajuste;
                porcentagem = 12;
                System.out.printf("Novo salario: %.2f%n" ,novoSalario);
                System.out.printf("Reajuste ganho: %.2f%n" ,reajuste);
                System.out.println("Em percentual: " + porcentagem + " %");
        }
        else if ( salario <= 1200){
                reajuste = salario * 0.10;
                novoSalario = salario + reajuste;
                porcentagem = 10;
                System.out.printf("Novo salario: %.2f%n" ,novoSalario);
                System.out.printf("Reajuste ganho: %.2f%n" ,reajuste);
                System.out.println("Em percentual: " + porcentagem + " %");
        }
        else if (salario <= 2000){
                reajuste = salario * 0.07;
                novoSalario = salario + reajuste;
                porcentagem = 7;
                System.out.printf("Novo salario: %.2f%n" ,novoSalario);
                System.out.printf("Reajuste ganho: %.2f%n" ,reajuste);
                System.out.println("Em percentual: " + porcentagem + " %");
        }
        else{
            reajuste = salario * 0.04;
            novoSalario = salario + reajuste;
            porcentagem = 4;
            System.out.printf("Novo salario: %.2f%n" ,novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n" ,reajuste);
            System.out.println("Em percentual: " + porcentagem + " %");
        }
        
        sc.close();
    }
}
