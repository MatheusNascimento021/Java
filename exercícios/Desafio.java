

package com.mycompany.desafio;
import java.util.Scanner;
import java.util.Locale;
public class Desafio {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double largura;
        double comprimento;
        double metroQuadrado;
        double area;
        double preco;
        
        System.out.print("Qual a largura?");
        largura = sc.nextDouble();
        System.out.print("Qual o comprimento?");
        comprimento = sc.nextDouble();
        System.out.print("Qual o preço do metro quadrado?");
        metroQuadrado = sc.nextDouble();
       
        area = largura * comprimento;
        preco = area * metroQuadrado;
        
        System.out.printf("ÁREA = %.2f%n ", area);
        System.out.printf("PREÇO = %.2f%n " ,preco);
        
        
       
        
    
        sc.close();
    }
}
