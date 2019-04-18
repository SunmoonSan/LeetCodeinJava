package com.maple.leetcode.code700;
/*
给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
示例 1:
输入: nums = [-1,0,3,5,9,12], target = 9
输出: 4
解释: 9 出现在 nums 中并且下标为 4
示例 2:
输入: nums = [-1,0,3,5,9,12], target = 2
输出: -1
解释: 2 不存在 nums 中因此返回 -1

提示：
    你可以假设 nums 中的所有元素是不重复的。
    n 将在 [1, 10000]之间。
    nums 的每个元素都将在 [-9999, 9999]之间。
*/

/*
递归实现
 */
public class LeetCode704A {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int l, int r) {
        if (l > r) {
            return -1;
        }

        int m = (l + r) / 2;
        if (target < nums[m]) {
            return binarySearch(nums, target, l, m - 1);
        } else if (target > nums[m]) {
            return binarySearch(nums, target, m + 1, r);
        } else {
            return m;
        }
    }

    public static void main(String[] args) {
        LeetCode704A leet = new LeetCode704A();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int s = leet.search(nums, target);
        System.out.println(s);
    }
}
