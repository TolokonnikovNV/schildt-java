package chapter_7;

public class Rectangle extends TwoDShape {

    Rectangle() {
        super();
    }

    Rectangle(double width, double height) {
        super(width, height, "Rectangle");
    }

    Rectangle(TwoDShape ob) {
        super(ob);
    }

    Rectangle(double x) {
        super(x, "Rectangle");
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) {
            return true;
        } else {
            return false;
        }
    }

    double area() {
        return getHeight() * getWidth();
    }
}
