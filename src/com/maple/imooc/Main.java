package com.maple.imooc;

public class Main {
    public static void main(String[] args) {
        /*Array array = new Array(20);
        for (int i=0;i<10;i++) {
            array.addLast(i);
        }

        System.out.println(array.toString());

        array.addFirst(10);
        System.out.println(array);

        array.addLast(11);
        System.out.println(array);

        array.add(3, 13);
        System.out.println(array);*/
        int a = 42;
        System.out.println(((Integer)a).hashCode());

        int b = -42;
        System.out.println(((Integer)b).hashCode());

        double c = 3.1415926;
        System.out.println(((Double)c).hashCode());

        String d = "imooc";
        System.out.println(d.hashCode());
    }
}
