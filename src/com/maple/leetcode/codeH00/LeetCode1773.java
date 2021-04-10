package com.maple.leetcode.codeH00;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        Map<String, Integer> kvs = new HashMap<>();
        kvs.put("type", 0);
        kvs.put("color", 1);
        kvs.put("name", 2);
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);
            if (item.get(kvs.get(ruleKey)).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
