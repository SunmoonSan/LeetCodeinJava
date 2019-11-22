package com.maple.leetcode.code400;

import java.util.ArrayList;
import java.util.List;

public class LeetCode412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add(Integer.toString(i));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        LeetCode412 leet = new LeetCode412();
        leet.fizzBuzz(15);
    }
}
