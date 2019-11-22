package com.maple.leetcode.code900;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode973 {
    public int[][] kClosest(int[][] points, int K) {
        Queue<Integer[]> queue = new PriorityQueue<>(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] a, Integer[] b) {
                int s1 = a[0] * a[0] + a[1] * a[1];
                int s2 = b[0] * b[0] + b[1] * b[1];
                return s2 - s1;
            }
        });

        for (int[] point : points) {
            queue.add(new Integer[]{point[0], point[1]});
            if (queue.size() > K) {
                queue.remove();
            }
        }

        int[][] closePoints = new int[queue.size()][2];
        int index = 0;
        while (!queue.isEmpty()) {
            Integer[] p = queue.remove();
            closePoints[index] = new int[]{p[0], p[1]};
            index++;
        }

        return closePoints;
    }

    public static void main(String[] args) {
        int[][] points = {
                {1, 3},
                {-2, 2},
                {1, 2}
        };
        LeetCode973 leet = new LeetCode973();
        int k = 1;
        leet.kClosest(points, k);
    }
}
