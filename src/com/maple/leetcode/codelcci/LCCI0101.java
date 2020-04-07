package com.maple.leetcode.codelcci;
/*
 * @desc : Created by San on 2020-04-07 10:04
 */

import java.util.HashSet;
import java.util.Set;

public class LCCI0101 {
    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        for (char c : astr.toCharArray()) {
            if (set.contains(c)) {
                return false;
            } else {
                set.add(c);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LCCI0101 lcci = new LCCI0101();
        String s = "abc";
        boolean b = lcci.isUnique(s);
        System.out.println(b);
    }
}
