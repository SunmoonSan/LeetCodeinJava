package com.maple.leetcode.code400;
/*
统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
请注意，你可以假定字符串里不包括任何不可打印的字符。
示例:
输入: "Hello, my name is John"
输出: 5
*/

public class LeetCode434 {
    public int countSegments(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        char[] chars = s.toCharArray();

        int count = 0;  // 统计一个完整单词的字符个数
        int n = 0;  // 统计单词个数
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                if (count > 0) {
                    n++;
                }
                count = 0;
                continue;
            }
            count++;
        }

        // 最后一个字符不为空,则统计数+1
        int end = s.charAt(s.length() - 1);
        if (end != ' ') {
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        LeetCode434 leet = new LeetCode434();
        int n = leet.countSegments("The one-hour drama series Westworld is a dark odyssey about the dawn of artificial " +
                "consciousness and the evolution of sin. Set at the intersection of the near future and the reimagined past, it " +
                "explores a world in which every human appetite, no matter how noble or depraved, can be indulged.");
//        int n = leet.countSegments("Hello, my name is John");
        System.out.println(n);
    }
}
