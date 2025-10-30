
package com.mycompany.menu2;

import java.util.Scanner;

public class Menu2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int contador = 1;
        int opcoes;
        
        do {
        System.out.println("===============");
        System.out.println("|   M E N U    |");
        System.out.println("===============");
        System.out.println("| [1] De 1 a 10 |");
        System.out.println("| [2] De 10 a 1 |");
        System.out.println("| [3] Sair      |");
        
         opcoes = sc.nextInt();
        
        if (opcoes == 1){
            for(int i=1; i<=10;i++){
                System.out.println(i + "..");
            }
        }
        else if(opcoes == 2){
            for(int i=10; i>=1; i--){
                System.out.println(i+ "..");
            }
        }
        else if(opcoes !=3){
            System.out.println("Opção inválida");
        }
        
        }while(opcoes!=3);
        
        System.out.println("Saindo...");
        
        sc.close();
       
        
     
       
        
        
    }
}
