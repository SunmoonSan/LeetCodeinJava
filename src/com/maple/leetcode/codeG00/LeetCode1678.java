package com.maple.leetcode.codeG00;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1678 {
    public static void main(String[] args) {
        LeetCode1678 leet = new LeetCode1678();
        String command = "G()()()()(al)";
        String s = leet.interpret(command);
        System.out.println(s);
    }

    public String interpret(String command) {
        Map<String, String> kvs = new HashMap<>();
        kvs.put("G", "G");
        kvs.put("()", "o");
        kvs.put("(al)", "al");
        String s = "";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            s += command.charAt(i);
            if (kvs.containsKey(s)) {
                res.append(kvs.get(s));
                s = "";
            }
        }

        return res.toString();
    }
}
