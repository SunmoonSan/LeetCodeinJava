package com.maple.leetcode.code700;
/*
 * @desc : Created by San on 2019-05-07 22:53
 */

import com.maple.imooc.array.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode703 {
    public static void main(String[] args) {
        int[] array = {4, 5, 8, 2};
        KthLargest kth = new KthLargest(3, array);
        System.out.println(kth.add(3));
        System.out.println(kth.add(5));
        System.out.println(kth.add(10));
        System.out.println(kth.add(9));
        System.out.println(kth.add(4));
    }
}

class KthLargest {
    private int[] array;

    public KthLargest(int k, int[] nums) {
        this.array = new int[k];
        Arrays.sort(nums);
        for (int i = 0; i < k; i++) {
            this.array[i] = nums[nums.length - k + i];
        }
    }

    public int add(int val) {
        if (array[0] >= val) {
            return array[0];
        } else {
            array[0] = val;
            Arrays.sort(array);
            return array[0];
        }
    }
}