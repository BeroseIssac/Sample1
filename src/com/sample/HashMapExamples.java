package com.sample;

import java.util.HashMap;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<Integer,String> Language = new HashMap<>();

        Language.put(0,"Java");
        Language.put(1,"Python");
        Language.put(2,"C++");
        Language.put(3,"C");

        System.out.println(Language);

        if (Language.containsKey(2));
        {
            System.out.println(Language.get(2));
        }

        if (!Language.isEmpty()){
            System.out.println("HashMap contains mappings");
        }
        Language.remove(3);
        System.out.println(Language);
        System.out.println(Language);

        System.out.println(Language.get(2).equals(Language.get(1)));
    }
}
