package com.customertimes.lection5.task3.packageA;

/*Default or Package private access is type of access level when member of the
class can only be accessed within its own package*/

public class Class2 {
     String hello; // - String field with Package Private access
     int bro; // - Int field with Package Private access
    

    Class2(String hello, int bro) {
        this.hello = hello;
        this.bro = bro;
    }
}
