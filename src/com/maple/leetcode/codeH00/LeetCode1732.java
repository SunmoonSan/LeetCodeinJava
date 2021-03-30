package com.maple.leetcode.codeH00;

public class LeetCode1732 {
    public static void main(String[] args) {
        LeetCode1732 leet = new LeetCode1732();
        int[] gain = {-5, 1, 5, 0, -7};
        leet.largestAltitude(gain);
    }

    public int largestAltitude(int[] gain) {
        int max = gain[0] > 0 ? gain[0] : 0;
        for (int i = 1; i < gain.length; i++) {
            gain[i] = gain[i - 1] + gain[i];
            if (max < gain[i]) {
                max = gain[i];
            }
        }
        return max;
    }
}
