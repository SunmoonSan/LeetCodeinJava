package com.maple.leetcode.code800;

import java.util.ArrayList;
import java.util.List;

public class LeetCode824 {
    public String toGoatLatin(String S) {

        List<String> list = new ArrayList<>();

        StringBuilder builder;
        int index = 0;
        for (int i = 0; i < S.length(); i++) {
            int j = i;
            builder = new StringBuilder();
            while (j < S.length() && S.charAt(j) != ' ') {
                builder.append(S.charAt(j++));
            }

            index++;
            char ch = builder.toString().charAt(0);
            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
                builder.append("ma");
                int k = 0;
                while (k < index) {
                    builder.append("a");
                    k++;
                }
            } else {
                builder.replace(0, 1, "").append(ch).append("ma");
                int k = 0;
                while (k < index) {
                    builder.append("a");
                    k++;
                }
            }
            list.add(builder.toString());
            i = j;
            System.out.println(list);
        }

        System.out.println(list);
        builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i));
            if (i < list.size() - 1) {
                builder.append(" ");
            }

        }
        return builder.toString();
    }

    public static void main(String[] args) {
        LeetCode824 leet = new LeetCode824();
        String S = "I speak Goat Latin";
        leet.toGoatLatin(S);
    }
}
