package com.customertimes.lection5.task1and2.testAandB;

public class Test {
    public static void main(String[] args) {
        // RIGHT convention of creating two objects of the classes that have the sane names:
        com.customertimes.lection5.task1and2.package1.ClassA firstClas = new com.customertimes.lection5.task1and2.package1.ClassA();
        com.customertimes.lection5.task1and2.package2.ClassA secondClas = new com.customertimes.lection5.task1and2.package2.ClassA();

        // WRONG convention of creating two objects of the classes that have the sane names:
        /*ClassA classa1 = new ClassA();
        ClassA classa2 = new ClassA();*/
        // Error cause JAVA compiler doesn't understand which ClassA need to have for object initialization.
    }


}
