package com.maple.leetcode.code000;

import java.util.HashSet;
import java.util.Set;

/**
 * @author San
 * @time 2022/1/16 16:42:42
 * @desc
 */
public class LeetCode041 {
    public static void main(String[] args) {
        LeetCode041 leet = new LeetCode041();
        int[] nums = {1};
        int n = leet.firstMissingPositive(nums);
        System.out.println(n);
    }

    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0 && num <= nums.length) {
                set.add(num);
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return nums.length + 1;
    }
}
