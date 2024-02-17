package exercicios.java.jogodavelha;

public class Tabuleiro {

    //Matriz de char que representa o tabuleiro 3 x 3.
    private char [][] matriz = new char[3][3];
    //A variáveis representam qual jogador está jogando e quem venceu, respectivamente.
    private char jogador, vencedor;

    //Construtor
    Tabuleiro(){

        //Inicia toda a matriz com espaços.
        for(int i = 0; i < matriz[0].length; i++){

            for(int j = 0; j < matriz[0].length; j++)
                matriz[i][j] = ' ';

        }

        //'x' é o primeiro a jogar.
        jogador = 'x';
        //'n' representa que o jogo ainda não acabou.
        vencedor = 'n';

    }
    
    //Imprime o tabuleiro completo.
    public void imprimeTabuleiro(){

        for(int i = 0; i < matriz[0].length; i++){

            for(int j = 0; j < matriz[0].length; j++){

                System.out.print(matriz[i][j]);
                if(j != matriz[0].length - 1)
                    System.out.print(" | ");
                else
                    System.out.println();

            }

            if(i != matriz[0].length - 1)
                System.out.println("--+---+--");

        }

    }

    public boolean Jogar(int i, int j){

        //Verifica se as posições fornecidas estão dentro dos limites do tabuleiro.
        if(i < 0 || i >= matriz[0].length || j < 0 || j >= matriz[0].length){

            System.out.println("Posição inexistente.");
            return false;

        }

        //Verifica se a posição fornecida está livre.
        if(matriz[i][j] != ' '){

            System.out.println("Posição ocupada.");
            return false;

        }

        //A jogada é realizada.
        matriz[i][j] = jogador;

        //O jogador é alterado.
        if(jogador == 'x')
            jogador = 'y';
        else
            jogador = 'x';

        //Confirma sucesso.
        return true;

    }

    /*
     * Faz uma série de verificações para ver se alguém ganhou ou teve empate,
     * além disso, muda a valor da variavél vencedor para 'x', 'y' ou 'e',
     * no caso de vitória do x, do y ou empate, respectivamente.
     */
    public void fimDeJogo(){

        for(int i = 0; i < matriz[0].length; i++){

            //Verifica se houve vencedor na horizontal.
            if(matriz[i][0] == matriz[i][1] && matriz[i][0] == matriz[i][2]){

                if(matriz[i][0] == 'x'){

                    vencedor = 'x';
                    return;

                } else if(matriz [i][0] == 'y'){

                    vencedor = 'y';
                    return;

                }

            }

            //Verifica se houve vitória na verical.
            if(matriz[0][i] == matriz[1][i] && matriz[0][i] == matriz[2][i]){

                if(matriz[0][i] == 'x'){

                    vencedor = 'x';
                    return;

                } else if(matriz [0][i] == 'y'){

                    vencedor = 'y';
                    return;

                }

            }

        }

        //Verifica se houve vitória na diagonal principal.
        if(matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2]){

            if(matriz[0][0] == 'x'){

                vencedor = 'x';
                return;

            } else if(matriz[0][0] == 'y'){

                vencedor = 'y';
                return;

            }

        }

        //Verifica se houve vitória na diagonal secundária.
        if(matriz[0][2] == matriz[1][1] && matriz[0][2] == matriz[2][0]){

            if(matriz[0][2] == 'x'){

                vencedor = 'x';
                return;

            } else if(matriz[0][2] == 'y'){

                vencedor = 'y';
                return;

            }

        }
        
        /*
         * verifica se há alguma posição que contenha espaço,
         * o que significa que o jogo ainda não acabou.
         */
        for(int i = 0; i < matriz[0].length; i++){

            for(int j = 0; j < matriz[0].length; j++){

                if(matriz[i][j] == ' ')
                    return;

            }

        }

        /*
         * Se chegou até aqui significa que niguém ganhou
         * e não há mais espaços disponíveis, portanto deu empate.
         */
        vencedor = 'e';
        return;

    }

    //Retorna o vencedor, caso houver.
    public char getVencedor(){

        return vencedor;

    }

    //Retorna quem está jogando no momento.
    public char getJogador(){

        return jogador;

    }

}
