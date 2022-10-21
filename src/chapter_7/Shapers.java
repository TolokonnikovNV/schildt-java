package chapter_7;

public class Shapers {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("Contour", 8.0, 12.0);
        Triangle t2 = new Triangle(t1);

        System.out.println("t1 information: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area - " + t1.area());

        System.out.println();

        System.out.println("t2 information: ");
        t2.showStyle();
        t2.showDim();

        System.out.println("Area - " + t2.area());

        System.out.println();


    }
}
