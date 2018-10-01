package com.maple.leetcode.code000;
/*
给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。

示例:

输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
输出:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

说明：

    所有输入均为小写字母。
    不考虑答案输出的顺序。
 */

import java.util.*;

public class LeetCode049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>(); // 以排序后的字符串为key, 以字符串为value的映射
        for (String str : strs) {
            char[] cs = str.toCharArray();  // 字符串转字符数组
            Arrays.sort(cs);  // 对字符数组排序
            String key = String.valueOf(cs);  // 字符数组转为字符串后最为映射的key
            if (!map.containsKey(key)) {  // 映射中没有该key, 则添加进去
                map.put(key, new ArrayList());
            }
            map.get(key).add(str);

        }
        return new ArrayList(map.values());  // 构造返回值
    }

    public static void main(String[] args) {
        LeetCode049 leet = new LeetCode049();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        leet.groupAnagrams(strs);
    }
}
