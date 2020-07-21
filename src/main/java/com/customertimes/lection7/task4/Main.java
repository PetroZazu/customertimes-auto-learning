package com.customertimes.lection7.task4;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV("Abrakadabra", false);
        TV tv2 = new TV("Dendy", true);

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
        rc.setChannel(234);
        rc.powerOn();
        rc.powerOn();
        rc.setChannel(234);

        tv.currentChannel();
        tv.setChannel(33);
        tv.powerOn();
        tv.setChannel(33);

        rc2.currentChannel();
        rc2.setChannel(1);
        tv.currentChannel();
        rc2.disconnectDevice();
        rc2.currentChannel();


    }
}
