package chapter_6;

public class VarArgs3 {
    static void vaTest(int ... v){
        System.out.println("vaTest(int ...): "+"Number of arguments: " + v.length);
        System.out.println("Content: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void vaTest(boolean ... v){
        System.out.println("vaTest(boolean ...): "+"Number of arguments: " + v.length);
        System.out.println("Content: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void vaTest(String msg, int ... v){
        System.out.println("vaTest(String, int ...): " + msg +" "+ v.length);
        System.out.println("Content: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("Testing: ", 10, 20);
        vaTest(true, false, false);
    }
}
