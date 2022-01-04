package com.maple.leetcode.code000;

/**
 * @author San
 * @time 2022/1/4 19:53:25
 * @desc
 */
public class LeetCode042B {
    public static void main(String[] args) {
        LeetCode042B leet = new LeetCode042B();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        leet.trap(height);
    }

    //    public int trap(int[] height) {
//        int len = height[0];
//        for (int i = 1; i < height.length; i++) {
//            if (height[i] > len) {
//                len = height[i];
//            }
//        }
//
//        int sum = 0;
//        for (int i = 1; i <= len; i++) {
//            int left = 0;
//            int right = height.length - 1;
//
//            while (height[left] < i) {
//                left++;
//            }
//
//            while (height[right] < i) {
//                right--;
//            }
//
//            for (int j = left; j <= right; j++) {
//                if (height[j] < i) {
//                    sum += 1;
//                }
//            }
//        }
//
//        return sum;
//    }
    public int trap(int[] height) {
        int[] lefts = new int[height.length];
        int leftMax = height[0];
        for (int i = 1; i < height.length; i++) {
            lefts[i] = leftMax;
            if (height[i] > leftMax) {
                leftMax = height[i];
            }
        }

        int[] rights = new int[height.length];
        int rightMax = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rights[i] = rightMax;
            if (height[i] > rightMax) {
                rightMax = height[i];
            }
        }

        int sum = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(lefts[i], rights[i]);
            int c = Math.max(min - height[i], 0);
            sum = sum + c;
        }
        return sum;
    }
}
