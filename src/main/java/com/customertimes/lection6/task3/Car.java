package com.customertimes.lection6.task3;

public class Car extends Vehicle {
    private String typeOfTheCar;

    public Car(String name, String size, String typeOfTheCar) {
        super(name, size);
        this.typeOfTheCar = typeOfTheCar;
    }

    public void printCarTypeNameSize () {
        System.out.println("Car type is: " + this.typeOfTheCar);
        System.out.println("Car size is: " + this.getSize());
        System.out.println("Car name is: " + this.getName());
    }

    public String getTypeOfTheCar() {
        return typeOfTheCar;
    }

    public void setTypeOfTheCar(String typeOfTheCar) {
        this.typeOfTheCar = typeOfTheCar;
    }



}

