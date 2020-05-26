package com.customertimes.lection3.homework;

/*
Given two strings.
Check if they start with "The".

Task: word1 = "The End", word2="End The";
 */
public class Task4 {
    public static Boolean startWithThe (String str){
        if (str.length() < 3) {
            return false;
        }

        if (str.substring(0, 3).equals("The")) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(startWithThe("she End"));;

    }
}
