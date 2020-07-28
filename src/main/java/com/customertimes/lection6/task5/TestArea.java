package com.customertimes.lection6.task5;

public class TestArea {
    public static void main(String[] args) {
        Figure triangle = new Triangle(9, 10);
        Figure rectangle = new Rectangle(2, 2);

        triangle.calculateArea();
        rectangle.calculateArea();
        //rectangle.printHello(); цей метод є у класі Ректангл но не є у класі Фігур, доступу до цього методу ми не маємо.
    }

}
