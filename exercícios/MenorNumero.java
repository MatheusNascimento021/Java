

package com.mycompany.menornumero;
import java.util.Scanner;

public class MenorNumero {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int menorNumero;
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();
        
        if(numero1 < numero2 && numero1 < numero3){
            menorNumero = numero1;
        }
        else if (numero2 < numero1 && numero2 < numero3){
            menorNumero = numero2;
        }
        else{
            menorNumero = numero3;
        }
        
        System.out.println("MENOR = " + menorNumero );
        
        sc.close();
        
    }
}
