public class Bubble {
    
    public static void main(String[] args) {
        
        int vetor[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for(int i = 0; i < 9; i++){

            for(int j = i + 1;j < 10; j++){

                if (vetor[i] > vetor[j]) {

                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                    
                }

            }

        }

        for(int i = 0; i < 10; i++)
            System.out.println(vetor[i]);

    }

}
