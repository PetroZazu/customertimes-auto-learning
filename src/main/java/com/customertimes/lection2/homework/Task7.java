package com.customertimes.lection2.homework;

import java.util.Random;

/*
7) Create an array of 10 integers.
 Calculate and print the sum of all its elements except the first one and the last one.
*/
public class Task7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 5;
        int sum = 0;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(upperbound);
            if (i > 0 && i < arr.length - 1) {
                sum += arr[i];
            }
            System.out.println(arr[i]);
        }
        System.out.println("sum of array elements except the first one and the last one is: " + sum);

    }
}
