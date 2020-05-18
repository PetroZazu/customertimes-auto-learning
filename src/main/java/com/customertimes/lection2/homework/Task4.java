package com.customertimes.lection2.homework;

/*
4) Create an array of 10 integers.
Find the square root of each element and put the to result array.
Print the result array to the console.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 6, 16, 100, 64, 81, 121, 10, 11};
        double[] resArr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            resArr[i] = Math.sqrt(arr[i]);
            System.out.println(resArr[i]);
        }
    }
}
