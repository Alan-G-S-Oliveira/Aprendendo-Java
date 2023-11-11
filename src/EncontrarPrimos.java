public class EncontrarPrimos {
    
    public static boolean primo(int x){

        int i;

        if(x < 2)
            return false;

        for(i = 2; i < x; i++){

            if(x % i == 0)
                return false;

        }

        return true;

    }
    public static void main(String[] args) {
        
        int j;

        for(j = 2; j <= 100; j++){

            if(primo(j))
                System.out.println(j);

        }

    }

}
