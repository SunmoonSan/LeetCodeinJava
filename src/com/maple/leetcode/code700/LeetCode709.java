package com.maple.leetcode.code700;


public class LeetCode709 {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
            res.append(chars[i]);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        LeetCode709 leet = new LeetCode709();
        String str = "LOVELY";
        String s = leet.toLowerCase(str);
        System.out.println(s);
    }
}
