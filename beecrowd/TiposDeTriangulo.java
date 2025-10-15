

package com.mycompany.tiposdetriangulo;

import java.util.Locale;
import java.util.Scanner;

public class TiposDeTriangulo {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();
        
        if (lado1 < lado2){
            double temp = lado1; // variável temporária para guardar o valor.
            lado1 = lado2;
            lado2 = temp;
        }
        if (lado1 < lado3){
            double temp = lado1;
            lado1 = lado3;
            lado3 = temp;
        }
        
         if (lado1 >= lado2 + lado3){
            System.out.println("NAO FORMA TRIANGULO");
        }
         else{
             if (lado1 * lado1 == (lado2 * lado2 + lado3 * lado3)){
                 System.out.println("TRIANGULO RETANGULO");
             }
             if (lado1 * lado1 > (lado2 * lado2 + lado3 * lado3)){
                 System.out.println("TRIANGULO OBTUSANGULO");
             }
             if (lado1 * lado1 < (lado2 * lado2 + lado3 * lado3)){
                 System.out.println("TRIANGULO ACUTANGULO");
             }
         
             if (lado1 == lado2 && lado1 == lado3){
                  System.out.println("TRIANGULO EQUILATERO");
            }
             else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                  System.out.println("TRIANGULO ISOSCELES");
            }
         }
        sc.close();
    }
}
