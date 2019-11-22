package com.maple.leetcode.codeA00;
/*
 * @desc : Created by San on 2019-06-10 18:41
 */

import java.util.ArrayList;
import java.util.List;

public class LeetCode1078 {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> words = new ArrayList<>();
        int i = 0;
        while (i < text.length()) {
            StringBuilder res = new StringBuilder();
            int j = i;
            while (j < text.length() && text.charAt(j) != ' ') {
                res.append(text.charAt(j));
                j++;
            }
            words.add(res.toString());
            i = j + 1;
        }

        List<String> list = new ArrayList<>();
        for (int k = 0; k < words.size()-2; k++) {
            if (words.get(k).equals(first) && words.get(k+1).equals(second)) {
                list.add(words.get(k+2));
            }
        }

        String[] arr = new String[list.size()];
        for (int t = 0; t < list.size(); t++) {
            arr[t] = list.get(t);
        }

        return arr;
    }

    public static void main(String[] args) {
        LeetCode1078 leet = new LeetCode1078();
        String text = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";

        leet.findOcurrences(text, first, second);
    }
}
