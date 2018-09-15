package com.maple.leetcode.code300;

public class LeetCode326 {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode326 leet = new LeetCode326();
        boolean b = leet.isPowerOfThree(45);
        System.out.println(b);
    }
}
