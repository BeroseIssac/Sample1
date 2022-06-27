package com.sample;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        System.out.println("Enter the Number : 10110");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 6) {
            System.out.println("You Won");
        } else {
            System.out.println("You Lost");
        }
    }
}
