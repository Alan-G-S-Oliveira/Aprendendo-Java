//Declara a classe QuickSort
class QuickSort {

    /*
     * A função qsort faz um intermédio entre o usuário e a função qs
     * para que o usuário não precise se preocupar com os limites do
     * vetor ao chamar a função.
     */
    static void qsort(char itens[]){

        //Chama a função principal
        qs(itens, 0, itens.length - 1);

    }

    /*
     * A função principal, que recebe como parâmetros o vetor,
     * seu inicio e seu fim.
     */
    private static void qs(char itens[], int left, int right){

        int i, j;
        char x, y;

        i = left;
        j = right;

        //Encontra o velor do meio do vetor
        x = itens[(left + right) / 2];

        /*
         * Usa os laços while para procurar itens a esquerda maiores que x
         * e itens na direita menores que x, assim trocando eles de posição
         * para que a esquerda de x sempre tenha valores menores e a direita
         * sempre tanha maiores.
         */
        do{

            while((itens[i] < x) && (i < right))
                i++;
            while((x < itens[j]) && (j > left))
                j--;

            if(i <= j){

                y = itens[i];
                itens[i] = itens[j];
                itens[j] = y;
                i++;
                j--;

            }

        } while(i <= j);

        //Verifica se ainda é possível chamar recursões
        if(left < j)
            qs(itens, left, j);
        if(right > i)
            qs(itens, i, right);

    }

}

public class QSDemo {

    public static void main(String[] args) {

        char a[] = {'o', 'l', 'a', 'm', 'u', 'n', 'd', 'o'};
        
        QuickSort.qsort(a);

        for(char i: a)
            System.out.println(i);
        
    }

}