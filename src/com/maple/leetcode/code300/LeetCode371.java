package com.maple.leetcode.code300;

public class LeetCode371 {
    public int getSum(int a, int b) {
        return a & b;
    }

    public static void main(String[] args) {
        LeetCode371 leet = new LeetCode371();
        int s = leet.getSum(1,2);
        System.out.println(s);
    }
}
