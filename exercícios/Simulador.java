

package com.mycompany.simulador;

import java.util.Scanner;

public class Simulador {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("BEM-VINDO AO CAIXA ELETRÔNICO");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        System.out.print("Digite o valor do saque: R$");
        int saque = sc.nextInt();
        int total = saque;
        int cedulas = 200;
        int totalCedulas = 0;
        
        while(true){
            if(total >= cedulas){
                total -= cedulas;
                totalCedulas += 1;
            }
            else{
                if(totalCedulas > 0){
                    System.out.println("O total de " + totalCedulas + " cédula(s) de R$" + cedulas);
                }
                if (cedulas == 200){
                    cedulas = 100;
                }
                else if(cedulas == 100){
                    cedulas = 50;
                }
                else if (cedulas == 50){
                    cedulas = 20;
                }
                else if(cedulas == 20){
                    cedulas = 10;
                }
                else if(cedulas == 10){
                    cedulas = 5;
                }
                else if (cedulas == 5){
                    cedulas = 2;
                }
            totalCedulas = 0;    
            if(total == 0){
                break;
            }
                
            }
               
        }
        
        System.out.println("OBRIGADO POR USAR O NOSSO CAIXA ELETRÔNICO.");
        
        sc.close();
 
    }
}
