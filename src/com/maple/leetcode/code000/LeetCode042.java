package com.maple.leetcode.code000;

/**
 * @author San
 * @time 2022/1/4 19:53:25
 * @desc
 */
public class LeetCode042 {
    public static void main(String[] args) {
        LeetCode042 leet = new LeetCode042();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        leet.trap(height);
    }

    public int trap(int[] height) {
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            int leftMax = 0;
            int rightMax = 0;
            for (int j = 0; j < i; j++) {
                if (height[j] != 0 && height[j] > leftMax) {
                    leftMax = height[j];
                }
            }

            for (int k = i + 1; k < height.length; k++) {
                if (height[k] != 0 && height[k] > rightMax) {
                    rightMax = height[k];
                }
            }

            int max = Math.min(leftMax, rightMax);
            if (max > height[i]) {
                sum += (max - height[i]);
            }
        }
        return sum;
    }
}
