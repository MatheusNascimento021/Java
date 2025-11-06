package com.mycompany.exerciciovetor01;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioVetor01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextDouble();
        }

        double maior = numeros[0];
        int posicao = 0;

        for (int i = 1; i < n; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

        sc.close();
    }
}
