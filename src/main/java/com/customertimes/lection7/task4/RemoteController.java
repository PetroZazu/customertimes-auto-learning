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

    public RemoteController() {

    }


    public RemoteController(TVDevice yourTvDevice) {
        this.tvDevice = yourTvDevice;
        System.out.println(tvDevice.getModelName() + "Connected automatically");
    }

    public void connectDevice(TVDevice yourTvDevice) {
        System.out.println();
        System.out.println("Remote Controller connectDevice method:");
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

    public void disconnectDevice() {
        System.out.println();
        System.out.print("Remote Controller 'disconnectDevice' method:");
        if (this.tvDevice == null) {
            System.out.println("There was no devices to disconnect, please connect one to perform action");
        } else {
            System.out.println(this.tvDevice.getModelName() + " device disconnected successfully");
            this.tvDevice = null;
        }
    }

    private boolean checkIfDeviceConnected() {
        System.out.println();
        if (tvDevice != null) {
            return true;
        } else {
            System.out.println("Remote Controller 'checkIfDeviceConnected' method:");
            System.out.println("No devices connected, please connect TV device to the Remote Controller");
            return false;
        }
    }

    @Override
    public void powerOn() {
        System.out.println();
        System.out.print("Remote Controller 'powerOn' method:");
        if (checkIfDeviceConnected()) {
            tvDevice.powerOn();
        }
    }

    @Override
    public void powerOff() {
        System.out.println();
        System.out.print("Remote Controller 'powerOff' method:");
        if (checkIfDeviceConnected()) {
            tvDevice.powerOff();
        }
    }

    @Override
    public void setChannel(int channel) {
        System.out.println();
        System.out.print("Remote Controller 'setChannel' method:");
        if (checkIfDeviceConnected()) {
            tvDevice.setChannel(channel);
        }

    }

    @Override
    public void currentChannel() {
        System.out.println();
        System.out.print("Remote Controller 'currentChannel' method:");
        if (checkIfDeviceConnected()) {
            tvDevice.currentChannel();
        }

    }

    @Override
    public void upVolume() {
        System.out.println();
        System.out.print("Remote Controller 'upVolume' method:");
        if (checkIfDeviceConnected()) {
            tvDevice.upVolume();
        }
    }

    @Override
    public void downVolume() {
        System.out.println();
        System.out.print("Remote Controller 'downVolume' method:");
        if (checkIfDeviceConnected()) {
            tvDevice.downVolume();
        }

    }

    @Override
    public void mute() {
        System.out.println();
        System.out.print("Remote Controller 'mute' method:");
        if (checkIfDeviceConnected()) {
            tvDevice.mute();
        }

    }
}
