package com.customertimes.lection2.homework;

import javafx.scene.shape.Rectangle;

/*
2) Create a simple program
that calculates and prints the square of a rectangle and a circle.
Import and use Math class.
 */
public class Task2 {
    public static void rectSqrt (int a, int b) {
        System.out.println("Площа прямокутника = "+ a * b);
    }

    public static void circleSqrt (int rad){
        rad *= rad;
        double s = Math.PI * rad;
        System.out.println("Площа кола = " + s);
    }

    public static void main(String[] args) {
        rectSqrt(2, 3);
        circleSqrt(10);


    }
}
