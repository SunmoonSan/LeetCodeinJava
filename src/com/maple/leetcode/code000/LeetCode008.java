package com.maple.leetcode.code000;

import java.util.ArrayList;
import java.util.List;

public class LeetCode008 {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        }
        boolean isMinus = false;
        List<Character> characterList = new ArrayList<>();
        if (str.charAt(0) == '-') {
            isMinus = true;
        } else if (str.charAt(0) > '9' || str.charAt(0) < '0') {
            return 0;
        }
        int i = 0;
        if (isMinus) {
            i = 1;
        }

        for (; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                break;
            } else {
                characterList.add(str.charAt(i));
            }
        }
        int sum = 0;
        for (i = characterList.size() - 1; i >= 0; i--) {
            int c = characterList.get(i) - '0';
            double n = Math.pow(10, characterList.size() - 1 - i) * c;
            sum += n;
        }

        if (isMinus) {
            sum = 0 - sum;
        }

        return sum;
    }

    public static void main(String[] args) {
        LeetCode008 leet = new LeetCode008();
        int n = leet.myAtoi("42");
        System.out.println(n);
    }
}
