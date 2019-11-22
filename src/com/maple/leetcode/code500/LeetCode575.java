package com.maple.leetcode.code500;

import java.util.HashSet;
import java.util.Set;

public class LeetCode575 {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        int len = candies.length;
        for (int i = 0; i < len; i++) {
            set.add(candies[i]);

            if (set.size() > len / 2) {
                return len / 2;
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        LeetCode575 leet = new LeetCode575();
        int[] candies = {1, 1, 2, 2, 3, 3};
        int l = leet.distributeCandies(candies);
        System.out.println(l);
    }
}
