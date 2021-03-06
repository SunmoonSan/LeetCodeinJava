package com.maple.leetcode.code200;
/*
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
示例:
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]

说明:
    1.必须在原数组上操作，不能拷贝额外的数组。
    2.尽量减少操作次数。
 */

public class LeetCode283A {
    public void moveZeroes(int[] nums) {
        int index = 0; // 记录前面不为0位置

        // 从前往后遍历,将所有不为0的数字依次前移
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // 不为0的元素占据前面空间,后面位置全部置0
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }

    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        LeetCode283A leet = new LeetCode283A();
        leet.moveZeroes(nums);
    }
}
