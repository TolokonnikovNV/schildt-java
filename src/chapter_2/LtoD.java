package chapter_2;

public class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100_000_001L;
        D = L;

        System.out.println("L и D: " + L + " " + D);



        long a= Long.MAX_VALUE;
        short b = (short) a;
        System.out.println(b);
    }
}
