public class GalToLitTable {
    public static void main(String[] args) {
        
        double galoes, litros;
        int i = 0;

        for(galoes = 1; galoes <= 100; galoes++){

            litros = galoes * 3.7854;
            System.out.printf("%f galões são %f litros\n", galoes, litros);

            i++;

            if(i == 10){

                System.out.println();
                i = 0;

            }

        }

    }

}
