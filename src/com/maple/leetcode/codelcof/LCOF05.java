package com.maple.leetcode.codelcof;
/*
 * @desc : Created by San on 2020-04-10 09:33
 */

public class LCOF05 {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res.append("%20");
            } else {
                res.append(s.charAt(i));
            }
        }

        return res.toString();
    }
}
