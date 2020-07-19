package com.customertimes.lection7.task3;

public class MyDevice implements State, Volume {
    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void on() {
        System.out.println("device is ON");
        System.out.println();
    }

    @Override
    public void off() {
        System.out.println("device is OFF");
        System.out.println();
    }

    @Override
    public void changeVolume(double value) {
        if ((volume + value) > 100 || (volume + value) < 0) {
            System.out.println("Your new value is going through device volume boundary, device volume boundary is from 0 to 100");
            System.out.println("Current device volume is: " + volume);
            System.out.println();
            return;
        }

        if (value >= 0) {
            volume = value + volume;
            System.out.println("volume increased by " + value + " points");
            System.out.println("new volume is: " + volume);
            System.out.println();
        }

        if (value < 0) {
            volume = value + volume;
            System.out.println("volume decreased by " + value + " points");
            System.out.println("new volume is: " + volume);
            System.out.println();
        }
    }
}
