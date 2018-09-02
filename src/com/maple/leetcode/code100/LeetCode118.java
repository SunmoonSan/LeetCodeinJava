package com.maple.leetcode.code100;
/*
给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
在杨辉三角中，每个数是它左上方和右上方的数的和。
示例:

输入: 5
输出:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/

import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows==0) { // []
            return lists;
        } else if (numRows==1) {  // [[1]]
            List<Integer> integers = new ArrayList<>();
            integers.add(1);
            lists.add(integers);
        } else {  // [[1], [1,1]]
            List<Integer> integers1 = new ArrayList<>();
            integers1.add(1);
            lists.add(integers1);

            List<Integer> integers2 = new ArrayList<>();
            integers2.add(1);
            integers2.add(1);
            lists.add(integers2);
        }

        for (int i=3;i<=numRows;i++) {
            List<Integer> integersi = new ArrayList<>();
            integersi.add(1);
            for (int j=0;j<i-2;j++) {
                int a = lists.get(i-2).get(j);
                int b = lists.get(i-2).get(j+1);
                integersi.add(a+b);
            }
            integersi.add(1);
            lists.add(integersi);
        }

        return lists;
    }

    public static void main(String[] args) {
        LeetCode118 leet = new LeetCode118();
        leet.generate(1);
    }
}
