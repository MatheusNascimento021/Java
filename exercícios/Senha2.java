
package com.mycompany.senha2;

import java.util.Scanner;

public class Senha2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int senha;
        do{
            System.out.print("Digite a senha:");
            senha = sc.nextInt();
            if(senha != 1234){
                System.out.println("Acesso negado. Tente novamente.");
            }
            else{
                System.out.println("Acesso permitido");
            }
            
        }while(senha != 1234);
        
        sc.close();
        
    }
}
