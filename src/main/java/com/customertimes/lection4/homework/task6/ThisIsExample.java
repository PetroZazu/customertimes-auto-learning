package com.customertimes.lection4.homework.task6;

public class ThisIsExample {
    String field1;
    int field2;
    int field3 = 30;

    public ThisIsExample(String field1, int TheParametr2, int field3) {
        field1 = field1; // allways equal null
        field2 = TheParametr2; // no need this.
        this.field3 = field3; // this. give variable from paramtr to the field 3
    }

    public void printVariables() {
        System.out.println(field1);
        System.out.println(field2);
        System.out.println(field3);
    }
        public static void main(String[]args){
            ThisIsExample example = new ThisIsExample("skr", 1, 2);
            example.printVariables();
        }
    }

