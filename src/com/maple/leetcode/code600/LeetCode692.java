package com.maple.leetcode.code600;

import java.util.*;

public class LeetCode692 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        Queue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                int result = map.get(a) - map.get(b);
                if (result != 0) {
                    return -result;
                } else {
                    int index = 0;
                    while (index < Math.min(a.length(), b.length())) {
                        int r = a.charAt(index) - b.charAt(index);
                        if (r != 0) {
                            return r;
                        }
                        index++;
                    }
                    if (index == a.length()) {
                        return -1;
                    } else if (index == b.length()) {
                        return 1;
                    }
                    return 0;
                }
            }
        });

        queue.addAll(map.keySet());

        List<String> list = new ArrayList<>();
        int index = 0;
        while (index < k) {
            list.add(queue.remove());
            index++;
        }

        return list;
    }

    public static void main(String[] args) {
        LeetCode692 leet = new LeetCode692();
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        List<String> list = leet.topKFrequent(words, k);
        System.out.println(list);
    }
}
