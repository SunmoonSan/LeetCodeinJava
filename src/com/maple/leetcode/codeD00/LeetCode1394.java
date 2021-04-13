package com.maple.leetcode.codeD00;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1394 {
    public static void main(String[] args) {
        LeetCode1394 leet = new LeetCode1394();
        int[] nums = {2, 2, 2, 3, 3};
        leet.findLucky(nums);
    }

    public int findLucky(int[] arr) {
        Map<Integer, Integer> kvs = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (kvs.containsKey(arr[i])) {
                kvs.put(arr[i], kvs.get(arr[i]) + 1);
            } else {
                kvs.put(arr[i], 1);
            }
        }

        int max = Integer.MIN_VALUE;
        for (Integer k : kvs.keySet()) {
            if (k.equals(kvs.get(k))) {
                if (max < k) {
                    max = k;
                }
            }
        }

        if (max == Integer.MIN_VALUE) {
            max = -1;
        }
        return max;
    }
}
