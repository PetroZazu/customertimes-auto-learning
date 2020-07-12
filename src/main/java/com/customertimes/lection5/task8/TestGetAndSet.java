package com.customertimes.lection5.task8;

public class TestGetAndSet {
    public static void main(String[] args) {
        Getandset getset = new Getandset();
        getset.setValue1(27);
        getset.setValue2(true);
        getset.setValue3(27.4);
        getset.setValue4("StringValue4");
        getset.setValue5("StringValue5");

        System.out.println("Value1= " + getset.getValue1());
        System.out.println("Value2= " + getset.isValue2());
        System.out.println("Value3= " + getset.getValue3());
        System.out.println("Value4= " + getset.getValue4());
        System.out.println("Value5= " + getset.getValue5());

    }
}
