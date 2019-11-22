package com.maple.leetcode.codeA00;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode1013 {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        for (int i = 0; i < time.length; i++) {
            time[i] = time[i] % 60;
            System.out.println(time[i]);
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < time.length; i++) {
            int target = 60 - time[i];
            if (time[i] == 0) {
                target = 0;
            }
            if (set.contains(target)) {
                count++;
                set.add(time[i]);
            } else {
                set.add(time[i]);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        LeetCode1013 leet = new LeetCode1013();
        int[] time = {60, 60, 60};
        int n = leet.numPairsDivisibleBy60(time);
        System.out.println(n);
    }
}
