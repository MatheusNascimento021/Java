

package com.mycompany.verificadoridade;
import java.util.Scanner;

public class VerificadorIdade {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("====================");
        System.out.println("VERIFICADOR DE IDADE");
        System.out.println("====================");
        
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        
        if (idade <= 12){
            System.out.println("Você é CRIANÇA!");
        }
        else if (idade < 18){
            System.out.println("Você é ADOLESCENTE!");
        }
        else if (idade < 60){
            System.out.println("Você é ADULTO!");
        }
        else{
            System.out.println("Você é IDOSO!");
        }
        
        System.out.println("===============");
        System.out.println("FIM DO PROGRAMA");
        System.out.println("===============");
        
        sc.close();
    }
}
