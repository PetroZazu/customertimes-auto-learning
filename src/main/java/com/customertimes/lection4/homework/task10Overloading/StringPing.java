package com.customertimes.lection4.homework.task10Overloading;

public class StringPing {
    public static void doSomething (String a) {
        System.out.println("Method with 1 string");
        System.out.println(a + " 1");
    }

    public void doSomething (String a, String b) {
        System.out.println("Method with 2 strings");
        System.out.println(a + b + " 2");
    }

    public void doSomething (String a, String b, String c) {
        System.out.println("Method with 3 strings");
        System.out.println(a + b + c + " 3");
    }
}
