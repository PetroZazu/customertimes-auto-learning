package com.customertimes.lection5.task6;

public class FactoryMethod {
    public double maxValue;
    public double minValue;

    // Private constructor
    private FactoryMethod(double maxValue, double minValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    // Static method to call private constructor but verify values before call
    public static FactoryMethod makeFactory(double maxValue, double minValue) {
        if (maxValue <= 0 || minValue <= 0) {
            System.out.println("max value and min value should be > 0");
            return null;
        }
        System.out.println("Max Value is " + maxValue);
        System.out.println("Min Value is " + minValue);
        return new FactoryMethod(maxValue, minValue);

    }
}
