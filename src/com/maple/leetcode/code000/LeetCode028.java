package com.maple.leetcode.code000;

public class LeetCode028 {
    public int strStr(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) != needle.charAt(0)) {  // haystack逐个字符与needle第一个字符比较
                continue;
            }

            // 从第一个相同字符开始向后扫描比较
            for (int j = 0; j < needle.length(); j++) {
                if (i + j < haystack.length()) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {  // 如某个字符不相等,则i+1重新来过
                        break;
                    }
                } else {
                    return -1;
                }

                if (j == needle.length() - 1) {  // 比较到needle最后一个字符, 返回haystack的索引
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        String haystack = "mississippi", needle = "pi";
        String haystack = "hello", needle = "ll";
        LeetCode028 leet = new LeetCode028();
        int index = leet.strStr(haystack, needle);
        System.out.println(index);
    }
}
