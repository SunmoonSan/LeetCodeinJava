package com.maple.leetcode.code900;
/*
你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。
你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。
示例 1：
输入：name = "alex", typed = "aaleex"
输出：true
解释：'alex' 中的 'a' 和 'e' 被长按。

示例 2：
输入：name = "saeed", typed = "ssaaedd"
输出：false
解释：'e' 一定需要被键入两次，但在 typed 的输出中不是这样。

示例 3：
输入：name = "leelee", typed = "lleeelee"
输出：true

示例 4：
输入：name = "laiden", typed = "laiden"
输出：true
解释：长按名字中的字符并不是必要的。

提示：
name.length <= 1000
typed.length <= 1000
name 和 typed 的字符都是小写字母。
*/

public class LeetCode925 {

    public boolean isLongPressedName(String name, String typed) {

        int j = 0;
        for (int i = 0; i < name.length(); i++) {
            StringBuilder s1 = new StringBuilder();  // 记录name字符串相邻且相同字符
            s1.append(name.charAt(i));
            while (i < name.length() - 1 && name.charAt(i) == name.charAt(i + 1)) {
                s1.append(name.charAt(i + 1));
                i++;
            }

            StringBuilder s2 = new StringBuilder(); // 记录typed字符串相邻且相同字符
            while (j < typed.length()) {
                s2.append(typed.charAt(j));
                while (j < typed.length() - 1 && typed.charAt(j) == typed.charAt(j + 1)) {
                    s2.append(typed.charAt(j + 1));
                    j++;
                }

                if (s1.charAt(0) != s2.charAt(0)) {
                    return false;
                }

                if (s2.length() < s1.length()) {
                    return false;
                }
                j++;
                break;
            }

            if (s1.length() != 0 && s2.length() == 0) {
                return false;
            }

        }

        return true;
    }


    public static void main(String[] args) {
        LeetCode925 leet = new LeetCode925();
//        String name = "alex", typed = "aaleex";
//        String name = "saeed", typed = "ssaaedd";
        String name = "leelee", typed = "lleeelee";
//        String name = "laiden", typed = "laiden";
//        String name = "plrz", typed = "pllr";
        boolean b = leet.isLongPressedName(name, typed);
        System.out.println(b);
    }
}
