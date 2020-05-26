package com.customertimes.lection3.homework;
/*

Given 2 strings, a and b.
Create a string c of the form short+long+short,
with the shorter string on the outside and the longer string on the inside.

   Task: a = "hop", b = "hello"
 */
public class Task6 {
    public static String shortLongShort (String a, String b) {
        if (a.length() > b.length()){
            return b + a + b;
        } else {
            return a + b + a;
        }
    }
    public static void main(String[] args) {
        System.out.println(shortLongShort("hop", "hello"));
    }
}
