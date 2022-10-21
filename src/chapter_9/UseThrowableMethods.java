package chapter_9;

public class UseThrowableMethods {
    public static void main(String[] args) {
        try{
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Standard message: ");
            System.out.println(exc);
            System.out.println("call stack");
            exc.printStackTrace(); // <-----
        }
        System.out.println("after catch instruction");
    }
}
