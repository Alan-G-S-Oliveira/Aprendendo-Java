class Fila {

    char fila[];
    int inicio;
    int fim;
    int qtd;

    Fila(int tamanho){

        fila = new char[tamanho];
        inicio = 0;
        fim = 0;
        qtd = 0;

    }

    void put(char add){

        if(qtd == fila.length){

            System.out.println("Fila cheia.");
            return;

        }

        fila[fim] = add;
        fim = (fim + 1) % fila.length;
        qtd++;

    }

    char get(){

        if(qtd == 0){
            
            System.out.println("Fila vazia.");
            return ((char) 0);
        
        }

        int aux = inicio;
        inicio = (inicio + 1) % fila.length;
        qtd--;

        return fila[aux];

    }

    void exibir(){

        for(int i = 0; i < qtd; i++)
            System.out.println(fila[(inicio + i) % fila.length]);

    }

}

public class QDemo {

    public static void main(String[] args) {
        
        Fila minhaFila = new Fila(10);

        for(int i = 0; i < minhaFila.fila.length; i++)
            minhaFila.put((char)('a' + i));

        minhaFila.put('5');

        minhaFila.get();

        minhaFila.put('5');

        minhaFila.exibir();

    }
    
}
