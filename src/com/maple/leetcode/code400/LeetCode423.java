package com.maple.leetcode.code400;

import java.util.HashMap;
import java.util.Map;

public class LeetCode423 {
    public String originalDigits(String s) {
        Map<Character, Integer> kvs = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (kvs.containsKey(c)) {
                kvs.put(c, kvs.get(c) + 1);
            } else {
                kvs.put(c, 1);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        LeetCode423 leet = new LeetCode423();
        String s = "owoztneoer";
        leet.originalDigits(s);
    }
}
