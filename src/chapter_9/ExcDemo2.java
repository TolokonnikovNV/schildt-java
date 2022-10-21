package chapter_9;

public class ExcDemo2 {
    public static void main(String[] args) {
        try{
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Out of bounce array");
        }
        System.out.println("After catch instruction");
    }
}
