package com.customertimes.lection7.task2rework;

import com.customertimes.lection7.task2.Converter;

public class FahrenheitConverter implements Converter {
    @Override
    public void convert(double celsius) {
        double celToFahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C converted to Fahrenheit = " + Math.round(celToFahrenheit * 100.0) / 100.0 + "℉");
    }
}
