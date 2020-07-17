package com.customertimes.lection6.task5;

public class Rectangle extends Figure {
    public Rectangle(int length, int height) {
        super(length, height);
    }

    @Override
    void calculateArea() {
        System.out.println("Rectangle area is: " + (getHeight() * getWidth()));
    }
}

