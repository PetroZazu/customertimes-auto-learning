package com.customertimes.lection8.task3;
/*
Finish the program to handle all the possible exceptions:
public class Main {

    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        int b = 10 / a;
        int[] c = {1};
        System.out.println(c[1]);

    }

}

Print the cause of the exception to the console."
 */
public class Main {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println(a);
            int b = 10 / a;

        } catch (ArithmeticException nPE) {
            System.out.println("you can not divide by 0");
        }

        try {
            int[] c = {1};
            System.out.println(c[1]);
        } catch (IndexOutOfBoundsException iOOBE) {
            System.out.println("Array out of bound exception");
        }

        System.out.println("code execution after exceptions");
    }
}
