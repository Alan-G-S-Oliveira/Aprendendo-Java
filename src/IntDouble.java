public class IntDouble {
    
    public static void main(String[] args) {
        
        int var;
        double x;

        var = 10;
        x = 10.0;

        System.out.printf("Valor original de var: %d\n", var);
        System.out.printf("Valor original de x: %f\n", x);
        System.out.println();

        var = var / 4;
        x = x / 4;

        System.out.printf("var após a divisão: %d\n", var);
        System.out.printf("x após  a divisão: %f\n", x);

    }

}
