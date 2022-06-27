package com.sample;

public class Arithematic {
    public static void main(String[] args) {
        addnumbers(10,12);
        addnumbers(15,20);
        subnumbers(20,5);
        divnumbers(20,5);
        divnumbers(10,3);
        mulnumbers(5,4);

        int Result = mulnumbers(5,8) + divnumbers(25,5);
        System.out.println("Mul+Div : "+Result);
    }
    public static void addnumbers(int num1, int num2){
        int res = num1 + num2;
        System.out.println("Addition of Two Numbers : " +res);
    }
    public static void subnumbers(int num1, int num2){
        int res = num1 - num2;
        System.out.println("Subtraction of Two Numbers : " +res);
    }
    public static int divnumbers(int num1, int num2){
        int res = num1 / num2;
        System.out.println("Division of Two Numbers : " +res);
        return res;
    }
    public static int mulnumbers(int num1, int num2){
        int res = num1 * num2;
        System.out.println("Multiplication of Two Numbers : " +res);
        return res;
    }
}
