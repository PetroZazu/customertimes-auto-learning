package com.customertimes.lection3.homework;

/*
Given some random string s.
Verify if that string ends with ".".
If so, leave this string as is.
If not - add it.
Test strings create on your own.
 */
public class Task9 {
    public static String dotEnd(String str) {
        if (str.isEmpty()){
            return str + ".";
        }
        if (str.substring(str.length() - 1).equals(".")) {
            return str;
        } else {
            return str + ".";
        }
    }

    public static void main(String[] args) {
        System.out.println(dotEnd("azazazaz"));

    }
}
