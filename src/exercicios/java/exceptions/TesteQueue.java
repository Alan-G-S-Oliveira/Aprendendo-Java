package exercicios.java.exceptions;

public class TesteQueue {

    public static void main(String[] args) {
        
        Queue teste = new Queue(4);

        try{

            for(int i = 0; i < 4; i++)
                teste.enfileira((char)((int)'a' + i));

            for(int i = 0; i < 5; i++)
                teste.desenfileira();
        }
        catch(QueueFullException exc){

            System.out.println(exc);

        }
        catch(QueueEmptyException exc){

            exc.printStackTrace();

        }

    }
    
}
