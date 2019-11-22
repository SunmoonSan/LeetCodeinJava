package com.maple.leetcode.code100;

import java.util.*;

public class LeetCode139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict.isEmpty()) {
            return false;
        }
        Set<String> set = new HashSet<>(wordDict);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            builder.append(s.charAt(i));
            String word = builder.toString();
            if (set.contains(word)) {
                int j=0;
                while (j<s.length()) {

                }
            }
        }

        return true;
    }

    private boolean wordBreak(String s, int i, Set<String> set) {

        if (i == s.length()) {
            return true;
        }

        boolean isBroken = false;
        StringBuilder builder = new StringBuilder();
        for (; i < s.length(); i++) {
            String word = builder.append(s.charAt(i)).toString();
            if (set.contains(word)) {
                isBroken = wordBreak(s, i + 1, set);
            }
        }

        return isBroken;
    }


    public static void main(String[] args) {
        LeetCode139 leet = new LeetCode139();
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code", "sand", "and", "cat");
        boolean b = leet.wordBreak(s, wordDict);
    }
}
