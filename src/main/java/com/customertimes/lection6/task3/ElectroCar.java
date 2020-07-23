package com.customertimes.lection6.task3;

public class ElectroCar extends Car {
    private int batteryLevel;


    public ElectroCar(String name, String size, String typeOfTheCar, int batteryLevel) {
        super(name, size, typeOfTheCar);
        this.batteryLevel = batteryLevel;
        if (this.batteryLevel > 100 || this.batteryLevel < 0) {
            System.out.println(" ERROR in the car:" + getName() + " - battery level should be entered in range from 0 to 100");
            System.exit(1);
        }

    }



    @Override
    public void move(int velocity, int direction) {
        if (this.batteryLevel >= 10) {
            super.move(velocity, direction);
            batteryLevel = batteryLevel - 10;
        } else {
            System.out.println("not enough battery to move, please perform stopToFullCharge() method to charge the car");
        }
    }

    @Override
    public void stop() {
        super.stop();
        batteryLevel++;
        System.out.println(this.getName() + " Car stopped and has been charged little bit :)");
    }

    public void showBatteryLevel() {
        System.out.println("Your battery level is: " + this.batteryLevel);
    }

    public void stopToFullCharge() {
        batteryLevel = 100;
        System.out.println("car stopped to charge and now is fully charged");
        showBatteryLevel();
    }




}
