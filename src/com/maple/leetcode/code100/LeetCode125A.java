package com.maple.leetcode.code100;

public class LeetCode125A {
    public boolean isPalindrome(String s) {
        char[] cs = s.toLowerCase().toCharArray();
        int left = 0;
        int right = cs.length - 1;
        while (left < right) {
            if ((!Character.isLetter(cs[left])) && (!Character.isDigit(cs[left]))) {
                left++;
            } else if ((!Character.isLetter(cs[right])) && (!Character.isDigit(cs[right]))) {
                right--;
            } else if (cs[left] == cs[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LeetCode125A leet = new LeetCode125A();
//        String s = ".,";
//        String s = "A man, a plan, a canal: Panama";
        String s = ".,.,...";
//        String s = "0P";
        boolean b = leet.isPalindrome(s);
        System.out.println(b);

    }
}
