package com.maple.leetcode.code100;

public class LeetCode134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int retain = 0;
        int i = 0;
        int countI = 0;
        while (countI < gas.length) {
            retain = 0;
            if (retain + gas[i] >= cost[i]) {
                retain = retain + gas[i] - cost[i];
                int j = (i + 1) % gas.length;
                while (j != i && (retain + gas[j] >= cost[j])) {
                    retain = retain + gas[j] - cost[j];
                    j = (j + 1) % gas.length;
                }
                if (i == j) {
                    return i;
                }
            }
            i = (i + 1) % gas.length;
            countI++;
        }

        return -1;
    }

    public static void main(String[] args) {
        LeetCode134 leet = new LeetCode134();
        int[] gas = {5, 1, 2, 3, 4};
        int[] cost = {4, 4, 1, 5, 1};
        int n = leet.canCompleteCircuit(gas, cost);
        System.out.println(n);
    }
}
