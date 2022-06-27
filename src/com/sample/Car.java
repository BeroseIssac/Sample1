package com.sample;

public class Car {
    private String color;
    private int model;
    private double weight;

    public static void start(){
        System.out.println("Press the Start Key");
    }
    public static void accelerate(){
        System.out.println("Press the accelerator");
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setModel(int model){
        this.model = model;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void displayCar(){
        System.out.println("Color of the Car is : " +color);
        System.out.println("Model of the Car is : " +model);
        System.out.println("Weight of the Car is : " +weight);
    }
}
