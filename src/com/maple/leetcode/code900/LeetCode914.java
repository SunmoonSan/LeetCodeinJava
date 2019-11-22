package com.maple.leetcode.code900;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode914 {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length < 2) {
            return false;
        }

        Map<Integer, Integer> kvs = new HashMap<>();

        for (int i = 0; i < deck.length; i++) {
            if (kvs.containsKey(deck[i])) {
                kvs.put(deck[i], kvs.get(deck[i]) + 1);
            } else {
                kvs.put(deck[i], 1);
            }
        }

        System.out.println(kvs);
        List<Integer> integers = new ArrayList<>(kvs.values());
        int l = 0;
        int r = integers.size() - 1;
        while (l < r) {
            if (integers.get(l).equals(integers.get(r))) {
                l++;
                r--;
            } else if ((integers.get(l)%2==0)) {
                l++;

            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode914 leet = new LeetCode914();
        int[] a = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] c = {1, 1, 1, 2, 2, 2, 3, 3};
        int[] d = {1};
        int[] f = {1, 1, 2, 2, 2, 2};
        boolean b = leet.hasGroupsSizeX(f);
        System.out.println(b);
    }
}
