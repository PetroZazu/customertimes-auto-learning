package com.customertimes.lection5.task11;

public class Test {
    public static void main(String[] args) {
        MyClass.change(10);
        MyClass.change(10);
        MyClass.change(20);
        //out should be 40;

        MyClass notStaticTest = new MyClass();
        notStaticTest.anotherChange(10);
        notStaticTest.anotherChange(10);
        //out should be 20;

        MyClass nonStaticTest2 = new MyClass();
        nonStaticTest2.anotherChange(10);
        nonStaticTest2.anotherChange(20);
        //out should be 30

    }
}
