package com.sample;

public class Audi {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setColor("Red");
        audi.setModel(2022);
        audi.setWeight(1500);
        audi.displayCar();

        Car.accelerate();
        Car.start();

        displayLogo(100);
        displayLogo("H");
    }
    public static void displayLogo(String s1){
        System.out.println("Logo : " + s1);
    }
    public static void displayLogo(int s){
        System.out.println("Logo : "+ s);
    }
}
