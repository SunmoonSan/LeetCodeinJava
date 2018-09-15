package com.maple.leetcode.code100;

public class LeetCode189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if (len==1) {
            return;
        }
        k = k%len;
        int[] temp = new int[k];

        for (int i=1; i<=k;i++) {
            temp[i-1] = nums[len-i];
        }

        for (int i=len-k-1; i>=0;i--) {
            nums[i+k] = nums[i];
        }

        for (int i=0; i<k;i++) {
            nums[i] = temp[k-i-1];
        }
    }

    public static void main(String[] args) {
        LeetCode189 leet = new LeetCode189();
        int[] a = {1, 2};
        leet.rotate(a, 3);
    }
}
