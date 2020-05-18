package com.customertimes.lection2.homework;

import java.util.Random;

/*
9) Create an array of any length and fill it with random integers.
Using loops and conditions sort this array and print it out to the console.
You can use any sorting algorithm you want.
Do not use build-in methods to sort the array.
 */
public class Task9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = {4, 4, 5, 5, 6, 6, 6, 6, 1, 1, 2, 2, 3, 4, 5, 6, 9, 1, 1, 2, 2, 3};
        int t;
        int y = 1;
        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();*/

        for (int k = 0; k < arr.length; k++) {
            for (int i = y; i < arr.length; i++) {
                if (arr[k] > arr[i]) {
                    t = arr[k];
                    arr[k] = arr[i];
                    arr[i] = t;
                }
            }
            y++;
            System.out.print(arr[k] + " ");
        }
    }
}
