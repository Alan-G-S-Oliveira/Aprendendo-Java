import java.io.IOException;

public class MaiusculaMinuscula {
    
    public static void main(String[] args) throws IOException {
        
        int qtd = 0;
        char letra, ignore;

        do{

            System.out.print("Digite uma letra: ");
            letra = (char) System.in.read();

            do{

                ignore = (char) System.in.read();

            } while(ignore != '\n');

            if(letra >= 'a' && letra <= 'z'){

                letra -= 32;
                qtd++;

            } else if(letra >= 'A' && letra <= 'Z'){

                letra += 32;
                qtd++;

            }

            System.out.printf("\n\nLetra convertida: %c.\n\n", letra);

        } while(letra != '.');

        System.out.printf("Quantidade de conversões: %d.\n", qtd);

    }

}
