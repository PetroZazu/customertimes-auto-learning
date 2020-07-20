package com.customertimes.lection7.task2;

import com.customertimes.lection7.task2rework.FahrenheitConverter;
import com.customertimes.lection7.task2rework.KelvinConverter;

/*
Create a new interface "Converter". +
This interface should have one method "convert(double celsius)". +
Provide several implementations of the "Converter" interface +
like "KelvinConverter" and "FahrenheitConverter" +
which convert celsius degrees to kelvins or fahrenheits accordingly. +
 */
public class Main {
    public static void main(String[] args) {
        FahrenheitConverter fc = new FahrenheitConverter();
        KelvinConverter kc = new KelvinConverter();
        fc.convert(8);
        System.out.println();
        kc.convert(256);
    }
}
