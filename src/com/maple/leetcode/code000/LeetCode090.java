package com.maple.leetcode.code000;

import java.util.*;

public class LeetCode090 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> tempList = new ArrayList<>();
            for (int j = 0; j < lists.size(); j++) {
                List<Integer> integers = new ArrayList<>(lists.get(j));
                integers.add(nums[i]);
                StringBuilder builder = new StringBuilder();
                for (int m = 0; m < integers.size(); m++) {
                    builder.append(integers.get(m));
                }
                if (!set.contains(builder.toString())) {
                    tempList.add(integers);
                }
                set.add(builder.toString());
            }
            lists.addAll(tempList);
            System.out.println(lists);
        }

        return lists;
    }

    public static void main(String[] args) {
        LeetCode090 leet = new LeetCode090();
        int[] nums = {4, 4, 4, 1, 4};
        leet.subsetsWithDup(nums);
    }
}
