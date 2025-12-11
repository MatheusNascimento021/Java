import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int senha = 2001;
        while(senha != 2002){
            senha = input.nextInt();
            if(senha != 2002){
                System.out.println("Senha Invalida");
            } else{
                System.out.println("Acesso permitido");
            }
        }
        input.close();

    }
}