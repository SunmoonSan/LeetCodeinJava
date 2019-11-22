package com.maple.leetcode.code700;

public class LeetCode744 {
    public char nextGreatestLetter(char[] letters, char target) {
        char minCh = 'z';
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                if (letters[i] < minCh) {
                    minCh = letters[i];
                }
            }
        }

        return minCh;
    }

    public static void main(String[] args) {
        LeetCode744 leet = new LeetCode744();
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';
        char ch = leet.nextGreatestLetter(letters, target);
        System.out.println(ch);
    }
}
