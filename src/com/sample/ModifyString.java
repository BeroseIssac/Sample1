package com.sample;

import java.util.Locale;

public class ModifyString {
    public static void main(String[] args) {
        String s1 = "    Learning Java    ";
        String s2 = "Basics";
        System.out.println("The Length of String 1 is : " +s1.length());
        System.out.println("UpperCase : "+s1.toUpperCase());
        System.out.println("LowerCase : "+s1.toLowerCase());
        System.out.println("Position of a : "+s1.indexOf("a"));
        System.out.println("Character at 5th Position : "+s1.charAt(5));
        System.out.println("Trim : "+s1.trim());
    }
}
