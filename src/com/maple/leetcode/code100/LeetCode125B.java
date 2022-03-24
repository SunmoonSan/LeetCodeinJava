package com.maple.leetcode.code100;

import java.util.Locale;

/**
 * @author San
 * @time 2022/3/24 22:39:13
 * @desc
 */
public class LeetCode125B {
    public static void main(String[] args) {
        LeetCode125B leet = new LeetCode125B();
//        String s= "A man, a plan, a canal: Panama";
//        String s = "race a car";
        String s = "0P";
        boolean b = leet.isPalindrome(s);
        System.out.println(b);
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && (!Character.isLetterOrDigit(s.charAt(l)))) {
                l++;
            }
            while (r > l && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }
}
