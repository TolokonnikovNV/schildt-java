package chapter_6;

public class SDemo2 {
    public static void main(String[] args) {
        System.out.println("Value val is: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
        StaticMeth.val = 4;
        System.out.println("Value val is: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
    }
}
