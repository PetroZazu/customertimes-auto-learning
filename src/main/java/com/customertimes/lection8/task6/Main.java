package com.customertimes.lection8.task6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
Write a program that will enter numbers from the keyboard.
The code for reading numbers from the keyboard must be in the readData method.
The code inside the readData is wrapped in a try..catch.
If the user entered some text, instead of entering a number, the method should catch the exception and display all previously entered numbers as a result.
Numbers output from a new line preserving the order of input."
 */
public class Main {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner myScaner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        try {
            do {
                System.out.println("Enter number from the keyboard");
                int number = myScaner.nextInt(); // Read user input
                list.add(number);
            } while (true);
        } catch (InputMismatchException iME) {
            System.out.println("Forbidden to add text, please provide numbers only");
            System.out.println("your already enter:");
            System.out.println(list);
        }
    }

}
