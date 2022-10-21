package chapter_6;

public class TypeConv {
    public static void main(String[] args) {
        OverLoad2 ob = new OverLoad2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;
        long l = 111;

        ob.f(i);
        ob.f(d);
        ob.f(b);
        ob.f(s);
        ob.f(f);
        ob.f(l);

    }
}
