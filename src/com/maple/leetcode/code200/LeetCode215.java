package com.maple.leetcode.code200;
/*
在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

示例 1:
输入: [3,2,1,5,6,4] 和 k = 2
输出: 5

示例 2:
输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
输出: 4

说明:
你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 */

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode215 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        for (int n : nums) {
            queue.add(n);
            if (queue.size() > k) {
                queue.remove();
            }
        }

        return queue.remove();
    }

    public static void main(String[] args) {
        LeetCode215 leet = new LeetCode215();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int n = leet.findKthLargest(nums, k);
        System.out.println(n);
    }
}
