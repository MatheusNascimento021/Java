import java.util.Scanner;
public class Main{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int soma = 0;
        for(int i=1; i<=6; i++){
            System.out.println("Digite o " + i +"º valor:");
            int num = input.nextInt();
            if(num % 2 == 0){
                soma+=num;
            }
        }
        System.out.println("A soma dos valores pares digitados foi: " + soma);

        input.close();
    }

}