package com.customertimes.lection4.homework.task5ConstructorInConstructor;

public class Bicycle {
    String brand;
    String type;
    int wheelSize;
    int maxSpeed;
    int numberOfGears;
    int price;

    public Bicycle(String type, int price) {
        this.type = type;
        this.price = price;
    }


    public Bicycle(String type, int price, String brand, int wheelSize) {
        this(type,price);
        this.brand = brand;
        this.wheelSize = wheelSize;

    }

    public Bicycle (String type, int price, String brand, int wheelSize, int maxSpeed, int numberOfGears) {
        this(type, price, brand, wheelSize);
        this.maxSpeed = maxSpeed;
        this.numberOfGears = numberOfGears;

    }
}
