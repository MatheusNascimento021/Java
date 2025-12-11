import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número pare ver a sua tabuada ate 10: ");
        int num = input.nextInt();
        int resultado = 0;
        for(int i=1; i<=10; i++){
            System.out.println(i + " x " + num + " = " + num*i);
        }

        input.close();
    }
}
