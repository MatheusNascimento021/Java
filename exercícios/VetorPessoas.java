

package com.mycompany.vetorpessoas;

import java.util.Scanner;
import java.util.Locale;

public class VetorPessoas {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int [] vetIdade = new int[n];
        String [] vetNomes = new String [n];
        double [] vetAltura = new double [n];
        
        
        
        for(int i=0; i<n; i++){
            vetNomes[i] = sc.next();
            vetIdade[i] = sc.nextInt();
            vetAltura[i] = sc.nextDouble();
        }
        
        double somaAltura = 0.0;
        for(int i=0; i<n; i++){
            somaAltura+=vetAltura[i];
        }
        double media = somaAltura/n;
        System.out.printf("Altura média: %.2f%n",media);
        
        int cont16 = 0;
        for(int i=0; i<n; i++){
            if(vetIdade[i] < 16){
                cont16++;
            }
        }
        double porcentagemIdades = cont16 * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",porcentagemIdades);

        
        
        sc.close();
    }
}
