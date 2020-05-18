package com.customertimes.lection2.homework;
/*
5) Create a program that calculates the factorial of an integer value n.
 */
public class Task5 {
    public static void main(String[] args) {
        int n = 10;
        int fact = 1;
        for(int i = 1; i < n; i++) {
            fact = fact * (i + 1);
        }
        System.out.println(fact);
    }

}
