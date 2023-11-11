public class PolToMetTable {
    
    public static void main(String[] args) {
        
        double polegadas, metros;
        int i = 0;

        for(polegadas = 1; polegadas <= 100; polegadas++){

            metros = (polegadas * 2.54) / 100;
            System.out.printf("%f polegadas é igual a %f metros.\n", polegadas, metros);

            i++;

            if(i == 12){

                System.out.println();
                i = 0;

            }

        }

    }

}
