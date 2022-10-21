package chapter_5;

public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int num : nums) {
            System.out.println("Value: " + num);
            sum = sum + num;
        }
        System.out.println("Sum: " + sum);
    }
}
