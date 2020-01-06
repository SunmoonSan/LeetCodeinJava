package com.maple.leetcode.codeC00;
/*
 * @desc : Created by San on 2020-01-06 11:29
 */

public class LeetCode1299 {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            if (i == arr.length - 1) {
                arr[i] = -1;
            } else {
                arr[i] = max;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        LeetCode1299 leet = new LeetCode1299();
        int[] arr = {17, 18, 5, 4, 6, 1};
        leet.replaceElements(arr);
    }
}
