package com.maple.leetcode.code000;

public class LeetCode014 {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder res = new StringBuilder();
        int i=0;
        int j=0;
        while (i<strs.length) {
             while (strs[i].charAt(j)!=strs[i+1].charAt(j)) {
                 break;
             }

             if (i==strs.length-1) {
                 res.insert(res.length(),strs[0].charAt(j));
                 j++;
             }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        LeetCode014 leet = new LeetCode014();
        String[] strings = {"flower","flow","flight"};
        String s = leet.longestCommonPrefix(strings);
        System.out.println(s);
    }
}
