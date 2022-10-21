package chapter_2;

public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y);
        System.out.println("целочисленный результат деления x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Значение b: " + b);

        i = 300;
        b = (byte) i;
        System.out.println("Значение b: " + b);


        ch = (char) i;
        System.out.println("ch: " + ch);

    }
}
