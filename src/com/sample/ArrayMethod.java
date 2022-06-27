package com.sample;

import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        int a[] = {1,5,3,3,5,6,9,8};
        int a1[] = {6, 2,4,9,5};

// Length
        System.out.println("The Length of Array is : " + a.length);

// Sorting
        Arrays.sort(a);
        System.out.println("Sorted Array" + Arrays.toString(a));

// Comparing

        if (a.equals(a1)){
            System.out.println("Two arrays are Equal");
        }
        else {
            System.out.println("Two arrays are not Equal");
        }

// Copying
        int c[] = new int[a.length];
        System.out.println(c.length);
        c = a;
//        c[1]++;                                                       change element of copyArray
        System.out.println("Contents of a[]:");
        for (int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("\nContents of c[]:");
        for (int i=0; i<c.length; i++)
            System.out.print(c[i] + " ");
    }
}

