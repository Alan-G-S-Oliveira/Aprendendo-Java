package exercicios.java.exceptions;

public class QueueEmptyException extends Exception {

    public String toString(){

        return "A fila está vazia. Não é possível mais remover nenhum elemento.";

    }
    
}
