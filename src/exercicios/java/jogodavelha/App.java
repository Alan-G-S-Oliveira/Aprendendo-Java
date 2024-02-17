package exercicios.java.jogodavelha;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Tabuleiro jogo = new Tabuleiro();
        try (Scanner ler = new Scanner(System.in)) {

            int i, j;

            String os = System.getProperty("os.name").toLowerCase();
            boolean isWindows = os.contains("win");

            do{

                do{

                    jogo.imprimeTabuleiro();
                    System.out.println("Jogador " + jogo.getJogador() + ":");
                    System.out.println("Digite as coordenadas para jogar:");
                    i = ler.nextInt();
                    j = ler.nextInt();

                    if (isWindows) 
                        System.out.print("\u001b[2J\u001b[H");
                    else 
                        System.out.print("\u001b[2J\u001b[1;1H");

                }while(!jogo.Jogar(i, j));

                jogo.fimDeJogo();

            }while(jogo.getVencedor() == 'n');

            jogo.imprimeTabuleiro();
            System.out.println("Fim de jogo.");
            
            if(jogo.getVencedor() == 'e')
                System.out.println("Deu empate.");
            else
                System.out.println("O jogador " + jogo.getVencedor() + " venceu.");

        }

    }
    
}
