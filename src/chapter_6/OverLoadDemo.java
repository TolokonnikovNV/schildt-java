package chapter_6;

public class OverLoadDemo {
    public static void main(String[] args) {
        OverLoad ob = new OverLoad();
        int resI;
        double resD;

        ob.ovlDemo();
        System.out.println();
        ob.ovlDemo(2);
        System.out.println();
        resI = ob.olvDemo(4, 6);
        System.out.println("Result call ob.olvDemo(4, 6): " + resI);
        System.out.println();
        resD = ob.olvDemo(1.1, 2.32);
        System.out.println("Result call ob.olvDemo(1.1, 2.32): " + resD);

    }
}
