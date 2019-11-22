package com.maple.leetcode.code700;

import java.util.ArrayList;
import java.util.List;

public class LeetCode784 {
    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        char[] cs = S.toCharArray();
        letterCasePermutation(list, cs, 0, "");
        return list;
    }

    private void letterCasePermutation(List<String> list, char[] cs, int index, String res) {
        if (index == cs.length) {
            list.add(res);
            return;
        }

        if (cs[index] >= '0' && cs[index] <= '9') {
            letterCasePermutation(list, cs, index + 1, res + cs[index]);
        } else if (cs[index] >= 'a' && cs[index] <= 'z') {
            letterCasePermutation(list, cs, index + 1, res + cs[index]);
            letterCasePermutation(list, cs, index + 1, res + Character.toUpperCase(cs[index]));
        } else if (cs[index] >= 'A' && cs[index] <= 'Z') {
            letterCasePermutation(list, cs, index + 1, res + cs[index]);
            letterCasePermutation(list, cs, index + 1, res + Character.toLowerCase(cs[index]));
        }
    }

    public static void main(String[] args) {
        LeetCode784 leet = new LeetCode784();
        String s = "3z4";
        leet.letterCasePermutation(s);
    }
}
