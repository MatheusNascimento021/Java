

package com.mycompany.mediaaluno;

import java.util.Scanner;
import java.util.Locale;
public class MediaAluno {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double nota1,nota2,media;
        
        System.out.print("Digite a primeira nota:");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota:");
        nota2 = sc.nextDouble();
        
        media = (nota1 + nota2) / 2 ;
        
        System.out.println("MÉDIA:" + media);
        
        if (media > 7){
            System.out.println("APROVADO!");    
        }
        else if (media >= 5 && media <=6.9){
            System.out.println("RECUPERAÇÃO!");
        }
        else{
            System.out.println("REPROVADO!");
        }
        
        
        sc.close();
    
    }
}
