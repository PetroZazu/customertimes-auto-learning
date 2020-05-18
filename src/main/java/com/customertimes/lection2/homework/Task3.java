package com.customertimes.lection2.homework;

/*
3) Create an array of 10 integers.
Fill this array using for-loop with random numbers.
Print all the elements of this array to the console.
Each element from the new line.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random()) * 100);
            System.out.println(arr[i]);
        }
    }
}
