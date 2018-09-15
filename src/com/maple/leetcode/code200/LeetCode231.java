package com.maple.leetcode.code200;

public class LeetCode231 {
    public boolean isPowerOfTwo(int n) {
        if (n<=0) {
            return false;
        }

        if (n==1) {
            return true;
        }

        if (n%2==0) {

            return isPowerOfTwo(n/2);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        LeetCode231 leet = new LeetCode231();
        boolean b = leet.isPowerOfTwo(1);
        System.out.println(b);
    }
}
