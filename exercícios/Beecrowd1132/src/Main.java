import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int maior = Math.max(x,y);
        int menor = Math.min(x,y);
        int soma = 0;
        for(int i=menor; i<=maior; i++){
            if(i%13!=0){
                soma+=i;
            }
        }
        System.out.println(soma);

        input.close();


    }
}