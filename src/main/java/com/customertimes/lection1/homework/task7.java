package com.customertimes.lection1.homework;

/*
7) Create an array of 10 integers. Initialize this array with any values except 0. Print the length of the array to a console.
 */
public class task7 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 10;
            System.out.println(arr[i]);
        }

        System.out.println("length of the array is: " + arr.length);
    }
}
