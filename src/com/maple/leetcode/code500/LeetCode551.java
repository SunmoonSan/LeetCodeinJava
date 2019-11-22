package com.maple.leetcode.code500;

public class LeetCode551 {
    public boolean checkRecord(String s) {
        int countA = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                countA++;
                if (countA > 1) {
                    return false;
                }
                continue;
            }

            if (i < s.length() - 2) {
                if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LeetCode551 leet = new LeetCode551();
        String s = "PPALLL";
        boolean b = leet.checkRecord(s);
        System.out.println(b);
    }
}
