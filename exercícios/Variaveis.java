
 package com.mycompany.variaveis;
 import java.util.Locale;
public class Variaveis {

    public static void main(String[] args) {
            String nome = "Matheus";
        int idade = 26;
        double renda = 4000.0;
        int y = 25;
        double x = 10.35543;
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n",x);
        System.out.println(y);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n",x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$%.2f reais.%n", nome, idade, renda);
    }
}
