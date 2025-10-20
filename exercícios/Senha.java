

package com.mycompany.senha;

import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a senha para acessar!");
        int senha = sc.nextInt();
        
        while (senha != 1234){
            System.out.println("Senha incorreta, acesso negado!");
            System.out.println("Tente novamente.");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta, acesso liberado!");
        
        sc.close();
    }
}
