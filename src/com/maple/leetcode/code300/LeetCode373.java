package com.maple.leetcode.code300;
/*
给定两个以升序排列的整形数组 nums1 和 nums2, 以及一个整数 k。
定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2。
找到和最小的 k 对数字 (u1,v1), (u2,v2) ... (uk,vk)。

示例 1:
输入: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
输出: [1,2],[1,4],[1,6]
解释: 返回序列中的前 3 对数：
     [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]

示例 2:
输入: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
输出: [1,1],[1,1]
解释: 返回序列中的前 2 对数：
     [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]

示例 3:
输入: nums1 = [1,2], nums2 = [3], k = 3
输出: [1,3],[2,3]
解释: 也可能序列中所有的数对都被返回:[1,3],[2,3]
 */

import java.util.*;

public class LeetCode373 {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> list = new ArrayList<>();
        for (int n1 : nums1) {
            for (int n2 : nums2) {
                list.add(new int[]{n1, n2});
            }
        }

        Queue<Integer> queue = new PriorityQueue<>((a, b) -> {
            int[] tuple1 = list.get(a);
            int[] tuple2 = list.get(b);
            return (tuple2[0] + tuple2[1]) - (tuple1[0] + tuple1[1]);
        });

        for (int i = 0; i < list.size(); i++) {
            queue.add(i);
            if (queue.size() > k) {
                queue.remove();
            }
        }

        List<int[]> pairsList = new ArrayList<>();
        while (!queue.isEmpty()) {
            int[] pairs = list.get(queue.remove());
            pairsList.add(new int[]{pairs[0], pairs[1]});
        }
        return pairsList;
    }

    public static void main(String[] args) {
        LeetCode373 leet = new LeetCode373();
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k = 3;
        leet.kSmallestPairs(nums1, nums2, k);
    }
}
