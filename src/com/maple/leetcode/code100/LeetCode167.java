package com.maple.leetcode.code100;

public class LeetCode167 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l <= r) {
            if (numbers[l] + numbers[r] == target) {
                return new int[]{l + 1, r + 1};
            } else if (numbers[l] + numbers[r] < target) {
                l++;
            } else {
                r--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        LeetCode167 leet = new LeetCode167();
        int[] t = leet.twoSum(numbers, target);
        System.out.println(t[0]);
        System.out.println(t[1]);
    }
}
