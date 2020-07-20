package com.customertimes.lection7.task2rework;

import com.customertimes.lection7.task2.Converter;

public class KelvinConverter implements Converter {
    @Override
    public void convert(double celsius) {
        System.out.println(celsius + "°C converted to Kelvin = " + (celsius + 273.15) + "°K");
    }
}
