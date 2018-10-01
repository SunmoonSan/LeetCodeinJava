package com.maple.leetcode.code100;
/*
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
说明
你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
示例 1:
输入: [2,2,1]
输出: 1
示例 2:
输入: [4,1,2,1,2]
输出: 4
*/

import java.util.HashMap;
import java.util.Map;

public class LeetCode136 {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();  // 构造一个映射
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {  // 映射中已存在nums[i]，则移除映射中的nums[i]
                map.remove(nums[i]);
                continue;  // 跳过本次循环
            }
            map.put(nums[i], -1);  // 映射中没有nums[i], 则存入映射
        }
        return (int) map.keySet().toArray()[0];  // 将映射转为Set,再将Set转为数组，取第１个元素
    }

    public static void main(String[] args) {
        LeetCode136 leet = new LeetCode136();
        int[] a = {4, 1, 2, 1, 2};
        int x = leet.singleNumber(a);
        System.out.println(x);
    }
}
