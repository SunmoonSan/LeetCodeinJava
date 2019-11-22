package com.maple.leetcode.code100;

import java.util.*;

public class LeetCode149 {

    public int maxPoints(int[][] points) {
        if (points.length <= 2) {
            return points.length;
        }

        Map<Double, Set<int[]>> kvs = new HashMap<>();
        Map<Integer, Set<int[]>> vMap = new HashMap<>();
        int max = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int pix = points[i][0];
                int pjx = points[j][1];
                if (pix == pjx) {
                    if (vMap.containsKey(pix)) {
                        vMap.get(pix).add(points[i]);
                        vMap.get(pix).add(points[j]);
                        vMap.put(pix, vMap.get(pix));
                    } else {
                        Set<int[]> set = new HashSet<>();
                        vMap.put(pix, set);
                    }
                    if (vMap.get(pix).size() > max) {
                        max = vMap.get(pix).size();
                    }
                    continue;
                }

                double k = (points[j][1] - points[i][1]) * 1.0 / (points[j][0] - points[i][0]);
                if (k == 0) {
                    k = 0;
                }
                if (kvs.containsKey(k)) {
                    kvs.get(k).add(points[i]);
                    kvs.get(k).add(points[j]);
                } else {
                    Set<int[]> set = new HashSet<>();
                    set.add(points[i]);
                    set.add(points[j]);
                    kvs.put(k, set);
                }
                if (kvs.get(k).size() > max) {
                    System.out.println(k);
                    max = kvs.get(k).size();
                }
            }
        }

        System.out.println(kvs);
        return max;
    }


    public static void main(String[] args) {
        LeetCode149 leet = new LeetCode149();
        int[][] points = {
                {0, -12},
                {5, 2},
                {2, 5},
                {0, -5},
                {1, 5},
                {2, -2},
                {5, -4},
                {3, 4},
                {-2, 4},
                {-1, 4},
                {0, -5},
                {0, -8},
                {-2, -1},
                {0, -11},
                {0, -9}
        };
        int count = leet.maxPoints(points);
        System.out.println(count);
    }
}
