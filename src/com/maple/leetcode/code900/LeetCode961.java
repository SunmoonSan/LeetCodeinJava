package com.maple.leetcode.code900;

import java.util.HashMap;
import java.util.Map;

/*
在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
返回重复了 N 次的那个元素。
示例 1：

输入：[1,2,3,3]
输出：3

示例 2：
输入：[2,1,2,5,3,2]
输出：2

示例 3：
输入：[5,1,5,2,5,3,5,4]
输出：5

提示：
4 <= A.length <= 10000
0 <= A[i] < 10000
A.length 为偶数
*/

public class LeetCode961 {
    public int repeatedNTimes(int[] A) {
        int N = A.length / 2; // 重复的次数
        Map<Integer, Integer> kvs = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (kvs.containsKey(A[i])) {  // 映射中存在A[i]的key, 则value加1
                kvs.put(A[i], kvs.get(A[i]) + 1);
                if (kvs.get(A[i]) == N) {
                    return A[i];
                }
            } else { // 映射中不存在A[i]的key, 则初始化value为1
                kvs.put(A[i], 1);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        LeetCode961 leet = new LeetCode961();
        int[] arr = {5, 1, 5, 2, 5, 3, 5, 4};
        int n = leet.repeatedNTimes(arr);
        System.out.println(n);
    }
}
