import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = input.nextInt();
        int contDiv = 0;
        for(int i=1; i<=numero; i++){
            if(numero % i == 0){
                contDiv++;
            }

        }
        if(contDiv == 2){
            System.out.println("E PRIMO");
        }else{
            System.out.println("Não e primo");
        }
    }
}