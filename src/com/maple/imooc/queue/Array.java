package com.maple.imooc.array;

public class Array<E> {

    private E[] data;
    private int size;

    /**
     * 构造函数, 容量默认为capacity
     *
     * @param capacity 默认容量
     */
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * 默认无参构造函数, 容量默认为10
     */
    public Array() {
        this(10);
    }

    /**
     * 获取数组元素的个数
     *
     * @return 数组元素的个数
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组容量
     *
     * @return 数组容量大小
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 判断数组是否为空
     *
     * @return 是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, E e) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size");
        }

        if (size == data.length) {
            resize(data.length * 2);
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = e;
        size++;
    }

    /**
     * 扩容方法
     *
     * @param newCapacity 扩容后的容量
     */
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    /**
     * 在默认添加一个元素
     *
     * @param e 要添加的元素
     */
    public void addLast(E e) {
        /*if (size == data.length) {
            throw new IllegalArgumentException("AddLast failed. Array is full.");
        }
        data[size++] = e;*/
        add(size, e);
    }

    /**
     * 在数组最前端添加一个元素
     *
     * @param e 要添加的元素
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * 获取索引为index的数组元素
     *
     * @param index 索引
     * @return 索引为index的元素
     */
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }

        return data[index];
    }

    /**
     * 获取最后一个元素
     * @return 最后一个元素
     */
    public E getLast() {
        return get(size-1);
    }

    /**
     * 获取第一个元素
     * @return 第一个元素
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 将索引为index的元素设置为e
     *
     * @param index 索引
     * @param e     待设置的元素
     */
    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is illegal");
        }

        data[index] = e;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }

        return false;
    }

    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 移除索引为index的元素
     *
     * @param index 索引
     * @return 移除的元素
     */
    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is illegal");
        }
        E ret = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        data[size] = null;  // 可有可无

        // 当元素被删除一般后, 数组容量减少为原来的一半, Lazy模式
        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }

        return ret;
    }

    /**
     * 移除第一个元素
     *
     * @return 第一个元素
     */
    public E removeFirst() {
        return remove(0);
    }


    /**
     * 移除最后一个元素
     *
     * @return 最后一个元素
     */
    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * 移除元素e
     *
     * @param e 待移除的元素
     */
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size=%d, capacity=%d\n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }

    public static void main(String[] args) {
        Array<Integer> array = new Array<>(10);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);

        array.add(1, 100);
        System.out.println(array);

        array.addFirst(-1);
        System.out.println(array);

    }
}
