package chapter_7;

abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape() {
        width = height = 0;
        name = "none";
    }
    TwoDShape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    TwoDShape(double x, String name) {
        width = height = x;
        this.name = name;
    }


    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public String getName() {
        return name;
    }


    void showDim() {
        System.out.println("Width and height - " + width + " " + height);
    }

    abstract double area();
}
