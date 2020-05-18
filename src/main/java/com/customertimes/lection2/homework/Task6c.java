package com.customertimes.lection2.homework;

/*
6) Create a program that print to the console following figures. Use loops, asterisks("*") and spaces (" ").

c)  *
    **
    ***
    ****
    *****
    ******
    *******
 */
public class Task6c {
    public static void main(String[] args) {
        int r = 7; //count of rows;
        String a = "*";
        String s = " ";
        for (int i = 1; i <= r; i++) {
            System.out.print(a);
            a += "*";
            System.out.println();
        }
    }
}