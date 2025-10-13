
package com.mycompany.tempodejogo;
import java.util.Scanner;

public class TempoDeJogo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int horaInicio = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;
        
        if (horaInicio < horaFinal){
            duracao = horaFinal - horaInicio;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        else if (horaFinal <= horaInicio){
            duracao = (24- horaInicio) + horaFinal;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        
        sc.close();
        
    }
}    