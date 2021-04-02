package com.maple.leetcode.codeG00;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1684 {
    public static void main(String[] args) {
        LeetCode1684 leet = new LeetCode1684();
        String allowed = "abc";
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        leet.countConsistentStrings(allowed, words);
    }

    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))) {
                    break;
                }
                if (j == words[i].length() - 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
