package com.customertimes.lection7.task4;

/*
Create a class "RemoteController" which will be simulation the real one to control the TV.+
Create interfaces Device and Volume. +
The "Device" interface should have methods powerOn(), powerOff(), setChannel(int channel), and currentChannel(); +
The "Volume" interface should have methods "upVolume(), downVolume() and mute(); +
Write an abstract class TVDevice which will be implementing interfaces Volume and Device +
and has the fields String modelName and boolean isOn (Tip: You don't need to implement methods from the interface if you class is abstract). +
Write a class "TV" which extends the class TVDevice. Implements all the methods.
Write a class RemoteController to control your TV.
Example of the structure in the attachments.
 */
public class RemoteController implements Volume, Device {
    private TVDevice tvDevice;

    //empty constructor, to declare RemoteController before connectDevice method call
    public RemoteController() {

    }


    public RemoteController(TVDevice yourTvDevice) {
        this.tvDevice = yourTvDevice;
    }

    public void connectDevice(TVDevice yourTvDevice) {
        System.out.println();
        if (yourTvDevice.equals(this.tvDevice)) {
            System.out.println(tvDevice.getModelName() + " device already connected, connect another one please");
        } else {
            if (this.tvDevice == null) {
                this.tvDevice = yourTvDevice;
                System.out.println(this.tvDevice.getModelName() + " device Connected");
            } else {
                System.out.print(this.tvDevice.getModelName() + " device disconnected and new one connected - ");
                this.tvDevice = yourTvDevice;
                System.out.println(this.tvDevice.getModelName() + " new device Connected");

            }
        }
    }

    private boolean checkIfDeviceConnected() {
        if (tvDevice != null) {
            return true;
        } else {
            System.out.println("Error, no devices connected Please, connect TV device to the Remote Controller");
            return false;
        }
    }

    @Override
    public void powerOn() {
        System.out.println();
        if (checkIfDeviceConnected()) {
            System.out.print("Remote Controller Power On method:");
            /*if (this.tvDevice.isOn()) {
                System.out.println("hey! open your eyes, TV was ON already");
            } else {
                this.tvDevice.setOn(true);
                System.out.println("TV ON successfully");
            }*/
            tvDevice.powerOn();
        }
    }

    @Override
    public void powerOff() {
        System.out.println();
        if (checkIfDeviceConnected()) {
            tvDevice.powerOff();
        }
    }

    @Override
    public void setChannel(int channel) {
        System.out.println();
        System.out.print("Remote Controller setChannel method:");
        if (checkIfDeviceConnected()) {
            tvDevice.setChannel(channel);
        }

    }

    @Override
    public void currentChannel() {

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
