package com.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>();

        values.add("C");
        values.add("C++");
        values.add("Java");
        values.add("Python");
        values.add("Java");
        values.add("C");

        System.out.println(values);

        HashSet<String> removeDuplicates = new HashSet<>();
        removeDuplicates.addAll(values);
        for (String s : removeDuplicates){
            System.out.println(s);
        }
    }
}
