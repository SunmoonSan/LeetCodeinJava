package com.maple.leetcode.code800;

public class LeetCode868 {
    /*public int binaryGap(int N) {
        String num = toBinary(N);

        int manLen = 0;

        int index =0;
        for (int i=0;i<num.length();i++) {
            int len =0;
            if (num.charAt(i)=='1') {

                int j=i+1;
                while (num.charAt(j)!='1') {
                    len++;
                }
                if (len+1>manLen) {
                    manLen = len;
                }
            }
        }
    }*/

    public String toBinary(int n) {
        StringBuilder res = new StringBuilder();
        while (n>=2) {
            int r = n%2;
            n = (n-r)/2;
            res.append(r);
        }
        res.append(n);

        return res.toString();
    }
}
