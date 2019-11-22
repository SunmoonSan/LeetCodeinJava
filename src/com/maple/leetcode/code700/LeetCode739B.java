package com.maple.leetcode.code700;
/*
 * @desc : Created by San on 2019-05-02 20:48
 */

import java.util.Stack;

public class LeetCode739B {
    public int[] dailyTemperatures(int[] T) {
        int[] days = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
                int index = stack.pop();
                days[index] = i - index;
            }
            stack.push(i);
        }
        return days;
    }

    public static void main(String[] args) {
        LeetCode739B leet = new LeetCode739B();
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        leet.dailyTemperatures(nums);
    }
}
