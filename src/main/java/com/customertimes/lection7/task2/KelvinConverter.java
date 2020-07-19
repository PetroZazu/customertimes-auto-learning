package com.customertimes.lection7.task2;

public class KelvinConverter implements Converter {
    @Override
    public void convert(double kelvin) {
        double kelToFahr = ((kelvin - 273.15) * 9 / 5 + 32);
        double kelToCel = (kelvin - 273.15);
        System.out.println(kelvin + "°K converted to Fahrenheit = " + Math.round(kelToFahr * 100.0) / 100.0 + "℉");
        System.out.println(kelvin + "°K converted to Celsius = " + Math.round(kelToCel * 100.0) / 100.0 + "℃");
    }
}
