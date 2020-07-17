package com.customertimes.lection6.task5;

public class TestArea {
    public static void main(String[] args) {
        Figure triangle = new Triangle(9, 10);
        Rectangle rectangle = new Rectangle(2, 2);

        triangle.calculateArea();
        rectangle.calculateArea();
    }

}
