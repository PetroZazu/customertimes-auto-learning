package com.customertimes.lection6.task1example1;

public class RocketSpeedAndDestination_B {

    // поля класу
    private int rocketAverageSpeed; // km per hour
    private String rocketDestination;

    //гет + сет
    public int getRocketAverageSpeed() {
        return rocketAverageSpeed;
    }

    public String getRocketDestination() {
        return rocketDestination;
    }

    public void setRocketAverageSpeed(int rocketAverageSpeed) {
        this.rocketAverageSpeed = rocketAverageSpeed;
    }

    public void setRocketDestination(String rocketDestination) {
        this.rocketDestination = rocketDestination;
    }

    // метод яким визначаємо оряєнтовний час політу до планети
    int rocketFlyToDestinationHours() {
        if (rocketDestination.equals("Mars")) {
            return (110000000 / rocketAverageSpeed) / 24;
        }

        if (rocketDestination.equals("Moon")) {
            return (384000 / rocketAverageSpeed) / 24;
        } else {

            return 0;
        }

    }


}
