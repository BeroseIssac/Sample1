package com.sample;

public class Lenovo implements Company{

    @Override
    public void getEmployees() {
        System.out.println("All Employees ");
    }

    @Override
    public void getProducts() {
        System.out.println("All Products ");
    }
}
