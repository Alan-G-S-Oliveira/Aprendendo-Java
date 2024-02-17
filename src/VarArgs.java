//Testa o uso de varargs
class Teste {


    //Mostra a quantidade de números, o maior,o menor e a média dos números inteiros
    static void calculo(int ... x){

        int menor, maior, media = 0;
        menor = maior = x[0];

        for(int i: x){

            if(i < menor)
                menor = i;
            if(i > maior)
                maior = i;

            media += i;

        }

        System.out.printf("A quantidade de números é %d.\n", x.length);
        System.out.printf("O maior número é %d.\n", maior);
        System.out.printf("O menor número é %d.\n", menor);
        System.out.printf("A média dos números é %.2f.\n\n", (double) media / x.length);

    }

    //Mostra a quantidade de números, o maior,o menor e a média dos números reais
    static void calculo(double ... x){

        double menor, maior, media = 0;
        menor = maior = x[0];

        for(double i: x){

            if(i < menor)
                menor = i;
            if(i > maior)
                maior = i;

            media += i;

        }

        System.out.printf("A quantidade de números é %d.\n", x.length);
        System.out.printf("O maior número é %.2f.\n", maior);
        System.out.printf("O menor número é %.2f.\n", menor);
        System.out.printf("A média dos números é %.2f.\n\n", media / x.length);

    }


}

public class VarArgs {
    
    public static void main(String[] args) {

        Teste.calculo(1.23, 2.477462, 3.172, 4.28, 5, 6.009, 7.9, 8.1, 9.00, 10.122);
        
    }

}
