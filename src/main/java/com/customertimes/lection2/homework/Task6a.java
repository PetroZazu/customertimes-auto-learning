package com.customertimes.lection2.homework;
/*
6) Create a program that print to the console following figures. Use loops, asterisks("*") and spaces (" ").

a)  ********
    ********
    ********
    ********
    ********
    ********
    ********
    ********
 */
public class Task6a {
    public static void main(String[] args) {
        int r = 8; //count of * in row
        int s = 8; //count of * in column
        for (int i = 0; i < s; i++) {
            for (int k = 0; k < r; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
