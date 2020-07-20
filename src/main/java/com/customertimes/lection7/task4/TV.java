package com.customertimes.lection7.task4;

public class TV extends TVDevice {

    private int currentChanel;

    public TV(String modelName, boolean isOn) {
        super(modelName, isOn);
    }


    @Override
    public void powerOn() {
        if (isOn()) {
            this.setOn(true);
            System.out.println("hey! open your eyes, TV was ON already");
        } else {
            System.out.println("TV ON successfully");
        }
        System.out.println();
    }

    @Override
    public void powerOff() {
        if (isOn()) {
            this.setOn(false);
            System.out.println("Допобачення телебачення, TV OFF successfully");
        } else {
            System.out.println("hey! open your eyes, TV was OFF already");
        }
        System.out.println();
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Channel changed to: ");


    }

    @Override
    public void currentChannel() {
        System.out.println("Your current channel is: " + currentChanel);
    }

    @Override
    public void upVolume() {

    }

    @Override
    public void downVolume() {

    }

    @Override
    public void mute() {

    }
}
