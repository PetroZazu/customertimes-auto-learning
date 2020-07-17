package com.customertimes.lection6.task5;
/*
5) Create an abstract class Figure. +
Add fields width and height to it. +
Add an abstract method "calculateArea" +
which should be overridden by the concrete figures to calculate its area.+
 */
public abstract class Figure {

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Figure (int width, int height) {
        this.width = width;
        this.height = height;
    }

    abstract void calculateArea ();
}
