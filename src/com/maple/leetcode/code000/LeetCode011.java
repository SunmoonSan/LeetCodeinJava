package com.maple.leetcode.code000;

public class LeetCode011 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            int current = Math.min(height[l], height[r]) * (r - l);
            if (max < current) {
                max = current;
            }
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
