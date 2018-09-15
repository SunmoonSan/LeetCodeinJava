package com.maple.leetcode.code200;

public class LeetCode258 {

    /*

    12345-->1*9999+1 + 2*999+2 + 3*99+3 + 4*9+4 + 5
    -->(1*9999 + 2*999 + 3*99+3 + 4*9) + 1+2+3+4+5
    从12345变成(1+2+3+4+5)相等于12345/9 余(1+2+3+4+5)
    1+2+3+4+5(15)-->9+6, 有相当于(9+6)/9 余6

     */
    public int addDigits(int num) {

        /*if (num == 0) {
            return 0;
        }

        if (num % 9 == 0)
            return 9;

        return num % 9;*/

        return (num - 1) % 9 + 1;
    }
}
