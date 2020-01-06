package com.maple.leetcode.code200;

import java.util.HashMap;
import java.util.Map;

public class LeetCode205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sE = s.charAt(i);
            char tE = t.charAt(i);
            Character sVal = sMap.get(sE);
            if (sVal == null) {
                if (tMap.containsKey(tE)) {
                    return false;
                }
                sMap.put(sE, tE);
                tMap.put(tE, sE);
                continue;
            }
            if (sVal != tE) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode205 leet = new LeetCode205();
        String s = "foe";
        String t = "baa";
        boolean b = leet.isIsomorphic(s, t);
        System.out.println(b);
    }
}
