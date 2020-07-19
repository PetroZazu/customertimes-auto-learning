package com.customertimes.lection7.task1;
/*
Create a new interface "Flyable". +
This interface should have one method "void fly()". +
Create two new classes "Bird" and "Duck" which implement "Flyable" interface. +
Provide your implementation for the "fly" method. +
 */
public class Main {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable duck = new Duck();

        bird.fly();
        duck.fly();
    }
}
