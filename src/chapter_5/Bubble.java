package chapter_5;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < nums.length-1; j++) {

            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] > nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
