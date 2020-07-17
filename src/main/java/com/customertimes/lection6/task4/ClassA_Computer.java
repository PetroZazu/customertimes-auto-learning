package com.customertimes.lection6.task4;

/*
Create a class A. - done
Add several fields - done
two methods and parameterized constructors to it.+
Create a class B that extends class A. +
Demonstrate in you program how class's B constructor should call class's A constructor to create a new object. +
Override one method of the class A to fully change it's behavior. +
Override another method to add some extra functionality to it, but it should then call class's A method. +
Create a test class and create several objects of class A and class B and call their methods."
 */
public class ClassA_Computer {
    private int hardDiscFreeSpace;
    private boolean isMouseConnected;

    public ClassA_Computer(boolean isMouseConnected, int hardDiscFreeSpace) {
        this.isMouseConnected = isMouseConnected;
        this.hardDiscFreeSpace = hardDiscFreeSpace;
    }

    public boolean isMouseConnected() {
        return isMouseConnected;
    }

    // three methods and parameterized constructors to it.
    public void turnOn() {
        System.out.println("Computer turned on");
    }

    public void leftClick() {
        if (isMouseConnected) {
            System.out.println("left click performed with mouse device");
        } else {
            System.out.println("No mouse device connected to perform left click");
        }
    }

    public void makeBurnTheHardDisk() {
        hardDiscFreeSpace = 0;
    }


}


