package com.maple.leetcode.code100;
/*
设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。

push(x) -- 将元素 x 推入栈中。
pop() -- 删除栈顶的元素。
top() -- 获取栈顶元素。
getMin() -- 检索栈中的最小元素。
示例:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.getMin();   --> 返回 -2.
 */

import java.util.LinkedList;

public class LeetCode155 {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}

class MinStack {

    private LinkedList<Integer> stack;
    private LinkedList<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int x) {
        stack.addLast(x);
        if (!minStack.isEmpty()) {
            if (x < minStack.getLast()) {
                minStack.addLast(x);
            } else {
                minStack.addLast(minStack.getLast());
            }
        } else {
            minStack.addLast(x);
        }
    }

    public void pop() {
        stack.removeLast();
        minStack.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return minStack.getLast();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("");
        res.append("[");
        for (int i = 0; i < stack.size(); i++) {
            res.append(stack.get(i)).append("(").append(minStack.get(i)).append(")");
            if (i != stack.size() - 1) {
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }
}
