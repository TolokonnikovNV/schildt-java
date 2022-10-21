package chapter_9;

public class NestTrys {
    public static void main(String[] args) {
        int[] number = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};
        try {
            for (int i = 0; i < number.length; i++) {
                try {
                    System.out.println(number[i] + " / " + denom[i] + " = "
                            + number[i] / denom[i]);
                } catch (ArithmeticException exc) {
                    System.out.println("Attempt to divine by zero");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Matching element not found");
            System.out.println("Fatal error. Program execution aborted");
        }
    }
}
