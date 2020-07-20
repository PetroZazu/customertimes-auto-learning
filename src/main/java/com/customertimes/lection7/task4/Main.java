package com.customertimes.lection7.task4;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV("Abrakadabra", false);
        RemoteController rc = new RemoteController();
        rc.connectDevice(tv);

        tv.currentChannel();
        tv.setChannel(33);
        tv.powerOn();
        tv.setChannel(33);

    }
}
