package com.customertimes.lection5.task4.packageA;
import com.customertimes.lection5.task4.packageB.Class3;

public class Class2 {
    public Class2 () {
        Class3 c = new Class3();
        System.out.println(c.field1 + " Filed 1 from the public class");
        System.out.println(c.field2 + " Field 2 from the public class");
    }
}
