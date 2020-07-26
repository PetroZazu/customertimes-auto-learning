package com.customertimes.lection8.task1;

public class FirstException {
    public static void exceptionThrow(int number) throws NumberNullException {
        if (number < 0) {
            System.out.println("Number < 0");
            return;
        }

        if (number > 0) {
            System.out.println("Number > 0");
            return;
        }

        if (number == 0) {
            throw new NumberNullException();
        }

    }


}
