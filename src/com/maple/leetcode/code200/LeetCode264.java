package com.maple.leetcode.code200;

public class LeetCode264 {
    public int nthUglyNumber(int n) {
        if (n <= 6) {
            return n;
        }

        int count = 6;
        for (int i = 7; i < Integer.MAX_VALUE; i++) {
            if (isUgly(i)) {
                count++;
            }

            if (count == n) {
                return i;
            }
        }

        return -1;
    }

    private boolean isUgly(int num) {
        while (num > 5) {
            if (num % 1000 == 0) {
                num = num / 1000;
            } else if (num % 60 == 0) {
                num = num / 60;
            } else if (num % 45 == 0) {
                num = num / 45;
            } else if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 3 == 0) {
                num = num / 3;
            } else if (num % 5 == 0) {
                num = num / 5;
            } else {
                return false;
            }
        }

        if (num == 1) {
            return true;
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode264 leet = new LeetCode264();
        int n = leet.nthUglyNumber(1407);
        System.out.println(n);
    }
}
