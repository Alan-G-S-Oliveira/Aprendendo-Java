public class LogicalOpTable {
    
    public static void main(String[] args) {
        
        boolean p, q;

        p = q = false;

        System.out.println("P\tQ\tAnd\tOr\tXor\tNot");
        System.out.println(p + "\t" + q + "\t" +(p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));

        q = true;

        System.out.println(p + "\t" + q + "\t" +(p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));

        p =  true;
        q = false;

        System.out.println(p + "\t" + q + "\t" +(p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));

        q = true;

        System.out.println(p + "\t" + q + "\t" +(p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));

    }

}
