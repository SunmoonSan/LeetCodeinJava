package com.maple.leetcode.code200;

import java.util.HashMap;
import java.util.Map;

public class LeetCode242B {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> kvs = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (kvs.containsKey(c)) {
                kvs.put(c, kvs.get(c) + 1);
            } else {
                kvs.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (kvs.containsKey(c) && kvs.get(c) > 0) {
                kvs.put(c, kvs.get(c) - 1);
            } else {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        LeetCode242B leet = new LeetCode242B();
        String s = "anagram";
        String t = "nagaram";
        boolean b = leet.isAnagram(s, t);
        System.out.println(b);
    }
}
