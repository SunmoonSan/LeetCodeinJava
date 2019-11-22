package com.maple.leetcode.code600;

public class LeetCode680 {
    public boolean validPalindrome(String s) {

        char[] cs = s.toCharArray();
        boolean valid1 = true;
        boolean valid2 = true;
        int left = 0;
        int right = cs.length - 1;
        int count1 = 0;
        int count2 = 0;
        while (left < right) {
            if (cs[left] == cs[right]) {
                left++;
                right--;
            } else {
                if (cs[left + 1] == cs[right]) {
                    count1++;
                    left++;
                } else {
                    valid1 = false;
                    break;
                }
            }
            if (count1 > 1) {
                valid1 = false;
                break;
            }
        }

        left = 0;
        right = cs.length - 1;
        while (left < right) {
            if (cs[left] == cs[right]) {
                left++;
                right--;
            } else {
                if (cs[left] == cs[right - 1]) {
                    count2++;
                    right--;
                } else {
                    valid2 = false;
                    break;
                }
            }
            if (count2 > 1) {
                valid2 = false;
                break;
            }
        }

        return valid1 || valid2;
    }


    public static void main(String[] args) {
        LeetCode680 leet = new LeetCode680();
//        String s = "mgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgm";
        String s = "acjakebdccdeedccdbeaca";
        boolean b = leet.validPalindrome(s);
        System.out.println(b);
    }
}
