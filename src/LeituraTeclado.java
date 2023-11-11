import java.io.IOException;

public class LeituraTeclado {
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("Digite um caractere:");

        char letra = (char) System.in.read();

        System.out.println("Você digitou: " + letra);

    }

}
