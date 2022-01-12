package com.maple.leetcode.code000;

public class LeetCode005 {
    public static void main(String[] args) {
        LeetCode005 leet = new LeetCode005();
        String s = "a";
        String min = leet.longestPalindrome(s);
        System.out.println(min);
    }

    public String longestPalindrome(String s) {
        char[] cs = s.toCharArray();
        int[] peer = new int[2];
        for (int i = 0; i < cs.length; i++) {

            // abbd
            int l = i;
            int r = i + 1;
            while (l >= 0 && r < cs.length && cs[l] == cs[r]) {
                if (r - l > peer[1] - peer[0]) {
                    peer[0] = l;
                    peer[1] = r;
                }
                l--;
                r++;
            }

            // babad
            l = i - 1;
            r = i + 1;
            while (l >= 0 && r < cs.length && cs[l] == cs[r]) {
                if (r - l > peer[1] - peer[0]) {
                    peer[0] = l;
                    peer[1] = r;
                }
                l--;
                r++;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = peer[0]; i <= peer[1]; i++) {
            res.append(cs[i]);
        }
        return res.toString();
    }
}
