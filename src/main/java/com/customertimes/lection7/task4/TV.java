package com.customertimes.lection7.task4;

public class TV extends TVDevice {

    private int currentChanel;
    private int volumeLevel;

    public TV(String modelName, boolean isOn) {
        super(modelName, isOn);
    }

    // Getters and Setters for two private fields related to TV device
    public int getCurrentChanel() {
        return currentChanel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setCurrentChanel(int currentChanel) {
        this.currentChanel = currentChanel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    @Override
    public void currentChannel() {
        System.out.println("Your current channel is: " + currentChanel);
        System.out.println();
    }

    @Override
    public void powerOn() {
        if (isOn()) {
            System.out.println("hey! open your eyes, TV was ON already");
        } else {
            this.setOn(true);
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
        if (!isOn()) {
            System.out.println("setChannel action can't be performed, TV is OFF");
            System.out.println();
            return;
        }
        if (channel >= 0 && channel <= 1000) {
            System.out.println("Channel changed to: " + channel);
            currentChanel = channel;
        } else {
            System.out.println("Invalid channel entered, please choose channel from 0 to 1000 ");
        }
        System.out.println();
    }

    @Override
    public void upVolume() {
        if (!isOn()) {
            System.out.println("upVolume action can't be performed, TV is OFF");
            System.out.println();
            return;
        }
        if (volumeLevel >= 0 && volumeLevel <= 0) {
            volumeLevel++;
            System.out.println("Volume level increased successfully by 1 point");
        } else {
            System.out.println("Воу-воу! патіше!!! бабульку сусідку розбудиш!!");
            System.out.println("You are already reached maximum volume level");
        }
        System.out.println("Current volume level is: " + volumeLevel);
        System.out.println();
    }

    @Override
    public void downVolume() {
        if (!isOn()) {
            System.out.println("downVolume action can't be performed, TV is OFF");
            System.out.println();
            return;
        }
        if (volumeLevel >= 1 && volumeLevel <= 100) {
            volumeLevel--;
            System.out.println("Volume level decreased successfully by 1 point");
        } else {
            System.out.println("You are already reached minimum volume level");
        }
        System.out.println("Current volume level is: " + volumeLevel);
        System.out.println();
    }

    @Override
    public void mute() {
        if (!isOn()) {
            System.out.println("mute action can't be performed, TV is OFF");
            System.out.println();
            return;
        }
        volumeLevel = 0;
        System.out.println("TV sound muted successfully");
        System.out.println();
    }
}
