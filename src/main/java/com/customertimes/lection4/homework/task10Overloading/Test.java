package com.customertimes.lection4.homework.task10Overloading;

public class Test {
    public static void main(String[] args) {
        StringPing str = new StringPing();
        StringPing.doSomething("abbalagama"); // This is Static overloaded method called from class
        str.doSomething("abbalagama2"); // This is Static overloaded method called from object variable
        str.doSomething("test", "brest"); // This is non static overloaded method called from object variable
        str.doSomething("Se", "Le", "Nium");// This is non static overloaded method called from object variable
    }
}
