package com.customertimes.lection4.homework.task1;

/*
1. Create a class "Human". A human should have the following attributes: weight, age, first name, last name, height.
Requirements:
a) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
b) Add to the class a constructor with parameters which initialize all the fields.
 */
public class Human {
    double weight;
    int age;
    String firstName;
    String lastName;
    double height;

    public Human(double hisWeight, int hisAge, String hisFirstName, String hisLastName, double hisHeight) {
        weight = hisWeight;
        age = hisAge;
        firstName = hisFirstName;
        lastName = hisLastName;
        height = hisHeight;
    }
}
