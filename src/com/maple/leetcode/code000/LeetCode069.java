package com.maple.leetcode.code000;

public class LeetCode069 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int t = x;
        int count = 1;
        while (t > 9) {
            count++;
            t = t / 10;
        }
        int min = 1, max = 1;
        for (int i = 0; i < (count - 1) / 2; i++) {
            min = min * 10;
        }
        max = min * 100;

        for (int i = min; i <= max; i++) {
            if (i * i <= x && (i + 1) * (i + 1) > x) {
                System.out.println("i*i>> " + i*i);
                System.out.println(i);
                System.out.println("i*i>> " + (i+1)*(i+1));
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LeetCode069 leet = new LeetCode069();
        int n = leet.mySqrt(625);
        System.out.println(n);
    }
}
