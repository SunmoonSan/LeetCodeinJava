package com.maple.leetcode.code800;

import java.util.*;

public class LeetCode884 {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> kvs = new HashMap<>();

        StringBuilder builder;
        for (int i = 0; i < A.length(); i++) {
            int j = i;
            builder = new StringBuilder();
            while (j < A.length() && A.charAt(j) != ' ') {
                builder.append(A.charAt(j));
                j++;
            }
            if (kvs.containsKey(builder.toString())) {
                kvs.put(builder.toString(), kvs.get(builder.toString()) + 1);
            } else {
                kvs.put(builder.toString(), 1);
            }

            i = j;
        }

        for (int i = 0; i < B.length(); i++) {
            int j = i;
            builder = new StringBuilder();
            while (j < B.length() && B.charAt(j) != ' ') {
                builder.append(B.charAt(j));
                j++;
            }
            if (kvs.containsKey(builder.toString())) {
                kvs.put(builder.toString(), kvs.get(builder.toString()) + 1);
            } else {
                kvs.put(builder.toString(), 1);
            }
            i = j;
        }

        List<String> list = new ArrayList<>();
        List<String> keyList = new ArrayList<>(kvs.keySet());
        for (String s : keyList) {
            if (kvs.get(s) == 1) {
                list.add(s);
            }
        }

        String[] arr = new String[list.size()];
        for (int i=0;i<arr.length;i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        LeetCode884 leet = new LeetCode884();
        String A = "s z z z s";
        String B = "s z ejt";
        leet.uncommonFromSentences(A, B);
    }
}
