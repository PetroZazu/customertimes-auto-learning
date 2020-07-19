package com.customertimes.lection7.task2;

public class Main {
    public static void main(String[] args) {
        FahrenheitConverter fc = new FahrenheitConverter();
        KelvinConverter kc = new KelvinConverter();
        fc.convert(8);
        System.out.println();
        kc.convert(256);
    }
}
