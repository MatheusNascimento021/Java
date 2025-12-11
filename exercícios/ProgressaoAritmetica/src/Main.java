import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("10 TERMOS DE UMA PA");
        System.out.println("====================");
        System.out.println("Primeiro:");
        int primeiro = input.nextInt();
        System.out.println("Razão:");
        int razao = input.nextInt();
        int decimo = (primeiro + 10 - 1) * razao;
        for(int i=primeiro; i<=decimo; i+=razao){
            System.out.print(i + " ");
        }

    }
}