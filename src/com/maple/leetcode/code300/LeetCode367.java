package com.maple.leetcode.code300;

public class LeetCode367 {
    public boolean isPerfectSquare(int num) {
        int l =0, r=num;

        while (l<=r) {
            int m = (l+r)/2;
            int s = m*m;
            if (num==(m*m)) {
                return true;
            } else if (num<(m*m)) {
                r=m-1;
            } else {
                l = m+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode367 leet = new LeetCode367();
        boolean b = leet.isPerfectSquare(2147395600);
        System.out.println(b);
    }
}
