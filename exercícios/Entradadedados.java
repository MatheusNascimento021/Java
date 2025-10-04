package com.mycompany.entradadedados;

import java.util.Scanner;

public class Entradadedados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        System.out.print("Qual é o seu nome?");
        nome = sc.next();
        System.out.printf("Muito prazer %s%n",nome);
        System.out.print("Qual é a sua idade?");
        idade = sc.nextInt();
        System.out.printf("Que legal %d e uma idade e tanto.",idade);
        
        
      
        sc.close();
    }
}
