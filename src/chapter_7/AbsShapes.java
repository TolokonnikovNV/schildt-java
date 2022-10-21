package chapter_7;

public class AbsShapes {
    public static void main(String[] args) {
        TwoDShape shapes[] = new TwoDShape[4];

        shapes[0] = new Triangle("Contour", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7.0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Object - " + shapes[i].getName());
            System.out.println("Area - " + shapes[i].area());
            System.out.println();
        }
    }
}
