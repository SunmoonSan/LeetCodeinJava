package com.maple.leetcode.code300;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode378 {
    public int kthSmallest(int[][] matrix, int k) {
        Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (pq.size() < k) {
                    pq.add(matrix[i][j]);
                } else {
                    pq.add(matrix[i][j]);
                    pq.remove();
                }
            }
        }

        return pq.remove();
    }

    public static void main(String[] args) {
        LeetCode378 leet = new LeetCode378();
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k = 8;
        int n = leet.kthSmallest(matrix, k);
        System.out.println(n);
    }
}
