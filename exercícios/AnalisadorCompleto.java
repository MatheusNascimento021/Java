
package analisadorcompleto;

import java.util.Scanner;

public class AnalisadorCompleto {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int somaIdade = 0;
        int mulherMenos20 = 0;
        int maiorIdade = 0;
        String maisVelho = " ";
        for(int i=1; i<=4; i++){
            System.out.println("----- " + i +"ª PESSOA -----");
            System.out.println("Nome: ");
            String nome = input.next();
            System.out.println("Idade: ");
            int idade = input.nextInt();
            somaIdade+=idade;
            System.out.println("Sexo [M/F]: ");
            char sexo = Character.toUpperCase(input.next().charAt(0));
            if(sexo == 'F' && idade < 20){
                mulherMenos20++;
                
            }
            if(i == 1 && sexo == 'M'){
                maiorIdade = idade;
                maisVelho = nome;
            }
            if(sexo == 'M' && idade > maiorIdade){
                maiorIdade = idade;
                maisVelho = nome;
            }
        }
        double media = (double)somaIdade / 4;
        
        System.out.printf("A média de idade do grupo é de %.1f anos.%n",media);
        System.out.println("O homem mais velho tem " + maiorIdade + " anos e se chama " + maisVelho);
        System.out.println("Ao todo são " + mulherMenos20 + " mulheres com menos de 20 anos");
        
        input.close();
    }
    
}
