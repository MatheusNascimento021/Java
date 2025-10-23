

package com.mycompany.beecrowd1159;

import java.util.Scanner;

public class Beecrowd1159 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int somaPar = 0,primeiroPar;
        int numero = sc.nextInt();
        
        while (numero !=0){
            
            if (numero % 2 == 0){
                primeiroPar = numero;
                somaPar = primeiroPar +(primeiroPar+2)+(primeiroPar+4)+(primeiroPar+6)+(primeiroPar+8);
                System.out.println(somaPar);
            }
            
            else{
                primeiroPar = numero + 1;
                somaPar = primeiroPar +(primeiroPar+2)+(primeiroPar+4)+(primeiroPar+6)+(primeiroPar+8);
                System.out.println(somaPar);
            }
            numero = sc.nextInt();
          
        }
        
        sc.close();
 
        
    }
}
