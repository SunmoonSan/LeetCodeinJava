package com.maple.leetcode.code200;

import java.util.HashSet;
import java.util.Set;

public class LeetCode219B {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode219B leet = new LeetCode219B();
        int[] nums = {1, 2, 1};
        int k = 0;
        boolean b = leet.containsNearbyDuplicate(nums, k);
        System.out.println(b);
    }
}
