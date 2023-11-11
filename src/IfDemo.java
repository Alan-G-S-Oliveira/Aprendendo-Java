public class IfDemo {

    public static void main(String[] args) {

        int a, b, c;

        a = 2;
        b = 3;
        
        if(a < b)
            System.out.println("a é menor do que b.");

        if(a == b)
            System.out.println("Você não verá isso.");

        c = a - b;

        System.out.println();

        System.out.println("c contém -1");
        if(c >= 0)
            System.out.println("c não é negativo.");
        if(c < 0)
            System.out.println("c é positivo.");

        c = b - a;

        System.out.println();

        System.out.println("c contém 1");
        if(c >= 0)
            System.out.println("c não é negativo.");
        if(c < 0)
            System.out.println("c é positivo.");

    }
    
}
