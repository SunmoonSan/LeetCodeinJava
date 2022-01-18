package com.maple.leetcode.codeJ00;

import java.util.HashSet;
import java.util.Set;

/**
 * @author San
 * @time 2022/1/18 23:08:27
 * @desc
 */
public class LeetCode1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String[] cs = text.split(" ");
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < brokenLetters.length(); i++) {
            set.add(brokenLetters.charAt(i));
        }
        for (int i = 0; i < cs.length; i++) {
            boolean ok = true;
            for (int j = 0; j < cs[i].length(); j++) {
                if (set.contains(cs[i].charAt(j))) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                count++;
            }
        }
        return count;
    }
}
