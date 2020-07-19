package com.customertimes.lection7.task2;

import java.text.DecimalFormat;

public class FahrenheitConverter implements Converter {
    @Override
    public void convert(double fahrenheit) {
        double fahrToCel = ((fahrenheit - 32) * 5 / 9);
        double fahrToKel = ((fahrenheit - 32) * 5 / 9 + 273.15);


        System.out.println(fahrenheit + "℉ converted to Celsius = " + Math.round(fahrToCel * 100.0) / 100.0 + "℃");
        System.out.println(fahrenheit + "℉ converted to Kelvin = " + Math.round(fahrToKel * 100.0) / 100.0 + "°K");
    }
}
