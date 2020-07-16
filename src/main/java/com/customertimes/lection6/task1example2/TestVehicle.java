package com.customertimes.lection6.task1example2;

public class TestVehicle {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Nissan Leaf", 9);
        ev.startEngine();
        ev.showBatteryLevel();
        ev.chargeVehicle();
    }
}
