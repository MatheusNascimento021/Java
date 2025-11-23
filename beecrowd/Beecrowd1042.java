

package com.mycompany.beecrowd1042;

import java.util.Scanner;

public class Beecrowd1042 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int maior,menor,meio;
        
        //descobrindo o menor valor:
        if(a <= b && a <= c){
            menor = a;
        }else if( b <= a && b <= c){
            menor = b;
        }else{
            menor = c;
        }
        
        //descobrindo o maior valor:
        if(a >= b && a >= c){
            maior = a;
        }else if(b >= a && b >= c){
            maior = b;
        }else{
            maior = c;
        }
        
        //descobrindo o valor do meio:
        if((a != menor) && (a != maior)){
            meio = a;
        }else if((b != menor) && (b != maior)){
            meio = b;
        }else{
            meio = c;
        }
        
        //mostrando os valores em ordem crescente:
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        
        //quebra de linha:
        System.out.println();
        
        //mostrando os valores na ordem em que foram digitados:
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
                
        
        sc.close();
       
    }
}
