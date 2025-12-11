
package maioremenorpeso;

import java.util.Scanner;

public class MaiorEMenorPeso {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double maior = 0;
        double menor = 0;
        for(int i=1; i<=5; i++){
            System.out.println("Peso da " + i + "ª pessoa:");
            double peso = input.nextDouble();
            if( i == 1){
                maior = peso;
                menor = peso;
            } else{
                if(peso > maior){
                    maior = peso;
                }
                if(peso < menor){
                    menor = peso;
                }
            }
            
        }
        System.out.println("O maior peso lido foi de " + maior +"Kg");
        System.out.println("O menor peso lido foi de " + menor +"Kg");
        
        input.close();
    }
    
}
