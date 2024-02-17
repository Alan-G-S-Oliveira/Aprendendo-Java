//Exibe uma string ao contrário usando recursão.
public class ExibirRecursivo {

    //Função de interface para que o usuário se preocupe apenas em digitar a string.
    static void exibestring(String x){

        //A chamada ocorre em x.length() - 1, pois é a última posição da string.
        exibe(x, x.length() - 1);
        System.out.println();

    }
    
    //Enquanto posição for maior ou igual a zero ele imprime o caractere na posição e chama a recursão a seguir.
    static void exibe(String x, int posicao){

        if(posicao >= 0){

            System.out.print(x.charAt(posicao));
            exibe(x, posicao - 1);

        }

    }

    public static void main(String[] args) {
        
        exibestring("Olá mundo!");

    }

}
