package chapter_5;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class MinMax2 {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int min, max;

        min = max = nums[0];

        for (int i = 0; i < 10; i++) {
            if (min < nums[i]){
                min = nums[i];
            }
            if (max > nums[i]){
                max = nums[i];
            }
        }

        System.out.println("Min value is " + min);
        System.out.println("Max value is " + max);
        Arrays.sort(nums);
        System.out.println(Arrays.toString((nums)));
    }
}
