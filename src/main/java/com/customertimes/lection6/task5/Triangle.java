package com.customertimes.lection6.task5;

public class Triangle extends Figure {

    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    void calculateArea() {
        System.out.println("Triangle area is: " + (0.5 * getHeight() * getWidth()));
    }
}
