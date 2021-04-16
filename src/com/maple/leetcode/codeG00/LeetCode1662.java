package com.maple.leetcode.codeG00;

public class LeetCode1662 {
    public static void main(String[] args) {
        LeetCode1662 leet = new LeetCode1662();
        String[] arr1 = {"ac", "b"};
        String[] arr2 = {"a", "bc"};
        boolean b = leet.arrayStringsAreEqual(arr1, arr2);
        System.out.println(b);
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        for (String c : word1) {
            res1.append(c);
        }
        for (String c : word2) {
            res2.append(c);
        }

        return res1.toString().equals(res2.toString());
    }
}
