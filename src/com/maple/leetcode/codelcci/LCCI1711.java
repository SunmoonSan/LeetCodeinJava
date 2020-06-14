package com.maple.leetcode.codelcci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LCCI1711 {
    public static void main(String[] args) {
        LCCI1711 lcci = new LCCI1711();
        String[] words = {"I", "am", "a", "student", "from", "a", "university", "in", "a", "city"};
        String word1 = "a";
        String word2 = "student";

        lcci.findClosest(words, word1, word2);
    }

    public int findClosest(String[] words, String word1, String word2) {
        Map<String, List<Integer>> kvs = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (kvs.containsKey(word)) {
                List<Integer> indexes = kvs.get(word);
                indexes.add(i);
                kvs.put(words[i], indexes);
            } else {
                List<Integer> indexes = new ArrayList<>();
                indexes.add(i);
                kvs.put(word, indexes);
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i : kvs.get(word1)) {
            for (int j : kvs.get(word2)) {
                int d = Math.abs(i - j);
                if (d < min) {
                    min = d;
                }
            }
        }
        return min;
    }
}
