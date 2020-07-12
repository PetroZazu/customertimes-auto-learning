package com.customertimes.lection5.task11;

public class MyClass {

    static int a;
    int b;

    static void change(int value) {
        a = a + value;
        System.out.println("static method result: " + a);

    }

    void anotherChange(int value) {
        this.b = value + b;
        System.out.println("non static method result: " + this.b);

    }

}
