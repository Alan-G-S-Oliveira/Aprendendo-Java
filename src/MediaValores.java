public class MediaValores {
    
    public static void main(String[] args) {
        
        double soma = 0;
        double valores[] = new double[10];

        for(int i = 0; i < valores.length; i++)
            valores[i] = i;

        for(double x: valores)
            soma += x;

        System.out.printf("A média das somas do vetor é %.2f.\n", soma / valores.length);
    
    }

}
