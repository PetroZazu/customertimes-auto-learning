package com.customertimes.lection4.homework.ExperimentalTask;

import java.util.ArrayList;
import java.util.Collections;

public class CarObject {
    static ArrayList<Integer> horseColector = new ArrayList();
    public String carModel;
    public int kBtPower;
    private int HP;

  /*  public CarObject(String carModel, int kBtPower) {
        this.carModel = carModel;
       this.kBtPower = kBtPower;
    }*/

    {
        System.out.println("inside the block");
        HP = kBtPower * 10;
        System.out.println(HP);
        horseColector.add(HP);

    }

    public void addHPList () {
        HP = kBtPower * 10;
        horseColector.add(HP);
    }


    public void getTheMostHPcar() {
        double max = Collections.max(horseColector);
        if (max == this.HP) {
            System.out.println("this car " + carModel + " is the most top!!!!");
        } else {
            System.out.println("Sorry, but your car is not the top, go to the garage and make some tuning))))"); ;
        }
    }
}
