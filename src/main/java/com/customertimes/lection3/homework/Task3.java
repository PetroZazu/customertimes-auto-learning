package com.customertimes.lection3.homework;

/*
The web is built with HTML strings like "<i>Hello</i>" which draws Hello as italic text.
   In this example, the "i" tag makes <i> and </i> which surround the word "Hello".
   Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Hello</i>".

   Task: word = "Welcome to Java World", tag="p"
 */
public class Task3 {
    public static void htmlTag (String word, String tag) {
        System.out.println("<"+tag+">"+word+"</"+tag+">");
    }
    public static void main(String[] args) {
        htmlTag("Welcome to Java World", "p");

    }
}
