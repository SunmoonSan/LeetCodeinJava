package com.maple.leetcode.code600;

import java.util.*;

public class LeetCode668 {
    public int findKthNumber(int m, int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                list.add(i * j);
            }
        }

        System.out.println(list);

//        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//
//        for (int i : list) {
//            queue.add(i);
//            if (queue.size() > k) {
//                queue.remove();
//            }
//            System.out.println(queue);
//        }
//
//        System.out.println(queue);
//        return queue.remove();
        return 0;
    }

    public static void main(String[] args) {
        LeetCode668 leet = new LeetCode668();
        leet.findKthNumber(9895, 28405, 100787757);
    }
}
