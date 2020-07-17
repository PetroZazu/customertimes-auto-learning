package com.customertimes.lection6.task4;

public class Main {
    public static void main(String[] args) {
        ClassA_Computer Pc1 = new ClassA_Computer (true, 1256);
        ClassB_Laptop Laptop1 = new ClassB_Laptop (false, 256);
        Pc1.turnOn();
        Pc1.leftClick();
        Pc1.makeBurnTheHardDisk();
        Laptop1.turnOn();
        Laptop1.leftClick();
        Laptop1.makeBurnTheHardDisk();
    }
}
