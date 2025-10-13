

package com.mycompany.multiplos;
import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        
        if (valor1 % valor2 == 0 || valor2 % valor1 == 0){
            System.out.println("Sao multiplos");
        }
        else{
            System.out.println("Nao sao multiplos");
        }
        
        sc.close();
            
    }
}
