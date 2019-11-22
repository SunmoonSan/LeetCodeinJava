package com.maple.leetcode.code000;

import java.util.*;

public class LeetCode017 {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.isEmpty()) {
            return list;
        }
        Map<Character, String> kvs = new HashMap<>();
        kvs.put('2', "abc");
        kvs.put('3', "def");
        kvs.put('4', "ghi");
        kvs.put('5', "jkl");
        kvs.put('6', "mno");
        kvs.put('7', "pqrs");
        kvs.put('8', "tuv");
        kvs.put('9', "wxyz");

        letterCombinations(list, digits, 0, "", kvs);

        return list;
    }

    private void letterCombinations(List<String> list, String digits, int index, String res, Map<Character, String> kvs) {

        if (index == digits.length()) {
            list.add(res);
//            System.out.println(res);
            return;
        }

        char letter = digits.charAt(index);

        for (char c : kvs.get(letter).toCharArray()) {
            letterCombinations(list, digits, index + 1, res + c, kvs);
        }
    }

    public static void main(String[] args) {
        LeetCode017 leet = new LeetCode017();
        leet.letterCombinations("23");
    }
}
