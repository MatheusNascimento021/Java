

package com.mycompany.tabuadacomfor;

import java.util.Scanner;

public class TabuadaComFor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número para ver a sua tabuada:");
        int numero = sc.nextInt();
        
        for(int i=1; i<=10; i++){
            int resultado = i * numero;
            System.out.println(i + " x " + numero + " = " + resultado);
        }
    }
}
