package com.customertimes.lection2.homework;
/*
6) Create a program that print to the console following figures. Use loops, asterisks("*") and spaces (" ").

c)      *
       ***
      *****
     *******
    *********
 */
// якщо iтерація 1
// то -> до 5 = " " і після 5 = "*"

// якщо ітерація 2
// то -> до 4 = " " і після 6 = "*"


public class Task6dFirstVariant {
    public static void main(String[] args) {
        int r = 5; //number of rows
        int b = r; //variable same as R, need for second cycle to make iterations with decremental of b variable
        String a = "*";
        String s = " ";
        for (int i = 1; i <= r; i++) {
            for (int k = 1; k < b; k++) {
                System.out.print(s);
            }
            b--;
            System.out.print(a);
            a += "**";
            System.out.println();
        }
    }
}
