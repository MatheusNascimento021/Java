

package com.mycompany.diadasemana;
import java.util.Scanner;
public class DiaDasemana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        String dia;
        
        switch(x){
        case 1:
             dia = "DOMINGO";
            break;
        case 2:
            dia = "SEGUNDA-FEIRA";
            break;
        case 3:
            dia = "TERÇA-FEIRA";
            break;
        case 4:
            dia = "QUARTA-FEIRA";
            break;
        case 5:
            dia = "QUINTA-FEIRA";
            break;
        case 6:
            dia = "SEXTA-FEIRA";
            break;
        case 7:
            dia = "SÁBADO";
            break;
        default:
            dia = "VALOR INVÁLIDO";
            break;
        }
        
        System.out.println("DIA DA SEMANA: " + dia);
        
        sc.close();
    }
}
