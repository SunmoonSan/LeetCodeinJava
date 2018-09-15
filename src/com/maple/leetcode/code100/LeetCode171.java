package com.maple.leetcode.code100;

public class LeetCode171 {
    public int titleToNumber(String s) {
        int len = s.length();
        double sum =0;
        for (int i=0;i<s.length();i++) {
            sum += (s.charAt(i)-'A'+1)*Math.pow(26, len-i-1);
        }
        return (int) sum;
    }

    public static void main(String[] args) {
        LeetCode171 leet = new LeetCode171();
        System.out.println(leet.titleToNumber("AAA"));
    }
}
