package com.sample;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(25);

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.indexOf(20));
        arrayList.clear();
        System.out.println(arrayList);
    }
}
