package chapter_2;

public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b;

        b = (byte) (b*b);

        System.out.println("i и  b: " + i + " " + b);

    }
}
