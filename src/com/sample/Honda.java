package com.sample;

public class Honda extends Car{
    public static void main(String[] args) {

        start();
        accelerate();
        brake();

    }

    public static void brake(){
        System.out.println("Apply the Brake");
    }
    public static void start(){
        String key = "ON";
        System.out.println("Turn the Key " + key);
    }
}
