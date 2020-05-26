package com.customertimes.lection3.homework;

/*
Given a string. Write a code that will creates a new string made of its first two chars of the initial string
so the String "Hello" yields "He".
If the string is shorter than length 2, return whatever there is, so "X" yields "X"
and the empty string "" yields the empty string "".
 */
public class Task2 {
    public static String twoFirst(String str) {
        if (str.length() < 2) {
            return str;
        } else
            return str.substring(0, 2);
    }


    public static void main(String[] args) {
        System.out.println(twoFirst("abc"));
    }
}
