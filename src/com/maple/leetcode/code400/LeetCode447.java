package com.maple.leetcode.code400;
/*
给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。

示例:
输入:
[[0,0],[1,0],[2,0]]
输出:
2

解释:
两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
 */

import java.util.HashMap;
import java.util.Map;

public class LeetCode447 {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Double, Integer> kvs = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    double dis = getDistance(points[i], points[j]);
                    if (kvs.containsKey(dis)) {
                        kvs.put(dis, kvs.get(dis) + 1);
                    } else {
                        kvs.put(dis, 1);
                    }
                }
            }

            for (double k : kvs.keySet()) {
                int t = kvs.get(k);
                count += t * (t - 1);
            }
        }

        return count;
    }

    private double getDistance(int[] point1, int[] point2) {
        return Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2);
    }

    public static void main(String[] args) {
        LeetCode447 leet = new LeetCode447();
        int[][] points = {
                {0, 0},
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };
        int count = leet.numberOfBoomerangs(points);
        System.out.println(count);
    }
}
