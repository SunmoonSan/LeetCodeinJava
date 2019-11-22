package com.maple.leetcode.code100;

import java.util.ArrayList;
import java.util.List;

public class LeetCode151 {
    public String reverseWords(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder res = new StringBuilder();
            int j = i;
            while (j < s.length() && s.charAt(j) != ' ') {
                res.append(s.charAt(j));
                j++;
            }
            if (res.length() > 0) {
                list.add(res.toString());
            }
            i = j;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            builder.append(list.get(i));
            if (i > 0) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        LeetCode151 leet = new LeetCode151();
        String s = "  hello world!  ";
        String t = leet.reverseWords(s);
        System.out.println(t);
    }
}
