package com.customertimes.lection6.task1example2;

public class Charger {
    public void startOrCharge(double chargedPercents) {
        if (chargedPercents < 10) {
            System.out.println("Wait till car will be charged to more that 10%");
        } else {
            System.out.println("Electric vehicle is turned ON and ready to start!");
        }
    }
}
