package com.customertimes.lection4.homework.Task8InitialationOrder;

public class OrderIn {

    //In Java, the order for initialization statements is as follows:
    //static variables and static initializers in order
    //instance variables and instance initializers in order
    //constructors

   /* 1 - статичний філд
    2 - статичний блок
    3 - змінні класу
    4 - блоки класу
    5 - конструктор*/


    int three = 33; // will be third 3
    static int one = 1; // will be first 1
    int four = 44; //will be fourth 4
    String str; //will be fifth 5

    static { // will be second 2
        one = one + 1000;
    }

    { // will be sixth 6
        four = 22;
    }

    public OrderIn(String str) { // will be seventh 7
        this.str = str;
    }

    public void getVar() {
        System.out.println("'three' variable must be 33! and it is: " + three);
        System.out.println("'four' variable must be 44! and it is: " + four);
        System.out.println("Our string is string :) -> " + str);
    }
}
