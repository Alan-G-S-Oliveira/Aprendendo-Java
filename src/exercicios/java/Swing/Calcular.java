package exercicios.java.Swing;

public class Calcular {

    public static double operação(double x, double y, char op, Boolean ok){

        ok = true;

        if(op == '+')
            return x + y;
        if(op == '-')
            return x - y;
        if(op == 'x')
            return x * y;
        if(y == 0){

            ok = true;
            return 0;

        }

        return x / y;

    }
    
}
