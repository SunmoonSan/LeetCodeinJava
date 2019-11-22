package com.maple.leetcode.code200;
/*
 * @desc : Created by San on 2019-05-04 09:03
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeetCode284 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers);
        Iterator<Integer> iterator = integers.iterator();
        PeekingIterator pi = new PeekingIterator(iterator);
        System.out.println(pi.hasNext());
        System.out.println(pi.peek());
        System.out.println(pi.next());
        System.out.println(pi.hasNext());
        System.out.println(pi.peek());
        System.out.println(pi.next());
        System.out.println(pi.hasNext());
        System.out.println(pi.peek());
        System.out.println(pi.next());
        System.out.println(pi.hasNext());
    }
}

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iter;
    private Integer top;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iter = iterator;
        this.top = iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return this.top;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        int x = top;
        if (iter.hasNext()) {
            top = iter.next();
        } else {
            top = null;
        }
        return x;
    }

    @Override
    public boolean hasNext() {
        return this.top != null;
    }
}
