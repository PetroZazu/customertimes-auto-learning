package com.customertimes.lection8.task7;

import java.util.HashSet;
import java.util.Set;

/*
In the Example class,
implement a couple of equals / hashCode methods in accordance with the rules for implementing these methods
(check details with your favorite search engine).
Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.

public class Example {
    private final String first, last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example(""""Donald"""", """"Duck""""));
        System.out.println(s.contains(new Example(""""Donald"""", """"Duck"""")));
    }
}"
 */
public class Main {
    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));

        Example e1 = new Example("TTrs", "Audi");
        Example e2 = new Example("Audi", "TTrs");
        System.out.println("Object 1 equals object 2?: " + e1.equals(e2));
        System.out.println("e1" + " hash code is: " + e1.hashCode());
        System.out.println("e2" + " hash code is: " + e2.hashCode());
        System.out.println("Object 1 and 2 hash code is equals?: " + (e1.hashCode() == e2.hashCode()));
    }
}