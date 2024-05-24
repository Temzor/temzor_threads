package ru.code.eight;

public class RemoveDuplicatesTwo {
    public static int removeDuplicatesTwo(int[] nums) {
        int result = 1;
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 0;
            }

            if (count < 2) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
