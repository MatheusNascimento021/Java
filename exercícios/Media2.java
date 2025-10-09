

package com.mycompany.media2;
import java.util.Scanner;
import java.util.Locale;
public class Media2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double nota1,nota2,media;
        System.out.println("---------------------");
        System.out.println("ESCOLA JAVALI CANSADO");
        System.out.println("---------------------");
        System.out.println("DIGITE A PRIMEIRA NOTA:");
        nota1 = sc.nextDouble();
        System.out.println("DIGITE A SEGUNDA NOTA:");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2) / 2;    
        System.out.println("MÉDIA FINAL:" + media);
        
        if (media >= 9 && media <=10){
            System.out.println("APROVEITAMENTO:A");
        }
        else if (media >= 8 && media < 9){
            System.out.println("APROVEITAMENTO:B");
        }
        else if (media >= 7 && media < 8){
            System.out.println("APROVEITAMENTO:C");
        }
        else if (media >= 6 && media < 7){
            System.out.println("APROVEITAMENTO:D");
        }
        else if (media >= 5 && media <6){
            System.out.println("APROVEITAMENTO:E");
        }
        else{
            System.out.println("APROVEITAMENTO:F");
        }
        
        sc.close();
        
        
    }   
}
