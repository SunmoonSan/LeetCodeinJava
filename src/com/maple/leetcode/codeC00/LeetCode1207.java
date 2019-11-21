package com.maple.leetcode.codeC00;
/*
 * @desc : Created by San on 2019-11-20 16:41
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> kvs = new HashMap<>();
        for (int n : arr) {
            if (kvs.containsKey(n)) {
                kvs.put(n, kvs.get(n) + 1);
            } else {
                kvs.put(n, 1);
            }
        }

        return kvs.values().size() == new HashSet<>(kvs.values()).size();
    }

    public static void main(String[] args) {
        LeetCode1207 leet = new LeetCode1207();
//        int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        int[] arr = {1, 2};
        boolean b = leet.uniqueOccurrences(arr);
        System.out.println(b);
    }
}
