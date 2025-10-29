

package com.mycompany.analisadordevalores;

import java.util.Scanner;

public class AnalisadorDeValores {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int soma=0,divisivel5=0,nulos=0,somaPar=0;
        double media = 0;
        
        for(int i=1; i<=5; i++){
            System.out.print("Digite o " + i + "o. Valor:");
            int valor = sc.nextInt();
            
            soma += valor;
            
            if(valor % 5 == 0){
                divisivel5 +=1;
            }
            if(valor % 2 == 0){
                somaPar+=valor;
            }
            if(valor == 0){
                nulos+=1;
            }
        }
        media = (double) soma / 5;
        
        System.out.println("A soma entre os valores e " + soma);
        System.out.println("A media entre os valores e " + media);
        System.out.println("Valores divisiveis por cinco: " + divisivel5);
        System.out.println("Valores nulos: " + nulos);
        System.out.println("A soma dos valores pares e " + somaPar);
    }
}
