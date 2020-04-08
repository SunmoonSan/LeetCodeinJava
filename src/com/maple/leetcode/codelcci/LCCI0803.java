package com.maple.leetcode.codelcci;
/*
 * @desc : Created by San on 2020-04-08 09:36
 */

public class LCCI0803 {
    public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        LCCI0803 lcci = new LCCI0803();
        int[] nums = {0, 2, 3, 4, 5};
        int n = lcci.findMagicIndex(nums);
        System.out.println(n);
    }
}
