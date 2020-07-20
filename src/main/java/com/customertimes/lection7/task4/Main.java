package com.customertimes.lection7.task4;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV("Abrakadabra", false);
        TV tv2 = new TV("Dendy", true);

        RemoteController rc = new RemoteController();


        rc.connectDevice(tv);
        rc.connectDevice(tv);
        rc.connectDevice(tv2);
        rc.connectDevice(tv);
        rc.setChannel(234);
        rc.powerOn();
        rc.powerOn();
        rc.setChannel(234);

        tv.currentChannel();
        tv.setChannel(33);
        tv.powerOn();
        tv.setChannel(33);

    }
}
