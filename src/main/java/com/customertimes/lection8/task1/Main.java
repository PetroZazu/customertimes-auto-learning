package com.customertimes.lection8.task1;

/*
Create method to check:
if number < 0 print “Number < 0”,
if number > 0 print “Number > 0”
if number = 0 throw your own exception.
 */
public class Main {
    public static void main(String[] args) {
        try {
            FirstException.exceptionThrow(0);
        } catch (NumberNullException nNEX) {
            System.out.println(nNEX);
        }

    }
}
