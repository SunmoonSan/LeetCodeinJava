package com.maple.leetcode.codeD00;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1309 {
    public static void main(String[] args) {
        LeetCode1309 leet = new LeetCode1309();
        String s = "25#";
        String r = leet.freqAlphabets(s);
        System.out.println(r);
    }

    public String freqAlphabets(String s) {
        Map<String, Character> kvs = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            if (i < 9) {
                kvs.put((i + 1) + "", (char) ('a' + i));
            } else {
                kvs.put((i + 1) + "#", (char) ('a' + i));
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '#') {
                String k = "" + s.charAt(i - 2) + s.charAt(i - 1) + s.charAt(i);
                res.append(kvs.get(k));
                i = i - 2;
            } else {
                res.append(kvs.get(c + ""));
            }
        }
        return res.reverse().toString();
    }
}
