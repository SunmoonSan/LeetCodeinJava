package com.maple.leetcode.codeH00;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1704 {
    public static void main(String[] args) {
        LeetCode1704 leet = new LeetCode1704();
        String s = "book";
        leet.halvesAreAlike(s);
    }

    public boolean halvesAreAlike(String s) {
        int countA = 0;
        int countB = 0;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                if (i < s.length() / 2) {
                    countA++;
                } else {
                    countB++;
                }
            }
        }
        return countA == countB;
    }
}
