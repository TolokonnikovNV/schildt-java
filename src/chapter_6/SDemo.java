package chapter_6;

public class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Of course, ob1.x and ob2.x independent " + ob1.x + " " + ob2.x);
        System.out.println("Static variable y is general");
        StaticDemo.y = 19;
        System.out.println("Assign a value StaticDemo.y by 19");
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
        StaticDemo.y = 100;
        System.out.println("Change a value StaticDemo.y by 100");
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
    }
}
