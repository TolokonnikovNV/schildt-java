package chapter_9;

public class ExcDemo1 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try{
            System.out.println("Before exception generation");
            nums[7] = 10;
            System.out.println("This line is never view");
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Out of bounce array");
        }
        System.out.println("After catch instruction");
    }
}
