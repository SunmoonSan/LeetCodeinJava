package com.maple.leetcode.code700;

public class LeetCode771 {
    public int numJewelsInStones(String J, String S) {
        int count =0;
        for (int i=0;i<S.length();i++) {
            if (isJewel(J,S.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    /*
    判断字符串jewels中是否包含字符ch
     */
    public boolean isJewel(String jewels, char ch) {
        for (int i=0;i<jewels.length();i++) {
            if (jewels.charAt(i)==ch) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LeetCode771 leet = new LeetCode771();
        String J = "a";
        String S = "aAAbbbb";
        int count = leet.numJewelsInStones(J, S);
        System.out.println(count);
    }
}
