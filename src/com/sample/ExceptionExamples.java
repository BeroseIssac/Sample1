package com.sample;

public class ExceptionExamples {
    public static void main(String[] args) {
        
        handleArithmeticException(100);
        handleNullpointerException(null);
    }

    private static void handleNullpointerException(String s) {
        try{
            System.out.println(s.length());
        }
        catch(NullPointerException ex){
            ex.printStackTrace();
        }
    }

    private static void handleArithmeticException(int number) {
        try {
            int a = number / 0;
        }
        catch (ArithmeticException exception){
            exception.printStackTrace();
        }
    }

}
