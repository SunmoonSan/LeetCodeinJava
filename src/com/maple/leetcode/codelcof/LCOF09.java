package com.maple.leetcode.codelcof;
/*
 * @desc : Created by San on 2020-04-11 10:51
 */


import java.util.Stack;

class CQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public CQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1.isEmpty()) {
            return -1;
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int x = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return x;
    }
}

public class LCOF09 {
    public static void main(String[] args) {
        CQueue queue = new CQueue();
        queue.appendTail(3);
        int x = queue.deleteHead();
        System.out.println(x);
        int y = queue.deleteHead();
        System.out.println(y);
    }
}