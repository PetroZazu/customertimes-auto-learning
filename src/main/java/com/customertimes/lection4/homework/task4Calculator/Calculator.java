package com.customertimes.lection4.homework.task4Calculator;
/*
4. Create a class Calculator. - done
 It should have three fields: double firstValue, double secondValue and String operation. - done
 Create all required constructors to properly initialize your object. -done
 Consider the case when user does not provide any parameters when creates a new object. -done
 Write a method "calculate" that takes these two values and return the result of the calculation according to the operation.
 Write the test class which contains the main method.
 In this main method you should create your Calculator object and do some calculation to test your code,
 by calling your "calculate" method. Print all results to the console.
 */

public class Calculator {
    private double firstValue;
    private double secondValue;
    private String operation;

    public Calculator(double firstValue, String operation, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }


    public Calculator() {
        System.out.println("please provide arguments");
    }

    public void calc() {
        switch (operation) {
            case "*":
                System.out.println(this.firstValue * this.secondValue);
                return;
            case "+":
                System.out.println(this.firstValue + this.secondValue);
                return;
            case "-":
                System.out.println(this.firstValue - this.secondValue);
                return;
            case "/":
                System.out.println(this.firstValue / this.secondValue);
                return;
            default:
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
