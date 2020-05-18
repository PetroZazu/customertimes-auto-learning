package com.customertimes.lection2.homework;

/*
6) Create a program that print to the console following figures. Use loops, asterisks("*") and spaces (" ").

b)  ********
    *      *
    *      *
    *      *
    ********
 */
public class Task6b {
    public static void main(String[] args) {
        int r = 8; //count of * in row
        int s = 5; //count of * in column
        for (int i = 1; i <= s; i++) {
            for (int k = 1; k <= r; k++) {
                if (i == 1 || i == s) {
                    System.out.print("*");
                } else {
                    if ((i > 1 && i < s) && (k > 1 && k < r)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
