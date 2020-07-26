package com.customertimes.lection8.task4;
/*
Fix the program to make it work:
public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
}
 */
public class Main {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("code after exception");
    }

}
