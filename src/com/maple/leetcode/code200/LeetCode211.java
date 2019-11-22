package com.maple.leetcode.code200;
/*
 * @desc : Created by San on 2019-05-04 10:03
 */

import java.util.*;

public class LeetCode211 {
    public static void main(String[] args) {
        /*
        [
        "addWord": "at"
        "addWord": "and"
        "addWord": "an"
        "addWord": "add"
        "search": "a"
        "search": ".at"
        "addWord": "bat"
        "search": ".at"
        "search": "an."
        "search": "a.d."
        "search": "b."
        "search": "a.d"
        "search": "."
        ]
        [false,false,true,true,false,false,true,false]
         */
        WordDictionary wd = new WordDictionary();
        wd.addWord("at");
        wd.addWord("and");
        wd.addWord("an");
        wd.addWord("add");
        System.out.println(wd);
//        System.out.println("a:" + wd.search("a"));
//        System.out.println(".at:" + wd.search(".at"));

        wd.addWord("bat");
        System.out.println(wd);

//        System.out.println(".at:" + wd.search(".at"));
//        System.out.println("an.:" + wd.search("an."));
//        System.out.println("a.b.:" + wd.search("a.b."));
        System.out.println("b.:" + wd.search("b."));
        System.out.println("a.d:" + wd.search("a.d"));
        System.out.println(".:" + wd.search("."));
    }
}

class WordDictionary {

    private Map<Integer, Set<Character>> indexCharsMap;
    private Map<String, Integer> wordLenMap;
    private int minLen;

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
        indexCharsMap = new HashMap<>();
        wordLenMap = new HashMap<>();
        minLen = Integer.MAX_VALUE;
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        wordLenMap.put(word, word.length());
        minLen = Math.min(minLen, word.length());
        char[] cs = word.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (indexCharsMap.containsKey(i)) {
                Set<Character> charSet = indexCharsMap.get(i);
                charSet.add(cs[i]);
                indexCharsMap.put(i, charSet);
            } else {
                Set<Character> charSet = new HashSet<>();
                charSet.add(cs[i]);
                indexCharsMap.put(i, charSet);
            }
        }
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        if (word.contains(".")) {
            if (word.length() < minLen) {
                return false;
            }

            char[] cs = word.toCharArray();
            if (!indexCharsMap.containsKey(cs.length - 1)) {
                return false;
            }

            for (int i = 0; i < cs.length; i++) {
                if (cs[i] == '.' && indexCharsMap.get(i).size() > 0) {
                    continue;
                }

                if (!indexCharsMap.get(i).contains(cs[i])) {
                    return false;
                }
            }
        } else {
            return wordLenMap.containsKey(word);
        }

        return true;
    }

    @Override
    public String toString() {
//        System.out.println(set);
//        System.out.println(kvs);
        return "";
    }
}
