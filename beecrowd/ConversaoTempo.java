
package com.mycompany.conversaotempo;
import java.util.Scanner;

public class ConversaoTempo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tempo = sc.nextInt();
        int horas = tempo / 3600;
        int minutos = (tempo % 3600) / 60;
        int segundos = tempo % 60;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
      
       sc.close(); 
        
    }
}
