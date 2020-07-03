package com.customertimes.lection4.homework.task9Recursion;

public class Test {
    public static void main(String[] args) {
        SumOfArifmetPgog arf = new SumOfArifmetPgog();
        System.out.println("Method 1: " + arf.arifProg(5,20,6));
        System.out.println("Method 2: " + SumOfArifmetPgog.arifProgV2(5, 15, 6));
    }
}
// 5 + 20 + 35 + 50 + 65 + 80 = 255 (6 цифр ---> (n))