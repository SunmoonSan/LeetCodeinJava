package com.maple.leetcode.codeB00;
/*
 * @desc : Created by San on 2019-08-20 14:14
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode1160 {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }


        for (String word : words) {
            Map<Character, Integer> kvs = new HashMap<>();
            for (char c : word.toCharArray()) {
                if (kvs.containsKey(c)) {
                    kvs.put(c, kvs.get(c)+1);
                } else {
                    kvs.put(c, 1);
                }
            }

            List<Character> keyList = new ArrayList<>(kvs.keySet());
            for (char c:keyList) {
//                if (map.containsKey(c) && map.get())
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        LeetCode1160 leet = new LeetCode1160();
        String[] words = {"hello", "world", "leetcode"};
        leet.countCharacters(words, "welldonehoneyr");
    }
}
