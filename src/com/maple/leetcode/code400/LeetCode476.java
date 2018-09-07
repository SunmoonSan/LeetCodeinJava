package com.maple.leetcode.code400;
/*
给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
注意:
    给定的整数保证在32位带符号整数的范围内。
    你可以假定二进制数不包含前导零位。
示例 1:
输入: 5
输出: 2
解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。

示例 2:
输入: 1
输出: 0
解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
*/

public class LeetCode476 {
    public int findComplement(int num) {
        String strNum = toBinary(num);

        char[] nums = strNum.toCharArray();
        // 逐位取反
        for (int i=0;i<nums.length;i++) {
            if (nums[i]=='0') {
                nums[i] = '1';
            } else {
                nums[i] = '0';
            }
        }

        int len = nums.length;
        int sum = 0;  // 补数转为10进制的和
        for (int i=len-1;i>=0;i--) {
            // 将nums[i]内字符元素先转为字符串,再转为整型
            sum += Integer.valueOf(String.valueOf(nums[i])) * Math.pow(2, len-i-1);
        }
        return sum;
    }

    // 10进制转为2进制
    public String toBinary(int n) {
        StringBuilder res = new StringBuilder();
        while (n >= 2) {
            int r = n % 2;
            n = (n - r) / 2;
            res.append(r);
        }
        res.append(n);
        res.reverse();
        return res.toString();
    }

    public static void main(String[] args) {
        LeetCode476 leet = new LeetCode476();
        int n = leet.findComplement(1);
        System.out.println(n);
    }
}
