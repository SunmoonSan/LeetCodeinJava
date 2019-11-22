package com.maple.leetcode.code100;
/*
 * @desc : Created by San on 2019-05-04 22:31
 */

import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;

public class LeetCode168 {
    public String convertToTitle(int n) {
        Map<Integer, Character> kvs = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            kvs.put(i + 1, (char) ('A' + i));
        }

        System.out.println(kvs);

        if (n > 26) {
            char L = ' ';
            char R = ' ';
            if (n % 26 == 0) {
                L = kvs.get((n - 26) / 26);
                R = 'Z';
            } else {
                L = kvs.get(n / 26);
                R = kvs.get(n % 26);
            }
            return L + String.valueOf(R);
        } else {
            return String.valueOf(kvs.get(n));
        }
    }

    public static void main(String[] args) {
        LeetCode168 leet = new LeetCode168();
        System.out.println(Math.sqrt(703));
        String s = leet.convertToTitle(703);
        System.out.println(s);
    }
}
