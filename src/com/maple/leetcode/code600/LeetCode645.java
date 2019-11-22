package com.maple.leetcode.code600;

import java.util.HashSet;
import java.util.Set;

public class LeetCode645 {
    public int[] findErrorNums(int[] nums) {
        int copy = 0;
        int miss = 0;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                copy = n;
            } else {
                set.add(n);
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                miss = i;
                break;
            }
        }

        return new int[]{copy, miss};
    }

    public static void main(String[] args) {
        LeetCode645 leet = new LeetCode645();
        int[] nums = {3, 3, 1};
        leet.findErrorNums(nums);
    }
}
