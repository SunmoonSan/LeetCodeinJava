package com.maple.imooc.link;
/*
 * 链栈
 */

import com.maple.imooc.Stack;

public class LinkedStack<E> implements Stack<E> {
    private LinkedList<E> list;

    public LinkedStack() {
        list = new LinkedList<>();
    }

    /**
     * 压栈
     * @param e 要压栈的元素
     */
    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    /**
     * 出栈
     * @return 要弹栈元素
     */
    @Override
    public E pop() {
        return list.removeFirst();
    }

    /**
     * 获得栈顶元素
     * @return 栈顶元素
     */
    @Override
    public E peek() {
        return list.getFirst();
    }

    /**
     * 获取栈大小
     * @return 栈大小
     */
    @Override
    public int getSize() {
        return list.getSize();
    }

    /**
     * 判断栈是否为空
     * @return 是否为空
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ").append(list);
        return res.toString();
    }
}
