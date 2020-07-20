package com.customertimes.lection7.task2rework;

public class Main {
    public static void main(String[] args) {
        FahrenheitConverter fc = new FahrenheitConverter();
        KelvinConverter kc = new KelvinConverter();
        fc.convert(30);
        kc.convert(30);
    }
}
