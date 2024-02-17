//Cria a estrutura de cada nó, contendo os dados e o próximo nó
class No{

    char dados;
    No prox;

    //Inicia o nó com dados recebendo add e prox recebendo null
    No(char add){

        dados = add;
        prox = null;

    }

}

//A estrutura da fila contendo o inicio e o fim, além da quantitade de nós
class FilaDinamica{

    private No inicio, fim;
    private int qtd;

    //Inicia a lista com inicio e fim recebendo null e qtd recebendo 0
    FilaDinamica(){

        inicio = null;
        fim = null;
        qtd = 0;

    }

    //Retorna o tamanho da fila
    int quantidade(){

        return qtd;

    }

    /*
     * Adciona um novo nó ao final da fila
     * É criado um novo objeto da classe No, passando add como argumento
     * Se qtd for igual a 0 inicio e fim recebem o novo nó
     * Senão o fim.prox recebe o novo nó e o fim passa a apontar para o novo nó
     * qtd é incrementado, indicando que um novo item foi adcionado
     */
    void enfileira(char add){

        No no = new No(add);

        if(qtd == 0){

            inicio = no;
            fim = no;

        } else {

            fim.prox = no;
            fim = no;

        }

        qtd++;

    }

    /*
     * Remove um nó do início da fila
     * Se qtd for igual a 0 então não há o que remover
     * Senão inicio.dados é copiado para uma variável auxiliar
     * inicio = inicio.prox que agora é o novo inicio
     * qtd decrementa 1, indicando que um nó foi removido
     * O valor removido é retornado 
     */
    char desenfileira(){

        if(qtd == 0)
            return ((char) 0);
            
        char aux = inicio.dados;
        inicio = inicio.prox;
        qtd--;

        return aux;

    }

}

public class DinamicQueue {
    
    public static void main(String[] args) {
        
        FilaDinamica minhaFilaDinamica = new FilaDinamica();
        
        for(char i = 'a'; i <= 'z'; i++)
            minhaFilaDinamica.enfileira(i);

        for(char i = 'a'; i <= 'z'; i++)
            System.out.println(minhaFilaDinamica.desenfileira());

    }
    
}
