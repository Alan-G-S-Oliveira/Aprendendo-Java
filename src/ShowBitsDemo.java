class ShowBits{

    int numbits;

    ShowBits(int n){

        numbits = n;

    }

    void show(long val){

        long mask = 1;

        mask <<= numbits - 1;

        int spacer = 0;

        for(; mask != 0; mask >>>= 1){

            if((val & mask) != 0)
                System.out.print("1");
            else
                System.out.print("0");

            spacer++;

            if(spacer % 8 == 0){

                System.out.print(" ");
                spacer = 0;

            }

        }

        System.out.println();

    }

}

public class ShowBitsDemo {
    
    public static void main(String[] args) {
        
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.print("123 em binário é: ");
        b.show(123);

        System.out.println("\n87987 em binário é: ");
        i.show(87987);

        System.out.println("\n237658768 em binário é: ");
        li.show(237658768);

    }

}
