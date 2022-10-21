package chapter_6;

public class OverLoad {
    void ovlDemo(){
        System.out.println("Without parameters");
    }
    void ovlDemo(int a){
        System.out.println("One parameter: " + a);
    }

    int  olvDemo(int a, int b){
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    double olvDemo(double a, double b){
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }
}
