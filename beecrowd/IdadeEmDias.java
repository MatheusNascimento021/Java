

package com.mycompany.idadeemdias;

import java.util.Scanner;

public class IdadeEmDias {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int valor,anos,resto,meses,dias;
        
        valor = sc.nextInt();
        
        anos = valor / 365;
        resto = valor % 365;
        
        meses = resto / 30;
        resto = resto % 30;
        
        dias = resto;
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mês(es)");
        System.out.println(dias + " dia(s)");
        
        
        sc.close();
    }
}
