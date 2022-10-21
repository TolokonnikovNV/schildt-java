package chapter_7;

public class Triangle extends TwoDShape{
    private String style;

    Triangle(){
        super();
        style = "none";
    }
    Triangle(String style, double width, double height){
        super(width, height, "Triangle");
        this.style = style;
    }
    Triangle(double x){
        super(x, "Triangle");
        style = "Painted over";
    }
    Triangle(Triangle ob){
        super(ob);
        style = ob.style;
    }



    double area(){
        return  getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle " + style);
    }


}
