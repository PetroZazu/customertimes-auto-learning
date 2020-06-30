package com.customertimes.lection4.homework.task2;

/*
2. Implement the method fight() depending on weight, strength and age of the boxer:
You should write dependency by yourself. The method should return true or false if our boxer won or lost.

Requirements:
a) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;
 */
public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        if ((anotherBoxer.age + anotherBoxer.strength + anotherBoxer.weight) == (age + weight + strength)) {
            System.out.println("there is no stronger boxer! the same power");
            return true;
        }

        if ((anotherBoxer.age + anotherBoxer.strength + anotherBoxer.weight) > (age + weight + strength)) {
            System.out.println("win Boxer 2");
            return true;
        } else {
            System.out.println("win Boxer 1");
            return false;
        }
    }

    public static void main(String[] args) {
        Boxer Boxer1 = new Boxer(20, 81, 72);
        Boxer Boxer2 = new Boxer(20, 82, 72);
        Boxer1.fight(Boxer2);
    }
}
