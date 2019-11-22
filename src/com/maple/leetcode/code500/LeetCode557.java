package com.maple.leetcode.code500;

public class LeetCode557 {
    public String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                for (int j = i - 1; j > index; j--) {
                    builder.append(s.charAt(j));
                }
                builder.append(' ');
                index = i;
            } else if (i == s.length() - 1) {
                for (int j = i; j > index; j--) {
                    builder.append(s.charAt(j));
                }
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        LeetCode557 leet = new LeetCode557();
        String s = "Let's take LeetCode contest";
        leet.reverseWords(s);
    }
}
