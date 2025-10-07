
package com.mycompany.maiorvalor;
import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
       int maiorAb,maiorAbc; 
       int valor1 = sc.nextInt();
       int valor2 = sc.nextInt();
       int valor3 = sc.nextInt();
       
       maiorAb = (valor1 + valor2 + Math.abs (valor1-valor2))/2;
       maiorAbc = (maiorAb + valor3 + Math.abs(maiorAb-valor3))/2;
       
       System.out.println(maiorAbc + " eh o maior");
       
       sc.close();
       
    }
}
