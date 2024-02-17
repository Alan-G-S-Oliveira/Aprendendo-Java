package exercicios.java.exceptions;

public class QueueFullException extends Exception {

    int size;

    QueueFullException(int s){

        size = s;

    }

    public String toString() {
        
        return "Fila cheia, o tamanho máximo é: " + size + " elementos.";
        
    }
    
}
