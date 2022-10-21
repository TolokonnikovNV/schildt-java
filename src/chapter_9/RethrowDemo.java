package chapter_9;

public class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.GenException();
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Fatal error. Program execution aborted");
        }
    }
}
