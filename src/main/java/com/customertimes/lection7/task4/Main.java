package com.customertimes.lection7.task4;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV("Abrakadabra", false);
        TV tv2 = new TV("Dendy", false);

        RemoteController rc = new RemoteController();
        RemoteController rc2 = new RemoteController(tv);

         /*first connect for the Abrakadabra device, expected output:
         'Abrakadabra device Connected'*/
        rc.connectDevice(tv);

        /*Second connect for the Abrakadabra device, expected output:
         'Abrakadabra device already connected, connect another one please'*/
        rc.connectDevice(tv);

        /*first connect for the Dendy device, expected output:
         'Abrakadabra device disconnected and new one connected - Dendy new device Connected'*/
        rc.connectDevice(tv2);

        /*Connect again Abrakadabra device, expected output:
        'Dendy device disconnected and new one connected - Abrakadabra new device Connected'*/
        rc.connectDevice(tv);

        /*TurnOn Abrakadabra device, expected output:
        'TV ON successfully'*/
        rc.powerOn();

        /*TurnOn again Abrakadabra device, expected output:
        'hey! open your eyes, TV was ON already'*/
        rc.powerOn();

        /*TurnOn Abrakadabra device, expected output:
        'TV OFF successfully*/
        rc.powerOff();

        /*TurnOff Abrakadabra device, expected output:
        'hey! open your eyes, TV was OFF already'*/
        rc.powerOff();

        /*Try to perform some action when TV is OFF, expected output:
        'downVolume action can't be performed, TV is OFF'*/
        rc.mute();

        //let's turn on TV again
        rc.powerOn();

        /* Here we will set channel and also try to set out of boundary value */
        rc.setChannel(234);
        rc.currentChannel();
        rc.setChannel(1001);
        rc.currentChannel();


        /* Lets Up And Down volume:*/
        rc.upVolume();
        rc.upVolume();
        rc.downVolume();
        rc.downVolume();
        rc.downVolume();
        rc.upVolume();
        rc.upVolume();
        rc.mute();
        rc.downVolume();

        // and disconnect device
        rc.disconnectDevice();

        System.out.println();
        /* Also we can control out TV without Remote Controller: */

        tv2.powerOn();
        tv2.setChannel(27);
        tv2.powerOff();
        tv2.upVolume();


    }


}
