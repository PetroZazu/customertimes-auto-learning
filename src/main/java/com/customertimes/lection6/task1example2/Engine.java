package com.customertimes.lection6.task1example2;

public class Engine {
    public void startEngine(double chargedPercents) {
        if (chargedPercents > 10) {
            System.out.println(" Engine turned ON and Car is ready to go");
        } else {
            System.out.println(" Batter level is less than 10%, need charge to start");
        }
    }
}
