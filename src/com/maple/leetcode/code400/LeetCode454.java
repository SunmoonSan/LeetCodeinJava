package com.maple.leetcode.code400;

import java.util.HashMap;
import java.util.Map;

public class LeetCode454 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> kvs = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                int t = a + b;
                if (kvs.containsKey(t)) {
                    kvs.put(t, kvs.get(t) + 1);
                } else {
                    kvs.put(t, 1);
                }
            }
        }

        int count = 0;
        for (int c : C) {
            for (int d : D) {
                int t = c + d;
                if (kvs.containsKey(-t)) {
                    count += kvs.get(-t);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode454 leet = new LeetCode454();
        int[] A = {-1, -1};
        int[] B = {-1, -1};
        int[] C = {-1, 1};
        int[] D = {1, -1};
        int count = leet.fourSumCount(A, B, C, D);
        System.out.println(count);
    }
}