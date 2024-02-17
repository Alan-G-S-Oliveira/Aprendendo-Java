package exercicios.java.exceptions;
/*
 * Cria novamente uma fila estática utilizando os conceitos de classes públicas e privadas,
 * além de sobrecarregar os construtores, para poder criar a fila de várias maneiras.
 */

class Queue {

    //Declara vetor[], inicio, fim e qtd como private e length como public
    private char vetor[];
    private int inicio, fim, qtd;
    public int length;

    /*
     * Inicia a fila de modo clássico
     * Vetor é alocado de acordo com tamanho
     * inicio, fim e qtd recebem 0
     * length recebe tamanho
     */
    Queue(int tamanho){

        vetor = new char[tamanho];
        inicio = fim = qtd = 0;
        length = tamanho;

    }

    /*
     * Inicia a fila a partir de outra já existente
     * vetor é alocado de acordo com N1.length,
     * indicando o tamanho máximo da outra fila
     * As variáveis inicio, fim e qtd recebem os valores dos respectivos campos de N1
     * É criado um laço for que vai de inicio a fim
     * para copiar os elementos de N1 para fila atual
     */
    Queue(Queue N1){

        vetor = new char[N1.length];
        inicio = N1.inicio;
        fim = N1.fim;
        qtd = N1.qtd;
        length = N1.length;

        for(int i = 0; i < length; i++)
            vetor[(inicio + i) % length] = N1.vetor[(inicio + i) % length];

    }

    /*
     * Inicia a fila a partir de um vetor
     * As variáveis length, fim e qtd recebem o tamanho da vetor "fila"
     * vetor é alocado de acordo com length
     * inicio recebe 0
     * É criado um laço for que copia todos os itens do vetor para a fila atual
     */
    Queue(char fila[]){

        length = qtd = fila.length;
        vetor = new char[length];
        inicio = fim = 0;

        for(int i = 0; i < length; i++)
            vetor[i] = fila[i];

    }

    //Retorna o tamanho da fila
    int tamanhoFila(){

        return qtd;

    }

    /*
     * Adciona um novo elemento na fila
     * Se a fila estiver cheia então não se pode adcionar
     * Senão é adcionado um novo item na posição fim
     * e o fim receber (fim + 1) % vetor.length, indicando
     * a nova posição vazia
     * qtd é incrementado indicando que foi adcionado um item
     */
    void enfileira(char add) throws QueueFullException{

        if(qtd == vetor.length)
            throw new QueueFullException(this.vetor.length);

        vetor[fim] = add;
        fim = (fim + 1) % vetor.length;
        qtd++;

    }

    /*
     * Revove e retorna o primeiro elemento da fila
     * Se a fila estiver vazia então nada é feito
     * Senão inicio recebe (inicio + 1) % vetor.length,
     * indicando a nova posição de inicio da fila
     * qtd é decrementado, Indicando que um elemento foi removido
     * O elemento é retornado
     */
    char desenfileira() throws QueueEmptyException{

        if(qtd == 0)
            throw new QueueEmptyException();

        int aux = inicio;
        inicio = (inicio + 1) % vetor.length;
        qtd--;

        return vetor[aux];

    }

}
