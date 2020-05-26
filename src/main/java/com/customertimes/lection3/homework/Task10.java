package com.customertimes.lection3.homework;

import java.util.ArrayList;

/*
Write a program which prints "Hello world" to the console using methods transformIntToChar and printList only.

 */
public class Task10 {
    public static void main(String[] args) {
        printList(transformIntToChar(72,101,108,108,111,32,119,111,114,108,100));
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<Character>();
        for (int i : values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c : characters) {
            System.out.print(c);
        }
    }
}
