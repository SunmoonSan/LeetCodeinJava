package com.maple.leetcode.code400;

public class LeetCode496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    while (j + 1 <= nums2.length - 1) {
                        if (nums2[j + 1] < nums1[i]) {
                            j++;
                        } else {
                            num[i] = nums2[j+1];
                        }

                    }

                    if (j == nums2.length - 1) {
                        num[i] = -1;
                    } else {
                        num[i] = nums2[j + 1];
                    }
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        LeetCode496 leet = new LeetCode496();
        int[] num1 = {4, 1, 2};
        int[] num2 = {1, 3, 4, 2};
        int[] n = leet.nextGreaterElement(num1, num2);
        System.out.println(n);
    }
}
