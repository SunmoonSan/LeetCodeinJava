package com.maple.leetcode.code400;

public class LeetCode400 {
    public int findNthDigit(int n) {
        int lastCount = 0;
        int count = 0;
        int index = 1;
        while (true) {
            lastCount = count;
            count += computeCount(index);
            if (count >= n) {
                char[] cs = String.valueOf(index).toCharArray();
                for (int i = 0; i < cs.length; i++) {
                    lastCount++;
                    if (lastCount == n) {
                        return cs[i] - '0';
                    }
                }
                break;
            }

            index++;
        }

        return -1;
    }


    private int computeCount(int index) {
        if (index>=1000000) {
            return 7;
        } else if (index>=100000) {
            return 6;
        } else if (index>=10000) {
            return 5;
        } else if (index>=1000) {
            return 4;
        } else if (index>=100) {
            return 3;
        } else if (index>=10) {
            return 2;
        } else {
            return 1;
        }
    }


    public static void main(String[] args) {
        LeetCode400 leet = new LeetCode400();
        int s = leet.findNthDigit(10000000);
        System.out.println(s);

    }
}
