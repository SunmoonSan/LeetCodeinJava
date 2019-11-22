package com.maple.leetcode.code700;

import java.util.*;

public class LeetCode719 {
    public int smallestDistancePair(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int dis = Math.abs(nums[i] - nums[j]);
                if (map.containsKey(dis)) {
                    map.put(dis, map.get(dis) + 1);
                } else {
                    map.put(dis, 1);
                }
            }
        }

        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        queue.addAll(map.keySet());

        while (!queue.isEmpty()) {
            int dis = queue.remove();
            if (k <= map.get(dis)) {
                return dis;
            } else {
                k = k - map.get(dis);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LeetCode719 leet = new LeetCode719();
        int[] nums = {1, 2, 0, 2, 1, 0, 1, 1, 0, 2, 2, 0, 2, 0, 1, 1, 1, 0, 1, 0, 1, 1, 2, 2, 2, 2, 0, 0, 2, 1, 2, 1, 2, 0, 0, 0, 1, 0, 0, 1, 0, 2, 1, 1, 1, 1, 0, 2, 2, 1, 0, 2, 0, 2, 2, 2, 1, 0, 2, 2, 2, 2, 0, 0, 1, 0, 1, 1, 2, 1, 2, 2, 1, 1, 0, 2, 0, 1, 0, 1, 1, 2, 0, 1, 1, 1, 1, 2, 0, 2, 2, 0, 0, 1, 1, 1, 1, 2, 1, 2, 2, 1, 2, 0, 1, 2, 2, 1, 1, 2, 1, 0, 1, 1, 1, 0, 0, 1, 2, 0, 2, 1, 0, 1, 2, 0, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0, 1, 0, 1, 0, 1, 2, 2, 2, 0, 1, 1, 1, 1, 1, 0, 2, 2, 2, 1, 0, 1, 0, 1, 0, 0, 0, 0, 2, 0, 0, 1, 1, 2, 0, 2, 1, 2, 0, 0, 1, 0, 1, 2, 1, 0, 1, 1, 1, 1, 0, 0, 2, 2, 1, 1, 0, 0, 0, 0, 1, 2, 2, 1, 1, 0, 1, 2, 0, 0, 2, 1, 2, 1, 2, 0, 2, 1, 1, 2, 2, 2, 2, 2, 0, 1, 1, 0, 1, 2, 2, 0, 2, 2, 2, 0, 2, 0, 1, 1, 2, 2, 0, 2, 2, 2, 2, 2, 2, 1, 0, 2, 2, 2, 0, 2, 0, 2, 0, 2, 1, 0, 1, 0, 1, 1, 0, 2, 0, 1, 0, 0, 2, 0, 0, 0, 2, 0, 2, 2, 0, 2, 0, 0, 1, 1, 0, 2, 0, 1, 2, 2, 0, 1, 1, 2, 0, 0, 0, 2, 1, 0, 1, 0, 2, 1, 2, 0, 1, 2, 1, 1, 1, 0, 1, 2, 1, 2, 2, 1, 2, 0, 2, 1, 0, 1, 1, 1, 2, 0, 2, 2, 2, 2, 1, 0, 2, 2, 1, 1, 1, 1, 0, 1, 2, 2, 0, 1, 2, 2, 1, 0, 0, 1, 2, 1, 0, 2, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 2, 0, 2, 0, 1, 2, 2, 0, 2, 1, 2, 2, 0, 0, 0, 0, 2, 1, 1, 2, 0, 2, 0, 1, 0, 1, 0, 2, 0, 0, 0, 2, 1, 2, 0, 1, 2, 1, 2, 1, 0, 1, 0, 1, 0, 0, 1, 2, 1, 1, 2, 1, 1, 2, 2, 1, 0, 1, 1, 2, 2, 1, 2, 2, 2, 1, 0, 1, 1, 1, 0, 0, 0, 2, 1, 1, 1, 2, 2, 1, 2, 0, 2, 1, 2, 0, 2, 2, 2, 1, 1, 2, 2, 0, 0, 2, 2, 2, 1, 2, 2, 1, 0, 2, 0, 2, 0, 2, 1, 2, 2, 1, 1, 1, 1, 1, 0, 0, 1, 0, 2, 2, 0, 0, 2, 1, 0, 1, 0, 2, 1, 0, 0, 0, 0, 1, 2, 1, 2, 0, 0, 1, 1, 2, 2, 2, 2, 0, 2, 1, 0, 0, 0, 2, 0, 1, 1, 0, 2, 1, 1, 1, 2, 1, 0, 0, 1, 0, 1, 0, 1, 2, 0, 2, 1, 0, 0, 1, 2, 1, 1, 0, 0, 0, 2, 2, 2, 1, 1, 2, 2, 0, 1, 0, 2, 2, 2, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 2, 1, 2, 0, 2, 0, 2, 1, 2, 2, 2, 0, 1, 0, 1, 2, 0, 2, 2, 1, 2, 0, 1, 2, 2, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 2, 1, 0, 0, 2, 0, 1, 0, 2, 2, 0, 1, 0, 0, 0, 1, 0, 0, 0, 2, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 2, 2, 0, 2, 2, 0, 0, 1, 2, 0, 1, 1, 1, 2, 0, 0, 0, 2, 0, 2, 2, 2, 2, 1, 0, 2, 2, 0, 0, 1, 1, 2, 2, 2, 1, 1, 2, 0, 1, 0, 0, 1, 0, 1, 2, 0, 1, 2, 0, 1, 1, 1, 1, 2, 0, 1, 0, 1, 2, 2, 0, 0, 2, 0, 1, 2, 1, 2, 1, 0, 0, 1, 0, 0, 1, 2, 0, 1, 0, 0, 0, 0, 2, 0, 1, 0, 1, 2, 0, 1, 2, 0, 0, 0, 0, 1, 1, 2, 0, 0, 0, 2, 1, 1, 0, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 2, 0, 1, 1, 2, 2, 1, 1, 0, 2, 0, 0, 1, 0, 1, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2, 0, 0, 0, 1, 1, 0, 0, 2, 1, 0, 1, 0, 2, 2, 0, 1, 2, 2, 2, 0, 0, 0, 2, 2, 1, 2, 1, 0, 0, 0, 1, 1, 2, 1, 2, 0, 1, 2, 1, 0, 1, 2, 0, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 0, 0, 1, 2, 1, 0, 0, 0, 1, 2, 0, 2, 2, 2, 1, 0, 2, 2, 1, 1, 2, 0, 0, 1, 2, 2, 2, 1, 2, 1, 2, 1, 0, 2, 2, 0, 0, 0, 2, 0, 1, 0, 1, 0, 2, 2, 2, 2, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 2, 0, 1, 0, 0, 2, 0, 1, 1, 1, 1, 2, 0, 1, 1, 2, 0, 2, 1, 2, 1, 1, 0, 1, 1, 2, 1, 2, 0, 1, 0, 0, 0, 1, 0, 2, 0, 0, 2, 0, 0, 1, 0, 1, 2, 2, 1, 2, 0, 2, 2, 2, 0, 2, 0, 2, 1, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 1, 0, 2, 1, 2, 1, 1, 0, 2, 1, 2, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 2, 2, 1, 1, 0, 1, 0, 0, 0, 2, 2, 2, 0, 1, 2, 1, 2, 0, 2, 1, 0, 0, 1, 2, 2, 1, 0, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 1, 0, 2, 2, 2, 2, 0, 1, 0, 0, 0, 1, 1, 0, 2, 0, 2, 0, 2, 2, 2, 0, 2, 0, 0, 2, 1, 0, 2, 2, 2, 1, 2, 0, 2, 2, 0, 2, 1, 2, 2, 0, 1, 0, 2, 0, 1, 1, 2, 2, 2, 2, 0, 0, 0, 0, 2, 2, 2, 2, 1, 0, 2, 0, 2, 0, 1, 0, 1, 1, 2, 2, 1, 2, 1, 2, 0, 1, 2, 2, 2, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 2, 0, 2, 2, 2, 0, 1, 0, 2, 1, 1, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 2, 0, 0, 2, 2, 2, 2, 1, 2, 2, 1, 2, 0, 1, 0, 1, 1, 0, 0, 2, 2, 1, 2, 2, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 2, 0, 1, 0, 2, 2, 2, 0, 1, 0, 2, 1, 2, 2, 0, 2, 1, 1, 1, 1, 1, 1, 2, 2, 1, 0, 1, 2, 1, 1, 0, 0, 1, 0, 2, 0, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 0, 1, 2, 2, 0, 0, 2, 1, 0, 2, 1, 0, 2, 2, 0, 2, 1, 0, 2, 1, 0, 0, 0, 0, 2, 0, 1, 0, 2, 0, 1, 2, 2, 0, 1, 0, 1, 1, 1, 2, 1, 0, 0, 0, 0, 0, 2, 0, 1, 1, 1, 0, 1, 2, 2, 1, 2, 2, 0, 2, 2, 0, 0, 0, 2, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 1, 0, 0, 2, 0, 2, 0, 1, 1, 0, 0, 2, 1, 0, 0, 1, 2, 0, 1, 0, 2, 1, 1, 1, 1, 2, 2, 0, 2, 2, 0, 1, 1, 2, 2, 0, 2, 0, 1, 0, 2, 0, 2, 2, 2, 1, 2, 2, 0, 1, 1, 2, 2, 1, 2, 2, 2, 2, 2, 2, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 2, 1, 2, 1, 2, 2, 1, 1, 0, 2, 1, 0, 0, 1, 2, 2, 1, 1, 1, 1, 0, 0, 0, 2, 0, 0, 2, 1, 1, 2, 2, 2, 1, 2, 1, 0, 1, 2, 1, 2, 2, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 2, 2, 1, 2, 1, 0, 2, 0, 1, 0, 0, 2, 0, 0, 0, 2, 1, 0, 2, 0, 2, 1, 1, 2, 0, 1, 1, 0, 2, 0, 1, 2, 2, 0, 0, 2, 0, 1, 1, 0, 2, 2, 1, 0, 0, 0, 2, 0, 1, 0, 0, 0, 2, 0, 2, 2, 1, 0, 1, 2, 2, 2, 2, 1, 1, 2, 2, 2, 0, 1, 2, 0, 2, 1, 2, 1, 0, 2, 0, 1, 0, 0, 2, 1, 0, 0, 0, 2, 0, 0, 1, 2, 2, 0, 0, 1, 0, 1, 1, 2, 2, 2, 0, 2, 1, 0, 2, 0, 1, 2, 1, 0, 1, 1, 1, 2, 1, 0, 0, 0, 2, 1, 0, 2, 2, 0, 1, 0, 2, 0, 2, 2, 2, 0, 1, 2, 2, 2, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 2, 2, 2, 0, 1, 0, 0, 1, 2, 2, 2, 0, 1, 1, 1, 2, 0, 2, 1, 1, 2, 2, 1, 0, 1, 2, 0, 2, 1, 1, 0, 1, 1, 2, 0, 1, 0, 2, 1, 2, 0, 2, 2, 2, 2, 0, 2, 0, 2, 1, 0, 1, 0, 2, 1, 0, 0, 0, 2, 0, 0, 0, 1, 0, 2, 1, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 1, 1, 1, 0, 1, 2, 2, 0, 0, 1, 1, 0, 2, 0, 2, 1, 2, 0, 0, 2, 1, 0, 0, 0, 2, 2, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 0, 0, 2, 1, 0, 0, 2, 0, 1, 2, 1, 1, 2, 2, 2, 1, 2, 2, 0, 1, 2, 0, 1, 2, 1, 2, 0, 2, 1, 0, 2, 1, 1, 2, 0, 2, 0, 1, 2, 2, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 0, 1, 1, 1, 2, 0, 1, 2, 1, 1, 0, 2, 1, 0, 2, 0, 0, 0, 2, 1, 0, 1, 2, 0, 1, 0, 1, 1, 0, 0, 1, 0, 2, 0, 0, 0, 0, 2, 2, 0, 1, 1, 2, 1, 2, 2, 1, 0, 1, 1, 2, 2, 0, 1, 0, 1, 0, 2, 1, 0, 2, 0, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 0, 1, 1, 0, 2, 0, 1, 2, 1, 2, 0, 0, 2, 2, 1, 2, 2, 1, 1, 0, 0, 0, 0, 2, 1, 0, 2, 2, 0, 1, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 1, 2, 2, 0, 2, 0, 1, 2, 2, 1, 0, 2, 2, 0, 0, 0, 2, 0, 0, 0, 1, 2, 1, 0, 2, 2, 1, 2, 0, 0, 2, 2, 2, 1, 1, 1, 2, 0, 0, 2, 0, 0, 2, 1, 2, 2, 2, 1, 0, 0, 1, 1, 1, 0, 0, 2, 0, 1, 1, 0, 0, 0, 1, 0, 2, 0, 0, 1, 1, 2, 0, 2, 0, 2, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 2, 1, 0, 1, 0, 1, 2, 0, 0, 1, 2, 0, 2, 1, 0, 1, 1, 2, 0, 2, 2, 1, 1, 2, 2, 1, 1, 0, 2, 2, 2, 2, 1, 2, 0, 2, 0, 2, 2, 1, 1, 0, 1, 0, 0, 1, 2, 2, 1, 1, 1, 0, 1, 0, 1, 2, 0, 2, 1, 2, 2, 0, 2, 2, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 2, 0, 2, 2, 0, 1, 2, 2, 1, 1, 2, 0, 1, 1, 1, 2, 0, 2, 1, 1, 2, 1, 1, 1, 1, 2, 1, 0, 1, 2, 0, 1, 1, 1, 0, 2, 1, 2, 0, 0, 2, 1, 0, 1, 0, 2, 2, 2, 1, 1, 1, 2, 2, 0, 2, 1, 0, 2, 2, 2, 2, 2, 2, 0, 0, 1, 2, 2, 2, 0, 0, 2, 0, 2, 2, 2, 2, 2, 2, 2, 0, 2, 1, 1, 2, 0, 2, 2, 0, 2, 1, 0, 0, 1, 1, 1, 1, 2, 1, 2, 0, 2, 0, 0, 0, 2, 2, 0, 0, 2, 1, 2, 1, 0, 1, 0, 2, 0, 1, 2, 0, 1, 2, 0, 1, 1, 1, 1, 0, 2, 2, 1, 0, 2, 1, 0, 2, 0, 1, 0, 0, 2, 1, 0, 1, 0, 2, 2, 2, 1, 2, 2, 0, 2, 1, 0, 2, 0, 2, 1, 1, 2, 0, 1, 2, 0, 0, 1, 1, 1, 0, 2, 0, 0, 2, 2, 0, 0, 2, 2, 1, 0, 1, 2, 1, 1, 2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 2, 2, 2, 1, 1, 2, 0, 1, 2, 1, 2, 1, 1, 1, 1, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 0, 2, 1, 0, 1, 2, 0, 1, 1, 2, 1, 1, 2, 2, 0, 2, 0, 2, 0, 2, 0, 2, 2, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 1, 0, 2, 1, 1, 0, 1, 2, 2, 1, 0, 2, 2, 1, 2, 0, 1, 2, 2, 2, 0, 1, 0, 0, 1, 0, 2, 1, 0, 1, 1, 1, 1, 2, 1, 2, 0, 1, 2, 2, 2, 2, 2, 0, 1, 0, 2, 2, 0, 0, 0, 0, 1, 2, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 2, 2, 2, 0, 0, 0, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 1, 1, 2, 0, 1, 1, 2, 0, 0, 1, 2, 0, 2, 0, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 2, 1, 1, 1, 2, 0, 1, 2, 2, 1, 1, 0, 2, 1, 2, 1, 1, 1, 0, 2, 1, 0, 0, 2, 2, 2, 1, 0, 1, 2, 1, 2, 1, 1, 0, 0, 0, 2, 1, 0, 1, 0, 0, 1, 2, 0, 0, 2, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 2, 2, 0, 0, 0, 1, 2, 0, 1, 1, 1, 1, 2, 1, 1, 0, 1, 1, 1, 0, 1, 1, 2, 1, 2, 2, 1, 2, 2, 2, 1, 1, 0, 2, 1, 0, 2, 0, 1, 1, 0, 1, 2, 1, 1, 0, 2, 0, 0, 1, 0, 0, 1, 0, 0, 1, 2, 2, 0, 1, 2, 1, 2, 2, 2, 2, 0, 2, 1, 1, 0, 0, 0, 1, 1, 2, 2, 0, 0, 0, 1, 2, 0, 1, 2, 0, 1, 2, 1, 1, 2, 1, 2, 2, 0, 1, 2, 2, 1, 2, 0, 1, 1, 0, 0, 0, 0, 1, 2, 2, 2, 0, 1, 0, 1, 0, 2, 1, 1, 0, 2, 1, 2, 1, 2, 0, 2, 0, 0, 1, 2, 0, 1, 0, 0, 0, 1, 1, 1, 2, 1, 1, 1, 0, 1, 2, 0, 0, 0, 1, 0, 2, 0, 2, 0, 1, 1, 1, 0, 0, 0, 2, 0, 1, 2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 2, 1, 1, 2, 2, 1, 1, 1, 0, 1, 0, 1, 1, 2, 1, 2, 2, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 0, 2, 1, 0, 0, 1, 1, 1, 0, 2, 2, 0, 0, 1, 1, 2, 2, 1, 2, 2, 2, 0, 0, 2, 2, 2, 0, 1, 0, 2, 1, 0, 0, 2, 0, 0, 1, 2, 1, 2, 1, 2, 0, 0, 1, 0, 2, 0, 0, 2, 0, 1, 1, 2, 2, 0, 1, 0, 1, 1, 1, 2, 2, 1, 1, 1, 2, 0, 1, 2, 0, 1, 1, 1, 0, 1, 0, 2, 2, 0, 2, 1, 0, 0, 1, 2, 0, 0, 1, 0, 1, 0, 2, 2, 1, 0, 1, 2, 2, 0, 2, 2, 0, 0, 1, 1, 1, 2, 1, 2, 2, 2, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 2, 1, 0, 2, 1, 2, 0, 2, 0, 2, 2, 0, 2, 2, 0, 1, 0, 0, 2, 0, 2, 2, 1, 0, 2, 0, 2, 2, 1, 1, 2, 2, 2, 1, 0, 0, 1, 2, 1, 0, 1, 0, 2, 2, 1, 2, 1, 2, 0, 1, 0, 1, 2, 2, 1, 0, 2, 0, 2, 1, 0, 1, 2, 0, 0, 2, 2, 1, 1, 0, 0, 1, 2, 0, 2, 2, 1, 2, 1, 0, 1, 1, 0, 0, 2, 2, 2, 2, 2, 0, 1, 0, 1, 1, 1, 0, 1, 2, 1, 0, 2, 2, 0, 1, 1, 2, 0, 2, 2, 0, 2, 1, 1, 2, 2, 2, 1, 1, 0, 1, 0, 2, 2, 2, 2, 0, 2, 2, 1, 0, 0, 1, 1, 0, 1, 2, 1, 0, 0, 0, 2, 2, 0, 2, 0, 1, 2, 2, 1, 1, 1, 2, 0, 2, 0, 0, 1, 2, 0, 1, 1, 0, 1, 1, 1, 2, 0, 0, 0, 2, 1, 0, 2, 1, 2, 1, 0, 1, 1, 2, 2, 0, 1, 0, 2, 2, 2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 0, 1, 1, 1, 1, 0, 2, 1, 0, 0, 2, 0, 2, 0, 1, 1, 0, 0, 1, 2, 0, 2, 2, 2, 1, 1, 0, 0, 0, 0, 1, 0, 1, 2, 2, 2, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 2, 2, 0, 0, 2, 2, 0, 0, 0, 2, 2, 2, 2, 1, 1, 2, 2, 2, 0, 0, 2, 0, 1, 2, 2, 2, 2, 0, 0, 2, 0, 2, 2, 2, 0, 2, 1, 1, 1, 1, 0, 2, 0, 2, 0, 0, 1, 2, 2, 1, 0, 2, 0, 1, 2, 2, 1, 2, 0, 0, 2, 0, 0, 1, 1, 1, 0, 2, 0, 2, 2, 2, 2, 1, 2, 2, 0, 1, 2, 2, 2, 0, 0, 0, 1, 0, 1, 2, 0, 0, 0, 0, 1, 2, 0, 0, 2, 2, 0, 1, 1, 2, 2, 2, 2, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 2, 2, 0, 0, 1, 1, 0, 2, 2, 1, 1, 0, 2, 0, 2, 1, 0, 1, 2, 1, 1, 2, 1, 0, 0, 1, 2, 1, 1, 2, 2, 0, 1, 2, 0, 0, 0, 1, 1, 2, 0, 2, 1, 2, 0, 1, 0, 0, 0, 2, 0, 1, 1, 2, 2, 2, 0, 0, 0, 2, 2, 1, 0, 2, 1, 0, 0, 2, 1, 1, 2, 0, 2, 0, 2, 0, 1, 2, 2, 0, 0, 0, 2, 2, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 2, 1, 1, 0, 1, 0, 2, 0, 1, 0, 2, 0, 2, 1, 0, 1, 2, 0, 0, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 1, 2, 1, 2, 2, 0, 2, 2, 1, 2, 2, 2, 1, 0, 1, 1, 1, 2, 1, 1, 1, 1, 0, 0, 1, 1, 0, 2, 2, 0, 1, 1, 1, 1, 2, 1, 1, 0, 0, 2, 2, 0, 2, 1, 1, 1, 1, 2, 0, 2, 2, 2, 0, 1, 0, 1, 0, 0, 1, 0, 2, 0, 0, 0, 2, 1, 1, 2, 2, 0, 1, 1, 0, 0, 1, 0, 2, 0, 2, 2, 0, 2, 2, 0, 0, 1, 2, 0, 1, 0, 0, 0, 0, 1, 2, 0, 1, 1, 0, 0, 2, 0, 0, 2, 0, 1, 1, 2, 2, 1, 0, 1, 0, 0, 2, 2, 2, 0, 0, 1, 0, 2, 0, 1, 2, 1, 0, 1, 1, 2, 2, 2, 2, 0, 0, 0, 2, 1, 1, 2, 0, 1, 1, 1, 0, 0, 0, 1, 0, 2, 0, 2, 0, 2, 0, 0, 1, 0, 0, 2, 0, 2, 2, 2, 2, 2, 1, 0, 2, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 1, 0, 2, 2, 2, 1, 1, 1, 0, 1, 0, 1, 1, 0, 2, 0, 0, 1, 2, 2, 1, 2, 0, 0, 0, 2, 2, 0, 1, 1, 0, 2, 0, 1, 2, 1, 0, 0, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 1, 0, 2, 1, 0, 1, 0, 1, 2, 0, 1, 2, 0, 2, 0, 0, 0, 2, 0, 2, 2, 2, 0, 1, 1, 2, 0, 0, 1, 1, 0, 1, 1, 0, 2, 0, 1, 1, 2, 2, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 2, 0, 2, 2, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 2, 0, 0, 2, 0, 2, 2, 2, 2, 1, 1, 1, 2, 0, 2, 1, 1, 0, 0, 1, 2, 1, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 2, 0, 2, 2, 2, 0, 1, 0, 1, 2, 2, 0, 0, 2, 0, 0, 1, 0, 0, 1, 2, 1, 0, 1, 2, 2, 1, 2, 2, 1, 1, 0, 2, 1, 0, 1, 1, 2, 1, 2, 1, 0, 2, 0, 1, 1, 0, 0, 1, 0, 2, 1, 1, 1, 2, 1, 0, 2, 2, 1, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 0, 0, 2, 2, 1, 1, 2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 2, 2, 1, 0, 1, 0, 1, 1, 2, 2, 0, 1, 1, 2, 2, 1, 0, 2, 1, 1, 1, 2, 1, 2, 0, 0, 2, 0, 2, 0, 0, 0, 0, 2, 2, 2, 0, 0, 0, 2, 0, 2, 1, 0, 2, 1, 1, 0, 1, 0, 0, 2, 2, 1, 1, 2, 0, 0, 0, 1, 1, 1, 1, 1, 0, 2, 2, 2, 2, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 2, 2, 1, 0, 1, 1, 0, 2, 0, 2, 2, 1, 1, 1, 1, 0, 0, 2, 2, 1, 2, 0, 0, 2, 1, 0, 2, 1, 2, 1, 2, 1, 0, 2, 2, 2, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 2, 2, 2, 1, 0, 2, 0, 2, 2, 2, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 2, 1, 2, 0, 0, 0, 1, 2, 0, 1, 2, 0, 1, 0, 0, 0, 1, 0, 1, 2, 2, 1, 2, 0, 1, 0, 2, 1, 0, 1, 2, 1, 1, 1, 2, 1, 0, 0, 2, 1, 1, 1, 0, 2, 1, 2, 2, 2, 2, 2, 1, 1, 2, 1, 2, 1, 0, 1, 1, 0, 1, 2, 0, 1, 2, 2, 2, 2, 2, 1, 0, 2, 2, 2, 2, 0, 1, 2, 1, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 2, 1, 1, 2, 0, 1, 1, 2, 0, 0, 2, 2, 0, 0, 2, 0, 2, 2, 1, 0, 1, 0, 2, 0, 0, 0, 0, 2, 0, 1, 2, 1, 0, 1, 2, 0, 2, 0, 2, 1, 0, 0, 0, 1, 2, 0, 1, 1, 2, 1, 1, 1, 0, 0, 0, 0, 0, 2, 2, 0, 2, 2, 2, 1, 2, 1, 1, 1, 2, 0, 2, 1, 0, 0, 0, 2, 2, 1, 0, 2, 0, 2, 0, 1, 0, 1, 0, 2, 0, 1, 1, 1, 1, 0, 2, 0, 1, 2, 1, 2, 0, 2, 1, 2, 1, 2, 2, 2, 2, 1, 2, 0, 0, 2, 0, 2, 2, 2, 0, 1, 2, 1, 0, 2, 0, 2, 2, 2, 0, 1, 1, 0, 2, 2, 2, 2, 0, 1, 2, 1, 2, 2, 1, 2, 0, 1, 2, 0, 0, 0, 2, 2, 1, 1, 0, 0, 2, 1, 1, 1, 0, 1, 2, 0, 1, 2, 0, 0, 1, 2, 0, 2, 0, 0, 2, 0, 2, 0, 1, 1, 1, 1, 1, 0, 2, 1, 1, 2, 2, 0, 0, 1, 2, 1, 2, 2, 1, 0, 2, 2, 2, 2, 2, 0, 1, 0, 0, 1, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 2, 2, 2, 1, 2, 1, 1, 2, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 2, 0, 1, 1, 2, 2, 0, 0, 1, 2, 0, 2, 2, 1, 2, 0, 0, 1, 0, 1, 2, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 1, 1, 1, 1, 2, 0, 2, 2, 1, 2, 2, 1, 1, 0, 0, 1, 0, 2, 0, 1, 1, 1, 1, 2, 2, 0, 0, 1, 0, 1, 0, 2, 2, 2, 1, 0, 2, 2, 2, 0, 0, 2, 2, 1, 2, 2, 0, 2, 0, 2, 1, 0, 2, 0, 0, 1, 1, 1, 0, 2, 0, 0, 0, 1, 0, 2, 1, 2, 1, 2, 1, 0, 1, 2, 0, 2, 0, 1, 2, 2, 1, 0, 1, 2, 1, 2, 1, 0, 2, 2, 2, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 0, 0, 2, 0, 1, 2, 2, 0, 1, 2, 2, 2, 2, 0, 2, 1, 1, 2, 2, 2, 2, 1, 0, 1, 0, 2, 2, 0, 1, 0, 2, 2, 0, 0, 0, 0, 2, 0, 2, 1, 0, 1, 1, 2, 2, 1, 1, 2, 1, 2, 2, 0, 1, 1, 2, 0, 0, 0, 0, 2, 0, 0, 1, 2, 1, 2, 2, 2, 1, 0, 1, 1, 1, 1, 0, 0, 2, 0, 2, 1, 0, 2, 2, 1, 0, 0, 2, 1, 2, 2, 2, 1, 0, 2, 1, 0, 1, 2, 2, 0, 1, 2, 2, 0, 0, 2, 1, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 1, 0, 0, 1, 2, 0, 1, 2, 2, 0, 1, 0, 0, 2, 2, 2, 2, 2, 0, 2, 0, 1, 1, 2, 2, 0, 0, 2, 0, 0, 2, 0, 1, 1, 0, 1, 0, 1, 2, 1, 1, 2, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 1, 0, 1, 2, 2, 0, 1, 2, 2, 1, 1, 1, 2, 1, 1, 1, 2, 2, 2, 0, 0, 0, 0, 1, 1, 0, 0, 2, 2, 1, 2, 0, 2, 2, 0, 0, 1, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 2, 2, 1, 0, 2, 2, 0, 1, 0, 0, 1, 2, 0, 0, 0, 1, 0, 2, 0, 2, 0, 0, 2, 2, 1, 1, 0, 0, 2, 0, 0, 2, 1, 0, 2, 1, 0, 1, 2, 2, 1, 0, 2, 0, 0, 0, 0, 2, 2, 2, 2, 0, 1, 1, 0, 1, 2, 0, 0, 0, 2, 0, 1, 1, 1, 1, 0, 0, 1, 2, 1, 1, 2, 2, 1, 0, 1, 1, 1, 1, 0, 2, 0, 1, 2, 2, 0, 2, 0, 2, 1, 1, 0, 1, 0, 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 0, 0, 2, 0, 0, 1, 0, 0, 2, 2, 0, 2, 1, 2, 2, 2, 2, 1, 0, 1, 2, 2, 1, 1, 1, 1, 1, 0, 1, 2, 0, 0, 2, 0, 0, 2, 2, 1, 1, 1, 0, 0, 0, 2, 0, 2, 0, 1, 2, 2, 0, 2, 2, 2, 0, 1, 0, 1, 2, 2, 2, 1, 0, 2, 1, 1, 2, 0, 1, 2, 2, 1, 0, 2, 2, 1, 2, 0, 1, 2, 1, 0, 2, 0, 0, 2, 2, 1, 1, 0, 2, 0, 0, 2, 2, 0, 1, 0, 1, 2, 0, 1, 0, 1, 2, 0, 0, 1, 1, 1, 0, 1, 1, 0, 2, 2, 2, 0, 1, 0, 1, 1, 0, 2, 1, 0, 1, 0, 0, 2, 0, 0, 1, 2, 0, 2, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 2, 0, 2, 0, 0, 1, 1, 0, 0, 2, 0, 0, 2, 1, 2, 1, 2, 2, 1, 2, 1, 0, 1, 2, 0, 2, 0, 1, 2, 2, 0, 2, 2, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 2, 1, 0, 1, 0, 1, 0, 2, 2, 2, 2, 2, 1, 2, 0, 1, 2, 2, 1, 0, 1, 2, 0, 1, 1, 0, 1, 2, 0, 1, 2, 0, 0, 2, 0, 0, 2, 2, 0, 0, 1, 2, 2, 0, 0, 1, 2, 2, 1, 1, 1, 2, 0, 2, 0, 2, 2, 1, 2, 1, 1, 2, 1, 1, 2, 2, 2, 2, 2, 0, 0, 1, 2, 1, 2, 0, 0, 2, 0, 0, 2, 1, 1, 1, 2, 0, 1, 2, 0, 1, 1, 0, 1, 1, 2, 0, 2, 2, 0, 1, 2, 2, 2, 0, 1, 2, 0, 2, 2, 0, 0, 1, 0, 0, 0, 0, 2, 0, 1, 0, 0, 2, 0, 0, 0, 2, 1, 0, 2, 0, 1, 1, 1, 0, 2, 0, 0, 1, 0, 2, 2, 1, 0, 0, 1, 1, 0, 1, 2, 1, 1, 2, 2, 2, 0, 1, 0, 2, 2, 2, 1, 1, 2, 2, 0, 1, 2, 0, 0, 1, 1, 2, 0, 1, 2, 1, 2, 1, 2, 2, 1, 2, 2, 0, 1, 1, 2, 0, 1, 0, 0, 2, 0, 0, 1, 0, 0, 0, 2, 1, 2, 2, 2, 0, 0, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 0, 0, 1, 2, 2, 0, 1, 2, 0, 1, 0, 2, 2, 1, 1, 1, 0, 0, 2, 2, 2, 2, 0, 1, 0, 2, 2, 1, 2, 1, 1, 1, 0, 2, 2, 1, 1, 2, 2, 0, 2, 1, 2, 2, 2, 1, 1, 2, 1, 0, 0, 1, 1, 0, 2, 1, 0, 2, 2, 2, 2, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 2, 1, 0, 2, 1, 0, 0, 2, 0, 2, 2, 1, 2, 0, 2, 1, 2, 2, 1, 2, 0, 0, 2, 2, 0, 0, 1, 0, 1, 2, 1, 1, 0, 2, 1, 0, 1, 2, 2, 2, 1, 1, 2, 0, 1, 1, 2, 1, 2, 0, 2, 1, 0, 2, 1, 2, 0, 0, 0, 0, 0, 2, 0, 2, 1, 0, 0, 0, 1, 2, 0, 0, 2, 1, 2, 0, 2, 1, 2, 0, 1, 1, 2, 0, 0, 1, 1, 0, 0, 2, 0, 1, 2, 1, 1, 0, 1, 0, 2, 2, 2, 2, 1, 2, 0, 2, 1, 2, 2, 1, 1, 1, 0, 1, 2, 2, 1, 2, 0, 0, 0, 2, 1, 1, 1, 0, 2, 0, 1, 0, 2, 0, 0, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 0, 2, 2, 1, 0, 0, 0, 2, 2, 0, 2, 1, 1, 0, 1, 1, 2, 1, 2, 2, 0, 0, 1, 2, 2, 2, 2, 2, 1, 2, 0, 1, 2, 1, 0, 2, 2, 2, 2, 2, 1, 2, 1, 2, 0, 0, 1, 1, 2, 2, 1, 0, 1, 2, 0, 2, 0, 1, 2, 2, 1, 2, 1, 0, 0, 1, 2, 0, 1, 1, 0, 2, 2, 2, 0, 1, 2, 2, 1, 0, 1, 2, 1, 0, 2, 2, 2, 2, 0, 1, 0, 2, 0, 0, 0, 1, 1, 2, 2, 2, 0, 2, 2, 2, 0, 2, 1, 0, 2, 1, 2, 1, 2, 2, 1, 0, 1, 1, 2, 2, 0, 1, 2, 1, 2, 1, 2, 2, 0, 2, 0, 1, 1, 0, 2, 2, 2, 2, 1, 0, 1, 0, 0, 1, 1, 2, 1, 2, 1, 1, 2, 1, 1, 0, 2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 1, 2, 2, 1, 2, 1, 2, 0, 1, 2, 1, 0, 2, 0, 2, 0, 0, 0, 2, 0, 0, 0, 1, 2, 2, 2, 2, 1, 0, 2, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 2, 2, 0, 2, 1, 2, 1, 2, 2, 1, 0, 1, 0, 2, 2, 0, 2, 2, 1, 1, 0, 0, 1, 1, 0, 2, 2, 2, 0, 1, 0, 1, 0, 0, 1, 0, 2, 1, 2, 2, 0, 0, 2, 0, 0, 2, 0, 2, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 2, 2, 1, 1, 2, 1, 2, 0, 2, 1, 0, 2, 2, 0, 2, 2, 0, 2, 2, 2, 0, 1, 2, 0, 2, 2, 2, 0, 1, 0, 0, 2, 2, 1, 1, 2, 1, 2, 2, 0, 2, 2, 2, 2, 0, 0, 0, 1, 0, 2, 0, 0, 2, 1, 2, 0, 2, 2, 2, 2, 2, 2, 1, 2, 0, 2, 2, 2, 2, 1, 1, 0, 0, 1, 2, 0, 2, 0, 2, 0, 2, 2, 0, 1, 2, 1, 2, 0, 2, 2, 1, 2, 1, 0, 0, 1, 2, 1, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 1, 0, 2, 2, 0, 0, 0, 2, 1, 2, 2, 0, 1, 0, 0, 2, 1, 1, 1, 0, 1, 1, 2, 2, 1, 1, 0, 0, 1, 1, 0, 2, 0, 2, 1, 0, 0, 1, 2, 2, 1, 0, 2, 2, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 2, 1, 0, 2, 2, 0, 2, 1, 1, 0, 2, 1, 1, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1, 2, 0, 2, 2, 2, 1, 1, 1, 0, 2, 1, 2, 1, 0, 1, 1, 0, 0, 0, 2, 1, 2, 2, 1, 1, 2, 0, 1, 0, 2, 0, 0, 2, 2, 1, 0, 2, 1, 2, 0, 2, 2, 2, 2, 0, 0, 0, 1, 0, 2, 1, 1, 0, 2, 1, 2, 2, 1, 2, 2, 1, 0, 1, 2, 2, 0, 1, 0, 1, 2, 2, 1, 1, 1, 0, 0, 0, 1, 2, 2, 1, 2, 2, 0, 2, 2, 1, 0, 0, 2, 0, 1, 1, 2, 1, 0, 0, 0, 1, 2, 0, 0, 0, 0, 1, 1, 1, 2, 1, 2, 2, 1, 2, 2, 2, 1, 1, 2, 2, 2, 2, 1, 2, 0, 0, 0, 2, 0, 2, 1, 2, 0, 1, 1, 1, 0, 0, 2, 2, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 2, 0, 2, 0, 1, 2, 2, 1, 2, 1, 1, 1, 0, 1, 0, 0, 2, 0, 1, 1, 2, 2, 2, 1, 1, 0, 1, 2, 2, 2, 0, 2, 2, 0, 1, 1, 1, 1, 1, 2, 0, 0, 2, 2, 2, 0, 0, 0, 1, 1, 2, 0, 2, 1, 0, 1, 1, 2, 1, 1, 2, 2, 2, 2, 2, 2, 0, 0, 2, 1, 2, 2, 2, 1, 2, 0, 0, 2, 1, 1, 0, 1, 0, 2, 0, 1, 2, 2, 0, 0, 0, 2, 0, 1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 0, 0, 1, 1, 0, 2, 2, 0, 1, 2, 1, 1, 0, 1, 1, 2, 1, 2, 2, 1, 0, 2, 0, 2, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 1, 0, 0, 2, 0, 0, 2, 0, 2, 0, 2, 1, 1, 2, 1, 0, 0, 0, 0, 2, 0, 0, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 2, 1, 1, 1, 2, 1, 2, 1, 2, 0, 1, 2, 2, 2, 1, 2, 2, 1, 1, 2, 0, 2, 1, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 1, 1, 0, 0, 0, 2, 1, 0, 1, 0, 0, 0, 1, 2, 0, 0, 1, 0, 0, 2, 2, 0, 2, 1, 0, 0, 1, 1, 2, 2, 2, 0, 1, 1, 0, 1, 0, 2, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 2, 2, 0, 1, 1, 1, 1, 0, 0, 2, 1, 2, 0, 0, 0, 1, 1, 2, 2, 0, 0, 0, 1, 2, 1, 0, 1, 1, 2, 1, 1, 0, 0, 2, 2, 2, 0, 1, 0, 0, 2, 1, 0, 1, 0, 0, 0, 2, 1, 2, 1, 0, 2, 0, 0, 1, 2, 2, 1, 2, 1, 2, 0, 0, 1, 1, 0, 1, 1, 1, 1, 2, 2, 1, 2, 0, 2, 1, 0, 0, 0, 2, 2, 2, 0, 1, 2, 1, 1, 0, 1, 2, 1, 0, 0, 0, 2, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 1, 0, 2, 1, 0, 2, 2, 2, 0, 2, 1, 1, 2, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 2, 0, 2, 2, 2, 2, 2, 0, 2, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 2, 1, 2, 2, 2, 1, 0, 1, 0, 2, 2, 0, 0, 0, 1, 2, 0, 2, 2, 1, 1, 1, 0, 2, 2, 0, 2, 2, 0, 1, 2, 2, 0, 1, 1, 1, 1, 2, 2, 0, 2, 2, 2, 2, 1, 1, 0, 2, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 2, 1, 2, 0, 1, 0, 2, 1, 2, 2, 2, 2, 0, 2, 1, 0, 2, 0, 2, 0, 2, 2, 0, 0, 2, 0, 2, 1, 2, 2, 0, 0, 1, 2, 0, 1, 1, 2, 0, 0, 2, 0, 1, 0, 0, 2, 0, 1, 2, 2, 1, 0, 2, 2, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 2, 0, 2, 2, 2, 2, 1, 0, 2, 2, 0, 2, 0, 0, 0, 2, 0, 0, 2, 0, 2, 1, 1, 2, 1, 1, 0, 1, 0, 1, 1, 2, 0, 2, 1, 0, 0, 0, 2, 0, 2, 0, 0, 2, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 2, 0, 1, 2, 1, 0, 1, 0, 2, 2, 2, 2, 0, 2, 0, 0, 0, 1, 1, 0, 1, 1, 0, 2, 0, 2, 2, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 2, 1, 0, 1, 2, 1, 2, 2, 0, 1, 0, 1, 2, 0, 1, 1, 2, 0, 0, 2, 0, 2, 0, 0, 1, 2, 2, 2, 0, 0, 2, 0, 1, 1, 2, 2, 0, 0, 2, 1, 1, 0, 1, 1, 0, 2, 0, 0, 2, 2, 0, 0, 2, 0, 1, 2, 1, 2, 0, 2, 1, 1, 1, 0, 2, 0, 0, 2, 2, 2, 2, 2, 1, 2, 0, 2, 1, 1, 2, 2, 2, 0, 0, 1, 0, 0, 2, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 0, 1, 0, 0, 1, 1, 0, 1, 1, 2, 0, 2, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 2, 0, 0, 0, 2, 2, 0, 0, 0, 0, 2, 1, 2, 1, 1, 1, 2, 1, 1, 0, 0, 0, 0, 2, 1, 2, 1, 0, 1, 2, 2, 0, 0, 0, 2, 2, 0, 0, 1, 0, 0, 1, 1, 2, 1, 2, 1, 0, 1, 1, 1, 1, 2, 1, 1, 2, 0, 1, 2, 1, 0, 2, 2, 2, 0, 0, 2, 2, 0, 0, 2, 1, 0, 0, 2, 2, 1, 2, 0, 0, 0, 0, 2, 1, 0, 1, 1, 0, 2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 2, 0, 2, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 2, 1, 1, 2, 1, 2, 1, 2, 2, 0, 2, 2, 1, 2, 1, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 0, 1, 1, 2, 1, 0, 2, 1, 0, 1, 0, 0, 2, 2, 1, 2, 1, 0, 1, 1, 0, 1, 1, 2, 2, 0, 0, 2, 0, 0, 0, 2, 0, 2, 1, 1, 2, 2, 1, 0, 0, 2, 1, 0, 2, 2, 1, 1, 2, 1, 2, 2, 2, 2, 0, 1, 1, 1, 2, 0, 2, 0, 0, 1, 2, 0, 2, 2, 0, 2, 2, 0, 0, 2, 1, 2, 1, 1, 0, 2, 2, 2, 1, 2, 2, 0, 0, 0, 0, 2, 0, 1, 1, 2, 1, 1, 1, 2, 2, 1, 0, 1, 1, 1, 1, 0, 1, 1, 2, 1, 0, 2, 0, 2, 0, 1, 2, 2, 0, 1, 1, 2, 1, 2, 0, 2, 1, 0, 1, 0, 1, 2, 1, 2, 0, 2, 1, 2, 1, 0, 1, 1, 1, 0, 1, 0, 0, 2, 0, 0, 2, 2, 0, 0, 2, 0, 2, 2, 0, 0, 2, 2, 0, 2, 1, 2, 0, 1, 0, 2, 1, 1, 2, 1, 2, 0, 2, 1, 2, 1, 1, 2, 2, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2, 1, 2, 0, 1, 1, 2, 0, 2, 2, 0, 2, 0, 1, 1, 1, 0, 0, 2, 1, 1, 2, 0, 1, 2, 0, 0, 2, 0, 0, 2, 0, 1, 2, 2, 2, 2, 2, 0, 1, 0, 2, 2, 1, 1, 2, 2, 2, 1, 0, 2, 2, 2, 2, 1, 0, 0, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 0, 2, 2, 1, 1, 2, 0, 1, 0, 1, 2, 2, 0, 2, 2, 2, 0, 2, 1, 1, 1, 2, 0, 0, 0, 1, 2, 0, 1, 0, 1, 0, 1, 1, 2, 2, 1, 0, 0, 2, 0, 1, 2, 0, 0, 1, 2, 1, 1, 2, 2, 1, 0, 0, 0, 0, 2, 2, 0, 2, 0, 0, 1, 0, 2, 0, 2, 1, 1, 1, 0, 2, 2, 0, 0, 0, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 2, 0, 2, 1, 0, 2, 1, 1, 1, 2, 0, 1, 1, 2, 1, 0, 1, 2, 0, 2, 1, 2, 0, 0, 1, 1, 0, 1, 1, 2, 0, 2, 2, 0, 2, 1, 0, 0, 2, 2, 0, 2, 1, 2, 1, 1, 1, 1, 2, 2, 0, 1, 2, 2, 0, 2, 1, 1, 1, 2, 0, 0, 1, 0, 0, 0, 2, 1, 1, 0, 0, 0, 1, 0, 0, 2, 2, 0, 1, 1, 0, 2, 1, 2, 2, 0, 0, 2, 2, 0, 0, 2, 2, 0, 0, 1, 1, 1, 0, 0, 0, 1, 2, 0, 0, 0, 1, 0, 1, 2, 2, 2, 1, 1, 1, 1, 0, 2, 2, 1, 1, 1, 0, 2, 0, 2, 0, 2, 1, 2, 2, 1, 2, 1, 0, 1, 1, 2, 1, 2, 2, 1, 0, 1, 1, 0, 1, 2, 1, 0, 0, 0, 0, 0, 2, 1, 2, 0, 2, 0, 1, 0, 2, 1, 0, 0, 2, 0, 1, 2, 0, 2, 2, 1, 1, 1, 0, 0, 2, 0, 1, 1, 1, 1, 2, 0, 1, 1, 0, 0, 2, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 2, 1, 2, 1, 1, 2, 2, 2, 1, 1, 0, 2, 2, 0, 2, 2, 2, 0, 2, 0, 1, 1, 0, 1, 2, 1, 2, 1, 1, 2, 0, 0, 1, 2, 1, 1, 0, 1, 2, 1, 2, 2, 1, 2, 1, 1, 0, 2, 2, 1, 0, 2, 0, 1, 2, 1, 1, 2, 0, 1, 2, 2, 1, 2, 0, 1, 2, 1, 1, 2, 0, 2, 1, 1, 0, 2, 2, 2, 0, 2, 0, 1, 1, 0, 0, 1, 0, 1, 2, 2, 1, 1, 0, 1, 1, 1, 1, 1, 2, 2, 0, 2, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 2, 2, 1, 2, 0, 1, 2, 1, 0, 0, 0, 1, 0, 0, 1, 2, 1, 1, 0, 2, 0, 0, 0, 0, 0, 1, 0, 1, 2, 1, 2, 2, 2, 0, 2, 1, 1, 2, 2, 1, 0, 1, 0, 0, 1, 1, 2, 1, 2, 0, 1, 2, 2, 2, 0, 2, 2, 0, 0, 2, 1, 2, 1, 2, 1, 0, 2, 2, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 2, 2, 2, 0, 1, 2, 0, 1, 1, 2, 1, 0, 1, 2, 0, 2, 2, 2, 1, 2, 2, 1, 1, 2, 0, 2, 1, 1, 0, 2, 1, 1, 1, 2, 1, 2, 1, 1, 2, 1, 2, 2, 1, 0, 0, 2, 0, 0, 1, 0, 2, 0, 2, 0, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 1, 0, 2, 2, 1, 2, 1, 1, 0, 2, 2, 2, 2, 0, 2, 1, 0, 2, 1, 2, 2, 0, 1, 1, 1, 0, 1, 2, 1, 2, 0, 1, 2, 2, 0, 2, 2, 2, 0, 1, 1, 0, 2, 1, 0, 0, 2, 1, 0, 1, 0, 0, 1, 1, 1, 1, 2, 0, 1, 0, 1, 1, 2, 2, 2, 0, 0, 2, 1, 1, 1, 2, 2, 0, 0, 0, 0, 2, 0, 1, 1, 1, 2, 0, 0, 1, 1, 1, 2, 0, 0, 1, 0, 2, 0, 0, 2, 2, 1, 2, 1, 1, 2, 2, 2, 2, 1, 2, 2, 1, 2, 1, 1, 0, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 2, 1, 1, 0, 1, 1, 2, 2, 0, 1, 2, 2, 1, 2, 1, 0, 1, 2, 1, 0, 2, 1, 1, 1, 2, 2, 1, 1, 0, 0, 0, 1, 1, 2, 1, 0, 2, 1, 0, 1, 2, 1, 1, 1, 1, 2, 2, 0, 2, 1, 1, 1, 1, 2, 0, 0, 1, 1, 2, 1, 2, 0, 2, 1, 0, 0, 0, 0, 1, 2, 0, 1, 2, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 1, 2, 0, 0, 1, 0, 0, 2, 0, 1, 0, 2, 0, 1, 2, 1, 1, 1, 1, 2, 0, 2, 0, 2, 0, 0, 1, 2, 2, 1, 1, 1, 1, 1, 2, 1, 2, 0, 0, 2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 2, 0, 2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 1, 1, 2, 0, 0, 0, 2, 0, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 0, 1, 1, 2, 2, 0, 1, 1, 2, 2, 1, 2, 0, 1, 2, 1, 0, 2, 2, 1, 0, 1, 0, 1, 1, 0, 2, 2, 2, 1, 2, 0, 2, 2, 2, 2, 2, 1, 0, 1, 1, 2, 1, 2, 1, 2, 0, 0, 0, 0, 2, 0, 2, 2, 1, 1, 1, 1, 2, 2, 0, 0, 0, 2, 0, 2, 1, 0, 0, 1, 0, 1, 2, 1, 0, 1, 0, 2, 0, 2, 0, 0, 2, 2, 0, 0, 1, 2, 1, 0, 1, 0, 2, 1, 0, 2, 2, 2, 2, 2, 2, 0, 0, 1, 2, 2, 2, 2, 0, 1, 0, 2, 1, 2, 2, 2, 0, 2, 2, 2, 1, 1, 2, 2, 1, 0, 0, 1, 1, 2, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 2, 0, 2, 2, 1, 2, 2, 2, 0, 0, 2, 1, 1, 2, 1, 2, 2, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 2, 0, 2, 2, 1, 0, 0, 1, 0, 2, 2, 1, 0, 2, 2, 0, 1, 0, 2, 1, 0, 0, 2, 0, 0, 2, 1, 2, 2, 2, 0, 0, 1, 0, 0, 2, 0, 2, 1, 2, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 2, 0, 1, 0, 2, 1, 2, 0, 2, 1, 0, 2, 0, 1, 1, 0, 1, 1, 2, 2, 0, 0, 2, 1, 0, 2, 0, 2, 1, 2, 2, 1, 2, 1, 2, 1, 2, 2, 2, 0, 2, 1, 2, 2, 1, 0, 2, 0, 0, 1, 0, 2, 0, 1, 1, 1, 2, 2, 2, 2, 2, 0, 1, 1, 1, 1, 2, 1, 0, 0, 2, 2, 1, 2, 2, 2, 0, 1, 2, 1, 1, 1, 2, 2, 0, 1, 1, 2, 2, 0, 0, 0, 0, 0, 2, 1, 0, 1, 0, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 1, 0, 0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 1, 2, 0, 0, 1, 2, 2, 1, 2, 2, 2, 2, 0, 0, 0, 2, 0, 0, 2, 0, 2, 1, 1, 1, 0, 0, 0, 2, 1, 0, 2, 1, 0, 2, 0, 2, 2, 0, 0, 0, 0, 2, 1, 1, 1, 0, 1, 2, 2, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 2, 1, 2, 1, 1, 2, 2, 2, 2, 2, 2, 1, 0, 2, 2, 2, 1, 2, 1, 2, 1, 0, 2, 1, 0, 1, 1, 1, 1, 0, 0, 2, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 2, 0, 0, 2, 0, 1, 1, 0, 1, 1, 1, 2, 1, 0, 0, 1, 2, 0, 1, 1, 0, 2, 1, 1, 2, 1, 0, 1, 2, 0, 1, 1, 0, 1, 1, 0, 2, 2, 1, 0, 1, 1, 0, 0, 0, 2, 2, 2, 1, 0, 2, 0, 1, 0, 2, 2, 1, 2, 0, 0, 1, 2, 1, 0, 1, 0, 1, 2, 2, 2, 2, 1, 2, 1, 0, 2, 1, 2, 2, 2, 2, 2, 0, 2, 2, 0, 1, 1, 2, 2, 2, 0, 2, 2, 2, 0, 0, 2, 1, 1, 1, 0, 0, 1, 0, 0, 2, 1, 1, 1, 0, 1, 0, 0, 0, 2, 0, 0, 1, 1, 1, 2, 0, 1, 1, 0, 1, 2, 0, 1, 2, 0, 2, 2, 2, 1, 0, 2, 2, 2, 1, 0, 0, 2, 2, 2, 0, 2, 0, 2, 1, 1, 0, 1, 0, 0, 1, 2, 1, 1, 2, 1, 1, 0, 2, 0, 0, 1, 1, 0, 2, 1, 2, 1, 1, 1, 2, 0, 2, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 0, 1, 0, 0, 2, 2, 1, 2, 0, 0, 2, 1, 2, 1, 2, 2, 0, 1, 1, 0, 1, 1, 2, 0, 0, 1, 2, 0, 0, 0, 2, 0, 2, 2, 0, 0, 2, 1, 2, 2, 2, 0, 0, 1, 1, 2, 2, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 2, 2, 1, 0, 1, 1, 1, 1, 2, 0, 0, 1, 0, 2, 1, 0, 2, 1, 1, 0, 1, 1, 0, 1, 2, 2, 0, 0, 1, 1, 2, 0, 2, 1, 0, 2, 2, 0, 2, 1, 0, 0, 1, 0, 0, 1, 0, 2, 0, 2, 0, 0, 1, 0, 0, 1, 2, 0, 1, 1, 1, 2, 0, 0, 0, 0, 2, 2, 2, 0, 1, 0, 1, 1, 0, 0, 2, 2, 0, 2, 0, 1, 2, 1, 1, 1, 0, 1, 0, 2, 0, 1, 2, 0, 2, 2, 0, 1, 1, 1, 2, 1, 1, 0, 1, 2, 2, 0, 1, 0, 1, 0, 1, 2, 1, 1, 0, 0, 2, 1, 2, 2, 2, 0, 1, 2, 0, 2, 1, 1, 0, 2, 1, 2, 1, 2, 0, 2, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2, 0, 1, 0, 0, 0, 1, 0, 2, 2, 1, 0, 1, 1, 0, 2, 2, 1, 0, 2, 2, 1, 1, 0, 0, 0, 1, 2, 2, 1, 2, 0, 2, 0, 1, 0, 2, 2, 0, 0, 2, 0, 1, 2, 2, 1, 1, 2, 2, 1, 1, 1, 2, 0, 0, 0, 0, 2, 0, 0, 1, 1, 2, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 2, 0, 0, 1, 1, 2, 2, 2, 0, 0, 1, 0, 0, 2, 1, 2, 1, 2, 0, 1, 2, 2, 0, 2, 1, 1, 0, 0, 0, 2, 0, 2, 0, 1, 2, 0, 1, 2, 1, 0, 1, 1, 0, 0, 0, 1, 2, 1, 0, 2, 0, 2, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 2, 1, 0, 2, 1, 1, 0, 1, 1, 2, 1, 1, 1, 0, 2, 2, 2, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 0, 2, 2, 1, 0, 2, 2, 2, 2, 2, 0, 1, 0, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 2, 1, 0, 0, 2, 2, 0, 0, 1, 1, 2, 1, 1, 0, 0, 0, 2, 0, 2, 2, 1, 0, 2, 0, 0, 1, 2, 1, 2, 2, 1, 2, 0, 0, 2, 0, 0, 0, 2, 2, 1, 0, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 0, 2, 0, 0, 0, 0, 1, 0, 0, 1, 2, 1, 2, 2, 2, 0, 2, 2, 0, 1, 2, 0, 1, 0, 2, 0, 2, 1, 1, 1, 0, 2, 1, 2, 1, 2, 0, 1, 0, 2, 2, 2, 0, 1, 1, 1, 2, 2, 2, 0, 1, 0, 2, 2, 2, 2, 0, 0, 0, 2, 1, 2, 2, 1, 2, 0, 1, 1, 1, 0, 0, 1, 1, 1, 2, 1, 1, 2, 2, 2, 0, 0, 0, 2, 2, 1, 1, 0, 2, 1, 2, 1, 1, 2, 1, 1, 2, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 0, 0, 2, 1, 2, 0, 2, 2, 1, 1, 1, 2, 2, 0, 1, 2, 0, 0, 0, 0, 0, 2, 0, 2, 2, 1, 2, 0, 2, 1, 0, 1, 2, 2, 2, 0, 2, 2, 2, 2, 1, 2, 1, 2, 2, 0, 0, 2, 2, 0, 1, 2, 0, 2, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 2, 2, 2, 0, 1, 1, 0, 0, 1, 0, 2, 2, 0, 1, 2, 1, 0, 2, 2, 0, 1, 0, 2, 2, 1, 1, 0, 2, 1, 1, 2, 2, 1, 2, 2, 1, 0, 1, 2, 0, 1, 1, 1, 0, 2, 0, 0, 2, 2, 0, 2, 1, 0, 2, 0, 1, 0, 0, 1, 0, 1, 0, 2, 2, 1, 1, 0, 1, 0, 1, 0, 1, 2, 2, 2, 2, 1, 2, 1, 0, 0, 2, 1, 0, 0, 0, 1, 2, 2, 0, 1, 1, 2, 2, 0, 1, 0, 0, 1, 0, 1, 1, 1, 2, 0, 2, 0, 0, 1, 1, 1, 0, 1, 1, 2, 2, 2, 1, 0, 0, 2, 2, 0, 2, 2, 1, 2, 0, 0, 2, 2, 0, 0, 2, 2, 0, 0, 1, 0, 2, 1, 0, 1, 1, 0, 2, 0, 0, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 0, 0, 1, 2, 1, 1, 0, 0, 0, 2, 2, 2, 1, 2, 1, 0, 1, 1, 1, 0, 1, 0, 0, 2, 0, 0, 1, 0, 2, 2, 2, 2, 2, 1, 1, 0, 0, 0, 1, 1, 0, 2, 1, 1, 1, 2, 1, 0, 0, 1, 0, 2, 2, 2, 0, 1, 1, 0, 1, 1, 2, 0, 1, 2, 1, 0, 2, 1, 0, 0, 2, 1, 0, 2, 1, 2, 2, 1, 2, 0, 2, 2, 0, 0, 1, 0, 2, 2, 1, 2, 1, 2, 2, 1, 1, 0, 0, 2, 2, 1, 1, 2, 2, 1, 2, 0, 0, 0, 2, 2, 2, 0, 1, 0, 2, 1, 2, 2, 2, 2, 2, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 2, 1, 2, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 2, 0, 0, 1, 1, 2, 0, 2, 1, 0, 0, 2, 0, 1, 2, 0, 0, 0, 1, 1, 0, 2, 0, 2, 0, 2, 0, 0, 1, 1, 0, 0, 0, 2, 0, 2, 1, 0, 1, 0, 1, 0, 1, 2, 1, 1, 0, 0, 1, 2, 1, 0, 2, 0, 1, 1, 1, 2, 2, 2, 2, 0, 1, 0, 0, 1, 2, 2, 2, 2, 1, 0, 0, 0, 2, 2, 1, 1, 1, 2, 0, 1, 0, 0, 1, 1, 1, 1, 1, 2, 0, 2, 1, 1, 2, 2, 1, 1, 2, 2, 2, 0, 2, 2, 2, 1, 1, 2, 1, 1, 0, 1, 2, 0, 1, 2, 0, 2, 0, 2, 2, 0, 2, 1, 0, 2, 0, 1, 1, 0, 2, 1, 1, 2, 0, 1, 1, 1, 2, 1, 2, 1, 2, 2, 1, 1, 0, 0, 2, 2, 1, 2, 0, 1, 1, 2, 1, 1, 1, 1, 0, 1, 0, 2, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 2, 1, 2, 2, 1, 1, 2, 1, 0, 1, 2, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 2, 0, 2, 1, 1, 0, 2, 2, 2, 0, 2, 1, 2, 2, 1, 1, 1, 1, 1, 0, 0, 0, 1, 2, 2, 2, 0, 0, 0, 0, 2, 1, 0, 1, 0, 2, 1, 0, 1, 0, 1, 2, 0, 1, 0, 2, 1, 1, 1, 0, 2, 1, 2, 0, 1, 1, 1, 0, 0, 0, 0, 2, 0, 0, 2, 0, 2, 1, 0, 1, 0, 0, 0, 1, 1, 0, 2, 1, 2, 1, 2, 2, 0, 1, 2, 0, 2, 1, 1, 0, 1, 1, 1, 2, 0, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 1, 1, 0, 1, 1, 2, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 2, 2, 0, 2, 2, 0, 1, 1, 2, 1, 2, 0, 2, 1, 0, 2, 1, 1, 1, 2, 0, 0, 2, 1, 2, 2, 2, 2, 2, 1, 0, 2, 2, 0, 1, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 0, 0, 2, 2, 0, 1, 1, 0, 2, 2, 1, 2, 1, 1, 0, 2, 2, 0, 1, 2, 1, 2, 1, 0, 1, 1, 0, 0, 2, 2, 2, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 1, 1, 0, 2, 0, 0, 2, 0, 2, 0, 0, 0, 2, 1, 2, 2, 1, 0, 2, 2, 1, 2, 2, 0, 2, 0, 1, 0, 0, 1, 2, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 2, 2, 2, 1, 0, 2, 2, 2, 0, 2, 1, 2, 1, 2, 0, 1, 1, 0, 0, 0, 2, 2, 1, 1, 1, 2, 0, 2, 1, 1, 1, 0, 0, 1, 2, 2, 0, 0, 0, 1, 1, 2, 1, 2, 0, 2, 1, 2, 2};
        int k = 25000000;
        System.out.println(System.currentTimeMillis());
        int n = leet.smallestDistancePair(nums, k);
        System.out.println(n);
        System.out.println(System.currentTimeMillis());
    }
}