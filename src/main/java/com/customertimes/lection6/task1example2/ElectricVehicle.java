package com.customertimes.lection6.task1example2;

public class ElectricVehicle {
        Batery battery = new Batery();
        Charger charger = new Charger();

        private String vehicleModelName;
        private double chargedPercents;

        public ElectricVehicle (String vehicleModelName, double chargedPercents) {
                this.vehicleModelName = vehicleModelName;
                this.chargedPercents = chargedPercents;
        }

        public void startTheElectroCar () {
                System.out.println("Your " + vehicleModelName + "Charge is:" );
                battery.showBatteryLevel(this.chargedPercents);
                charger.startOrCharge(this.chargedPercents);

        }

        }
