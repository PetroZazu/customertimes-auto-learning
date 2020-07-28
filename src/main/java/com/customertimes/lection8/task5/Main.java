package com.customertimes.lection8.task5;

import com.customertimes.lection8.task1.NumberNullException;

/*
Throw a NullPointerException from the method iCanThrowException();
Handle it in the main method.
public class Main {

    public static void main(String[] args) {
        iCanThrowException();
    }

    public static void iCanThrowException()  {

    }
}
 */
public class Main {
    public static void main(String[] args) {
        try {
            iCanThrowException();
        } catch (NullPointerException nPE) {
            System.out.println(nPE);
        }

        System.out.println("code after exception");
    }

    public static void iCanThrowException() throws NullPointerException {
        throw new NullPointerException();
    }
}
