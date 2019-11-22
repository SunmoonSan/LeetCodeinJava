package com.maple.leetcode.codeA00;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode1002 {
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        Map<Character, Integer> kvs1 = new HashMap<>();
        for (int i = 0; i < A[0].length(); i++) {
            if (kvs1.containsKey(A[0].charAt(i))) {
                kvs1.put(A[0].charAt(i), kvs1.get(A[0].charAt(i)) + 1);
            } else {
                kvs1.put(A[0].charAt(i), 1);
            }
        }

        int i = 1;
        while (i < A.length) {
            Map<Character, Integer> kvs2 = new HashMap<>();
            String s = A[i];
            for (int j = 0; j < s.length(); j++) {
                if (kvs2.containsKey(s.charAt(j))) {
                    kvs2.put(s.charAt(j), kvs2.get(s.charAt(j)) + 1);
                } else {
                    kvs2.put(s.charAt(j), 1);
                }
            }

            Map<Character, Integer> kvs3 = new HashMap<>();
            for (Character ch : kvs2.keySet()) {
                if (kvs1.containsKey(ch)) {
                    if (kvs1.get(ch) - kvs2.get(ch) > 0) {
                        kvs3.put(ch, kvs2.get(ch));
                    } else {
                        kvs3.put(ch, kvs1.get(ch));
                    }
                }
            }

            kvs1 = kvs3;

            i++;
        }

        for (Character ch : kvs1.keySet()) {
            for (int t=0;t<kvs1.get(ch);t++) {
                list.add(ch.toString());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        LeetCode1002 leet = new LeetCode1002();
//        String[] s1 = {"acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd", "ccccddda", "cababaab", "addcaccd"};
        String[] s1 = {"bella", "label", "roller"};
        leet.commonChars(s1);
    }
}
