package com.customertimes.lection8.task1;

public class NumberNullException extends Exception {

    @Override
    public String toString () {
        return "NumberNullException" + " 0 value is forbidden";
    }
}
