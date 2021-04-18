package com.maple.leetcode.codeG00;

public class LeetCode1688 {
    public static void main(String[] args) {
        LeetCode1688 leet = new LeetCode1688();
        int n = leet.numberOfMatches(14);
        System.out.println(n);
    }

    public int numberOfMatches(int n) {
        if (n == 1) {
            return 0;
        } else if (n % 2 == 0) {
            return n / 2 + numberOfMatches(n / 2);
        } else {
            return n / 2 + numberOfMatches(n / 2 + 1);
        }
    }
}
