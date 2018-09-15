package com.maple.imooc.link;

public class LinkedList<E> {

    /**
     * 节点类
     */
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    /**
     * 获取链表的个数
     *
     * @return 链表个数
     */
    public int getSize() {
        return size;
    }

    /**
     * 判断链表是否为空
     *
     * @return 是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在头节点添加一个元素
     *
     * @param e 待添加元素
     */

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Add failed. Illegal index");
        }

        /*if (index == 0) {
            addFirst(e);
        } else {
            Node prev = head;
            for (int i=0; i<index-1; i++) {
                prev = prev.next;
            }
//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;

            prev.next = new Node(e, prev.next);  // 等价于上述
            size++;
        }*/

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        prev.next = new Node(e, prev.next);
        size++;
    }

    public void addFirst(E e) {
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

        /*head = new Node(e, head);  // 等价于上述
        size++;*/
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }

    /**
     * 获取链表索引为index的元素
     *
     * @param index 索引
     * @return index位置处的元素
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Get failed. Illegal index.");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    /**
     * 获取第一个元素
     *
     * @return 第一个元素
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 获取最后一个元素
     *
     * @return 最后一个元素
     */
    public E getLast() {
        return get(size - 1);
    }

    /**
     * 将索引为index的元素设为e
     *
     * @param index 索引index
     * @param e     要设置的元素
     */
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Set failed. Illegal index");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        cur.e = e;
    }

    /**
     * 判断链表中是否包含元素e
     *
     * @param e 待判断的元素
     * @return 是否包含e
     */
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (e.equals(cur.e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 删除索引为index的元素
     *
     * @param index 索引index
     * @return 删除的元素
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Remove failed. Illegal index.");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null) {
            res.append(cur).append("->");
            cur = cur.next;
        }

        // 等价于上述
        /*for (Node c=dummyHead.next; c!= null; c=c.next)
            res.append(c+"->");*/

        res.append("NULL");
        return res.toString();
    }

}
