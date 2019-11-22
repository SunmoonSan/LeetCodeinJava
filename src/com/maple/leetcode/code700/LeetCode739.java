package com.maple.leetcode.code700;
/*
 * @desc : Created by San on 2019-05-02 20:39
 */

public class LeetCode739 {
    public int[] dailyTemperatures(int[] T) {
        int[] days = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            for (int j = i + 1; j < T.length; j++) {
                if (T[j] > T[i]) {
                    days[i] = j - i;
                    break;
                }
            }
        }

        return days;
    }

    public static void main(String[] args) {
        LeetCode739 leet = new LeetCode739();
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        leet.dailyTemperatures(nums);
    }
}
