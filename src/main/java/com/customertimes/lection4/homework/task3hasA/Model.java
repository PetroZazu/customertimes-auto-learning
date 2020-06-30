package com.customertimes.lection4.homework.task3hasA;

public class Model {
    String model;
    int year;
    int dorsCount;
    int price;

    public Model (String carModelName, int yearOfTheCar, int numberOfTheDors, int priceInDolarsUSA) {
        this.model = carModelName;
        this.year = yearOfTheCar;
        this.dorsCount = numberOfTheDors;
        this.price = priceInDolarsUSA;
    }
}
