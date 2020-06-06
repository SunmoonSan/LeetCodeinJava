package com.maple.leetcode.codeE00;
/*
 * @desc : Created by San on 2020/6/6 22:56
 */

public class LeetCode1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        char[] cs = sentence.toCharArray();
        char[] prefixes = searchWord.toCharArray();
        int count = 0;
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == ' ') {
                count++;
            }
            boolean matched = true;
            for (int j = 0; j < prefixes.length; j++) {
                if (cs[i + j] != prefixes[j]) {
                    matched = false;
                    break;
                }
            }
            if (matched) {
                return count + 1;
            } else {
                while (i < cs.length) {
                    if (cs[i] == ' ') {
                        count++;
                        break;
                    }
                    i++;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LeetCode1455 leet = new LeetCode1455();
        String sentence = "i love eating burger";
        String searchWord = "burg";
        int n = leet.isPrefixOfWord(sentence, searchWord);
        System.out.println(n);
    }
}
