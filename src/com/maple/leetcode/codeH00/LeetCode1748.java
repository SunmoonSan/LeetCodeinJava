package com.maple.leetcode.codeH00;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1748 {
    public static void main(String[] args) {
        LeetCode1748 leet = new LeetCode1748();
        int[] nums = {1, 2, 3, 2};
        leet.sumOfUnique(nums);
    }

    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> kvs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (kvs.containsKey(nums[i])) {
                kvs.put(nums[i], kvs.get(nums[i]) + 1);
            } else {
                kvs.put(nums[i], 1);
            }
        }
        Integer sum = 0;
        for (Integer key : kvs.keySet()) {
            if (kvs.get(key) > 1) {
                continue;
            }
            sum += key;
        }
        return sum;
    }
}
