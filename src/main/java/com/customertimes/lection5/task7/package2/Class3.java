package com.customertimes.lection5.task7.package2;

import com.customertimes.lection5.task7.package1.Class1;

public class Class3 extends Class1 {

    public Class3() {
        System.out.println("Public member: " + public_m1); // Accessed
        //System.out.println("Package Private member: " + packagePrivate_m2); // Can not be accessed cause not in the same Package
        //System.out.println("Private member: " + private_m3); // Can not be accessed cause not in the same Class
        System.out.println("Protected member: " + protected_m4); // Accessed cause in the same Package
    }
}
