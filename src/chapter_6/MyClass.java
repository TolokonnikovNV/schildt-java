package chapter_6;

public class MyClass {
    private int alpha;
    public int beta;
    int gamma;
    int x;

    void setAlpha(int alpha){
        this.alpha = alpha;
    }

    int getAlpha(){
        return this.alpha;
    }

    public MyClass() {
        System.out.println("Inside MyClass");
        x = 0;
    }

    public MyClass(int i) {
        System.out.println("Inside MyClass (int)");
        x = i;
    }

    public MyClass(double d) {
        System.out.println("Inside MyClass (double)");
        x = (int) d;
    }

    public MyClass(int i, int j) {
        System.out.println("Inside MyClass (int, int)");
        x = i * j;
    }
}
