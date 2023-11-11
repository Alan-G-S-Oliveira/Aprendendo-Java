import java.io.IOException;

public class LerTeclado {
    
    public static void main(String[] args) throws IOException {
        
        int contar = 0;
        char teclado, ignore;

        do{

            System.out.print("Digite um caractere: ");
            teclado = (char) System.in.read();

            do{

                ignore = (char) System.in.read();

            } while(ignore != '\n');

            if(teclado == ' ')
                contar++;

        } while(teclado != '.');

        System.out.printf("Ao todo foi digitado %d espaços.\n", contar);

    }

}
