package com.customertimes.lection6.task4;

//Create a class B that extends class A
public class ClassB_Laptop extends ClassA_Computer {

    //Demonstrate in you program how class's B constructor should call class's A constructor to create a new object.
    public ClassB_Laptop(boolean isMouseConnected, int hardDiscFreeSpace) {
        super(isMouseConnected, hardDiscFreeSpace);
    }


    @Override //Override one method of the class A to fully change it's behavior
    public void turnOn() {
        System.out.println("Laptop cap opened, computer turned ON");
    }

    @Override //Override another method to add some extra functionality to it, but it should then call class's A method.
    public void leftClick() {
        if (this.isMouseConnected()) {
            super.leftClick();
        } else {
            System.out.println("TouchPad has been used to left click");
        }
    }
}
