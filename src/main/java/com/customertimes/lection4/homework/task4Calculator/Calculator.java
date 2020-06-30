package com.customertimes.lection4.homework.task4Calculator;

public class Calculator {
    double firstValue;
    double secondValue;
    String operation;

    public Calculator(double firstValue, String operation, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }

    Calculator c;

    public Calculator() {

    }

    public static void calc(Calculator c) {
        if (c.operation.equals("+")) {
            System.out.println(c.firstValue + c.secondValue);
            System. exit(1);
        }
        if (c.operation.equals("-")) {
            System.out.println(c.firstValue - c.secondValue);
            System. exit(1);
        }
        if (c.operation.equals("/")) {
            System.out.println(c.firstValue / c.secondValue);
            System. exit(1);
        }
        if (c.operation.equals("*")) {
            System.out.println(c.firstValue * c.secondValue);
            System. exit(1);
        } else {
            System.out.println("Please enter a valid operation, such as:");
            System.out.println("+");
            System.out.println("or");
            System.out.println("-");
            System.out.println("or");
            System.out.println("/");
            System.out.println("or");
            System.out.println("*");
        }
    }
}
