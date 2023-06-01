package org.example;

public class FirstLast6Arrays {
    public boolean firstLast6(int[] nums) {
        if (nums.length == 0) {
            return false;
        }

        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
