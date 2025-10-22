

package com.mycompany.fizzbuzz;


public class FizzBuzz {

    public static void main(String[] args) {
        
        int contador = 1;
        
        while (contador <= 100){
            if (contador % 5 == 0 && contador % 3 == 0){
                System.out.println("FizzBuzz");
            }
            else if (contador % 5 == 0){
                System.out.println("Buzz");
            }
            else if (contador % 3 == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(contador);
            }
            contador += 1;
        }
    }
}
