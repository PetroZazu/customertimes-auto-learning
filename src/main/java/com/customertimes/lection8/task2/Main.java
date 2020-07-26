package com.customertimes.lection8.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println(divideByZero());
    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;
        try {
            return a / b;
        } catch (ArithmeticException aFEX) {
            System.out.println("Divide by zero is impossible");
            return b / a;
        }
    }
}

