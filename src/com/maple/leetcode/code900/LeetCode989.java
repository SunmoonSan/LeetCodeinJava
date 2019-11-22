package com.maple.leetcode.code900;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        Stack<Long> stack = new Stack<>();
        long sum = 0;
        for (int i = 0; i < A.length; i++) {
            long x = 1;
            for (int k = 1; k < A.length - i; k++) {
                x *= 10;
            }
            sum = sum + x * A[i];
        }
        System.out.println(sum);
        sum += K;
        while (sum > 9) {
            long r = sum % 10;
            sum = sum / 10;
            stack.add(r);
        }
        stack.add(sum);
        List<Integer> integers = new ArrayList<>();
        while (!stack.isEmpty()) {
            long x = stack.pop();
            integers.add((int) x);
        }
        return integers;
    }

    public static void main(String[] args) {
        LeetCode989 leet = new LeetCode989();
        int[] arr = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
//        int[] arr = {2, 1, 5};
        int K = 1;
        List<Integer> integers = leet.addToArrayForm(arr, K);
        System.out.println(integers);
    }
}
