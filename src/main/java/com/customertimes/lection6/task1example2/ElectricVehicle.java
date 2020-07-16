package com.customertimes.lection6.task1example2;

public class ElectricVehicle {
    Batery battery = new Batery();
    Charger charger = new Charger();
    Engine engine = new Engine();

    private String vehicleModelName;
    private double chargedPercents;

    public ElectricVehicle(String vehicleModelName, double chargedPercents) {
        this.vehicleModelName = vehicleModelName;
        this.chargedPercents = chargedPercents;
    }

    public void showBatteryLevel() {
        System.out.print("Your " + vehicleModelName + " battery level is: ");
        battery.showBatteryLevel(this.chargedPercents);
    }

    public void startEngine() {
        System.out.print(vehicleModelName);
        engine.startEngine(this.chargedPercents);
    }

    public void chargeVehicle() {
        System.out.print(vehicleModelName);
        charger.StartCharge(this.chargedPercents);
    }

}
