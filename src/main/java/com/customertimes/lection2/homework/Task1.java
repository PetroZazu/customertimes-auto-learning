package com.customertimes.lection2.homework;

/*
1) Create a simple program,
 that creates two integers and print the result of calculation of their
  addition,
  substruction,
  multiplication
  and division.
 */
public class Task1 {
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int substruction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("5 + 5 = " + addition(5, 5));
        System.out.println("5 - 5 = " + substruction(5,5));
        System.out.println("5 * 5 = " + multiplication(5, 5));
        System.out.println("5 / 6 = " + division(5, 6));
    }
}
