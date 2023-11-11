public class LogicalOpTableInt {

    public static int boolToInt(boolean x){

        if(x)
            return 1;
        else
            return 0;

    }
    
    public static void main(String[] args) {
        
        boolean p, q;

        p = q = false;

        System.out.println("P\tQ\tAnd\tOr\tXor\tNot");
        System.out.println(boolToInt(p) + "\t" + boolToInt(q) + "\t" + boolToInt(p & q)
        + "\t" + boolToInt(p | q) + "\t" + boolToInt(p ^ q) + "\t" + boolToInt(!p));

        q = true;

        System.out.println(boolToInt(p) + "\t" + boolToInt(q) + "\t" + boolToInt(p & q)
        + "\t" + boolToInt(p | q) + "\t" + boolToInt(p ^ q) + "\t" + boolToInt(!p));

        p =  true;
        q = false;

        System.out.println(boolToInt(p) + "\t" + boolToInt(q) + "\t" + boolToInt(p & q)
        + "\t" + boolToInt(p | q) + "\t" + boolToInt(p ^ q) + "\t" + boolToInt(!p));

        q = true;

        System.out.println(boolToInt(p) + "\t" + boolToInt(q) + "\t" + boolToInt(p & q)
        + "\t" + boolToInt(p | q) + "\t" + boolToInt(p ^ q) + "\t" + boolToInt(!p));

    }

}
