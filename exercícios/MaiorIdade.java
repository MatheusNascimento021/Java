
package maioridade;

import java.util.Scanner;

public class MaiorIdade {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int anoAtual = 2025;
        int maior18 = 0;
        int menor18 = 0;
        for(int i=1; i<=7; i++){
            System.out.println("Em que ano a " + i + "ª pessoa nasceu");
            int ano = input.nextInt();
            int idade = anoAtual - ano;
            if(idade >= 18){
                maior18++;
            }else{
                menor18++;
            }
            
        }
        System.out.println("Ao todo tivemos " + maior18 + " pessoas maiores de idade.");
        System.out.println("E também tivemos " + menor18 + " pessoas menores de idade.");
        
        input.close();
    }
    
}
