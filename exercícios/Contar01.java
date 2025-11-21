

package com.mycompany.contar01;

import java.util.Scanner;

public class Contar01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Início:");
        int inicio = sc.nextInt();
        System.out.print("Fim:");
        int fim = sc.nextInt();
        System.out.print("Passo:");
        int passo = sc.nextInt();
        
        for(int i=inicio; i<=fim; i+=passo){
            System.out.println(i);
        }
        
        sc.close();
    }
}
