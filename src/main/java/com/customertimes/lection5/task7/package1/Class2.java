package com.customertimes.lection5.task7.package1;

public class Class2 {
    public Class2() {
        Class1 class1 = new Class1();
        System.out.println("Public member: " + class1.public_m1); // Accessed
        System.out.println("Package Private member: " + class1.packagePrivate_m2); // Accessed cause in the same Package
        //System.out.println("Private member: " + class1.private_m3); // Can not be accessed cause not in the same Class
        System.out.println("Protected member: " + class1.protected_m4); // Accessed cause in the same Package
    }
}
