package com.maple.leetcode.code500;
/*
给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
American keyboard
示例1:
输入: ["Hello", "Alaska", "Dad", "Peace"]
输出: ["Alaska", "Dad"]
注意:
    你可以重复使用键盘上同一字符。
    你可以假设输入的字符串将只包含字母。
*/

import java.util.ArrayList;
import java.util.List;

public class LeetCode500 {
    public String[] findWords(String[] words) {
        String line1 = "QWERTYUIOPqwertyuiop";  // 第1行
        String line2 = "ASDFGHJKLasdfghjkl";  // 第2行
        String line3 = "ZXCVBNMzxcvbnm";  // 第3行

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            char ch = words[i].charAt(0);  // 获取数组第1个元素的第1个字符
            if (isOnlyOneLine(line1, ch)) {  // 属于第1行
                int j;
                // 从第i个元素的第2个开始判断,是否每个字符都属于第1行
                for (j = 1; j < words[i].length(); j++) {
                    if (!isOnlyOneLine(line1, words[i].charAt(j))) {
                        break;
                    }
                }

                if (j == words[i].length()) { // 若j到最后, 则第i个元素属于第1行
                    list.add(words[i]);
                }
            } else if (isOnlyOneLine(line2, ch)) { // 属于第2行
                int j;
                // 从第i个元素的第2个开始判断,是否每个字符都属于第2行
                for (j = 1; j < words[i].length(); j++) {
                    if (!isOnlyOneLine(line2, words[i].charAt(j))) {
                        break;
                    }
                }

                if (j == words[i].length()) {
                    list.add(words[i]);
                }
            } else { // 属于第3行
                int j;
                // 从第i个元素的第2个开始判断,是否每个字符都属于第1行
                for (j = 1; j < words[i].length(); j++) {
                    if (!isOnlyOneLine(line3, words[i].charAt(j))) {
                        break;
                    }
                }

                if (j == words[i].length()) {
                    list.add(words[i]);
                }
            }

        }

        String[] oneLines = new String[list.size()];

        for (int i = 0; i < oneLines.length; i++) {

            oneLines[i] = list.get(i);
        }

        return oneLines;
    }

    /**
     * 判断ch是在第几行
     *
     * @param line 1,2,3行
     * @param ch   待检测字符
     * @return 是否属于同一行
     */
    public boolean isOnlyOneLine(String line, char ch) {
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        LeetCode500 leet = new LeetCode500();
        String[] str = {"Hello", "Alaska", "Dad", "Peace"};
        String[] s = leet.findWords(str);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
