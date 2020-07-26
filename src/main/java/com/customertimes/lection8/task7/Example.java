package com.customertimes.lection8.task7;

public class Example {
    private final String first, last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        Example myExample = (Example) o;
        return this.first == myExample.first && this.last == myExample.last;
    }

    @Override
    public int hashCode() {
        return 6 * first.hashCode() + 6 * last.hashCode();
    }
}
