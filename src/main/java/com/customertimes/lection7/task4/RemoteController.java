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
    TVDevice tvDevice;

    //empty constructor, to declare RemoteController before conectDevice method call
    public RemoteController() {

    }


    public RemoteController(TVDevice yourTvDevice) {
        this.tvDevice = yourTvDevice;
    }

    public void connectDevice(TVDevice yourTvDevice) {

    }

    @Override
    public void powerOn() {
        if (this.tvDevice.getModelName() == null) {
            System.out.println("Power On Method Remote Controller Implementation");
            System.out.println("Please, connect any TV device to this Remote Controller, use connectDevice(TVDevice) method");
        }

        if (this.tvDevice.isOn()) {
            System.out.println("hey! open your eyes, TV was ON already");
        } else {
            this.tvDevice.setOn(true);
            System.out.println("TV ON successfully");
        }
        System.out.println();
    }

    @Override
    public void powerOff() {
        if (this.tvDevice.isOn()) {
            this.tvDevice.setOn(false);
            System.out.println("Допобачення телебачення, TV OFF successfully, using Remote Controller ");
        } else {
            System.out.println("hey! open your eyes, TV was OFF already");
        }
        System.out.println();
    }

    @Override
    public void setChannel(int channel) {

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
