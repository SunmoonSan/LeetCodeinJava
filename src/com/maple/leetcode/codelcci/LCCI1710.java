package com.maple.leetcode.codelcci;

import java.util.HashMap;
import java.util.Map;

public class LCCI1710 {
    public static void main(String[] args) {
        LCCI1710 lcci = new LCCI1710();
        int[] nums = {1, 2, 5, 9, 5, 9, 5, 5, 5};
        int n = lcci.majorityElement(nums);
        System.out.println(n);
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> kvs = new HashMap();
        for (int num : nums) {
            if (kvs.containsKey(num)) {
                kvs.put(num, kvs.get(num) + 1);
            } else {
                kvs.put(num, 1);
            }
            if (kvs.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }
}
