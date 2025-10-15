
package com.mycompany.animal;

import java.util.Scanner;

public class Animal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String tipo1 = sc.next();
        String tipo2 = sc.next();
        String tipo3 = sc.next();
        
        if (tipo1.equalsIgnoreCase("vertebrado")&& tipo2.equalsIgnoreCase("ave") && tipo3.equalsIgnoreCase ("carnivoro")){
            System.out.println("aguia");
        }
        else if (tipo1.equalsIgnoreCase("vertebrado") && tipo2.equalsIgnoreCase ("ave") && tipo3.equalsIgnoreCase ("onivoro")){
            System.out.println("pomba");
        }
        else if (tipo1.equalsIgnoreCase("vertebrado") && tipo2.equalsIgnoreCase("mamifero") && tipo3.equalsIgnoreCase("onivoro")){
            System.out.println("homem");
        }
        else if (tipo1.equalsIgnoreCase("vertebrado") && tipo2.equalsIgnoreCase("mamifero") && tipo3.equalsIgnoreCase("herbivoro")){
            System.out.println("vaca");
        }
        else if (tipo1.equalsIgnoreCase("invertebrado") && tipo2.equalsIgnoreCase("inseto") && tipo3.equalsIgnoreCase("hematofago")){
            System.out.println("pulga");
        }
        else if (tipo1.equalsIgnoreCase("invertebrado") && tipo2.equalsIgnoreCase("inseto") && tipo3.equalsIgnoreCase("herbivoro")){
            System.out.println("lagarta");
        }
        else if (tipo1.equalsIgnoreCase("invertebrado") && tipo2.equalsIgnoreCase("anelideo") && tipo3.equalsIgnoreCase("hematofago")){
            System.out.println("sanguessuga");
        }
        else if (tipo1.equalsIgnoreCase("invertebrado") && tipo2.equalsIgnoreCase("anelideo") && tipo3.equalsIgnoreCase ("onivoro")){
            System.out.println("minhoca");
        }
        else{
            System.out.println("Tipo não identificado!");
        }
        
        sc.close();
    }
    
}
