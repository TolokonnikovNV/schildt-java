package chapter_9;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw");
            throw new ArithmeticException();
        } catch (ArithmeticException exc){
            System.out.println("Exception catch");
        }
        System.out.println("After try/catch block");
    }
}
