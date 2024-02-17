class FixedQueue implements ICharQ {

    private int length, inicio, fim, qtd;
    private char vetor[];

    FixedQueue(int length){

        vetor = new char[length];
        this.length = length;
        inicio = fim = qtd = 0;

    }

    int tamanhoFila(){

        return qtd;

    }

    int length(){

        return length;

    }

    public void put(char ch){

        if(fim >= length){

            System.out.println("Espaço indisponível para adcionar novos itens.");
            return;

        }

        vetor[fim] = ch;
        fim++;
        qtd++;

    }

    public char get(){

        char aux;

        if(inicio >= length || qtd == 0){

        System.out.println("Não há mais o que remover.");
        return (char) 0;

        }

        aux = vetor[inicio];
        inicio++;

        return aux;

    }

}

public class IQDemo {
    
}
