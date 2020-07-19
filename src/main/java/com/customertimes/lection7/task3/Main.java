package com.customertimes.lection7.task3;

public class Main {
    public static void main(String[] args) {
        MyDevice babushkineRadio = new MyDevice();
        babushkineRadio.on();
        babushkineRadio.changeVolume(99);
        babushkineRadio.changeVolume(-99);
        babushkineRadio.changeVolume(101);
        babushkineRadio.changeVolume(27);
        babushkineRadio.off();
    }

}

