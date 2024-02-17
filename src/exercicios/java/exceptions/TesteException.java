package exercicios.java.exceptions;

class NotIntResultException extends Exception{

    int n;
    int d;

    NotIntResultException(int a, int b){

        n = a;
        d = b;

    }

    public String toString() {

        return "O resultado de " + n + "/" + d + " não é um inteiro";

    }

}

public class TesteException {

    public static void main(String[] args) {
        
        int[] numerador = {4, 8, 15, 32, 64, 127, 256, 512};
        int[] denominador = {2, 0, 4, 4, 0, 8};

        for(int i = 0; i < numerador.length; i++){

            try{

                if(numerador[i] % 2 != 0)
                    throw new NotIntResultException(numerador[i], denominador[i]);

                System.out.printf("%d dividido por %d é igual a: %d.\n", numerador[i], denominador[i], numerador[i]/denominador[i]);

            }
            catch(ArrayIndexOutOfBoundsException exc){

                System.out.println("Índice fora dos limites do vetor.");

            }
            catch(ArithmeticException exc){

                System.out.println("Impossível dividir por zero.");

            }
            catch(NotIntResultException exc){

                System.out.println(exc);
                exc.printStackTrace();

            }

        }

    }
    
}
