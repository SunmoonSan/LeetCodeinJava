package com.maple.leetcode.code000;
/*
 * @desc : Created by San on 2019-05-04 19:16
 */

import java.util.Arrays;

public class LeetCode088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m + n - 1; i >= m; i--) {
            System.out.println(i+ " : "+(i-m));
            nums1[i] = nums2[i - m];
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        LeetCode088 leet = new LeetCode088();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        leet.merge(nums1, 3, nums2, 3);
    }
}
