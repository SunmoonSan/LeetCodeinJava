package com.maple.leetcode.code400;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode414 {
    public int thirdMax(int[] nums) {
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int n : nums) {
            queue.add(n);
        }

        if (queue.size() < 3) {
            return queue.remove();
        }

        queue.remove();
        queue.remove();
        return queue.remove();
    }

    public static void main(String[] args) {
        LeetCode414 leet = new LeetCode414();
        int[] nums = {2, 1};
        int n = leet.thirdMax(nums);
        System.out.println(n);
    }
}
