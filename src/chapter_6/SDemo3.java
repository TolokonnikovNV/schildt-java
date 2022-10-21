package chapter_6;

public class SDemo3 {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Inside constructor");
        System.out.println("The square root of 2 is: " + StaticBlock.rootOf2);
        System.out.println("The square root of 3 is: " + StaticBlock.rootOf3);
    }
}
