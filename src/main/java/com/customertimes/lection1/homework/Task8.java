package com.customertimes.lection1.homework;

/*
8) Create an array of 5 doubles. Get the first and the last element of the array an write them to variables.
 */
public class Task8 {
    public static void main(String[] args) {
        double first = 0;
        double last = 0;
        double[] arr = new double[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1.4;
            if (i == 0) {
                first = arr[i];
            }
            if (i == (arr.length - 1)){
                last = arr[i];
            }
        }
        System.out.println(first);
        System.out.println(last);
    }
}
