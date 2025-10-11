

package com.mycompany.calculoimc;
import java.util.Locale;
import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------------");
        System.out.println(" CALCULADORA IMC ");
        System.out.println("------------------");
                
        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();
        double imc = peso / (altura*altura);
        
        if(imc < 18.5){
            System.out.printf("IMC:%.1f MAGREZA",imc);
        }
        else if (imc >= 18.5 && imc <= 24.9){
            System.out.printf("IMC:%.1f PESO IDEAL",imc);
        }
        else if (imc >= 25 && imc <= 29.9){
            System.out.printf("IMC:%.1f ACIMA DO PESO",imc);
        }
        else if (imc >= 30 && imc <= 39.9){
            System.out.printf("IMC:%.1f OBESIDADE",imc);
        }
        else {
            System.out.printf("IMC:%.1f OBESIDADE GRAVE",imc);
        }
        
        
        sc.close();
    }
}
