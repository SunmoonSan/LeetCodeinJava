package com.maple.leetcode.code600;

import java.util.HashMap;
import java.util.Map;

public class LeetCode677 {

    public static void main(String[] args) {
        MapSum obj = new MapSum();
        obj.insert("apple", 3);
        int count = obj.sum("ap");
        System.out.println(count);
        obj.insert("app", 2);
        count = obj.sum("ap");
        System.out.println(count);
    }

}

class MapSum {

    private final Map<String, Integer> kvs;

    public MapSum() {
        this.kvs = new HashMap();
    }

    public void insert(String key, int val) {
        this.kvs.put(key, val);
    }

    public int sum(String prefix) {
        int count = 0;
        for (String key : kvs.keySet()) {
            if (key.indexOf(prefix) == 0) {
                count += kvs.get(key);
            }
        }
        return count;
    }
}
