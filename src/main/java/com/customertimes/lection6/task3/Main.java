package com.customertimes.lection6.task3;

public class Main {
    public static void main(String[] args) {
        ElectroCar nissanLeaf = new ElectroCar("Nissan Leaf", "Sedan", "ElectroCar", 20);
        nissanLeaf.printCarTypeNameSize();
        nissanLeaf.showBatteryLevel();
        nissanLeaf.move(100, 40);
        nissanLeaf.showBatteryLevel();
        nissanLeaf.stop();
        nissanLeaf.showBatteryLevel();
        nissanLeaf.steer(10);
        nissanLeaf.stopToFullCharge();

    }
}
