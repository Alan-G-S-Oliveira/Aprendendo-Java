public class CLDemo {
    
    public static void main(String[] args) {
        
        System.out.printf("Há %d argumentos de linha de comando.\n\n", args.length);

        System.out.println("Os argumentos são: ");
        for(String x: args)
            System.out.println(x);

    }

}
