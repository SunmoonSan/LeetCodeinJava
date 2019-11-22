package com.maple.leetcode.codeA00;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1010 {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < time.length; i++) {
            int r = time[i] % 60;
            System.out.println(r);
            if (set.contains(60 - r) || set.contains(-r)) {
                count++;
                set.add(r);
            } else {
                set.add(r);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        LeetCode1010 leet = new LeetCode1010();
        int[] time = {60, 60, 60};
        int n = leet.numPairsDivisibleBy60(time);
        System.out.println(n);
    }
}
