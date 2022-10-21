package chapter_4;

public class ConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();
        MyClass t3 = new MyClass(5);

        System.out.println(t1.x + " " + t2.x + " " + t3.x);

    }
}
