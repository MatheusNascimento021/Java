import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int pontosComputador = 0;
        int pontosJogador = 0;

        System.out.println("BEM VINDO AO PEDRA, PAPEL, TESOURA");
        System.out.println("-----------------------------------");
        System.out.println("QUEM FIZER 3 PONTOS PRIMEIRO VENCE, BOA SORTE!");
        System.out.println("VAMOS JOGAR!!!!");

        while (pontosComputador < 3 && pontosJogador < 3) {
            System.out.println("Faça sua jogada [Pedra, Papel,Tesoura]");
            String jogador = input.next();

            while (!jogador.equalsIgnoreCase("Pedra") &&
                    !jogador.equalsIgnoreCase("Papel") &&
                    !jogador.equalsIgnoreCase("Tesoura")) {
                System.out.println("Jogada inválida!");
                System.out.println("Digite apenas [Pedra,Papel ou Tesoura]");
                jogador = input.next();
            }
            String[] computador = {"Pedra", "Papel", "Tesoura"};
            int escolhaComputador = random.nextInt(3);
            String jogadaComputador = computador[escolhaComputador];

            System.out.println("Computador jogou " + jogadaComputador);

            if (jogador.equalsIgnoreCase(jogadaComputador)) {
                System.out.println("EMPATE");

            } else if (
                    (jogador.equalsIgnoreCase("Pedra") && jogadaComputador.equals("Tesoura")) ||
                            (jogador.equalsIgnoreCase("Papel") && jogadaComputador.equals("Pedra")) ||
                            (jogador.equalsIgnoreCase("Tesoura") && jogadaComputador.equals("Papel"))
            ) {
                pontosJogador++;
                System.out.println("Você venceu essa rodada!");
            } else {
                pontosComputador++;
                System.out.println("O computador venceu essa rodada!");
            }



        }
        if(pontosJogador == 3){
            System.out.println("PARABÉNS VOCÊ VENCEU!");
        }
        else{
            System.out.println("O COMPUTADOR VENCEU!");
        }
        System.out.println("----------------------------------------");
        System.out.println("PLACAR FINAL");
        System.out.println("COMPUTADOR " + pontosComputador + " X " + pontosJogador + " JOGADOR");
        System.out.println("----------------------------------------");

        input.close();
    }
}