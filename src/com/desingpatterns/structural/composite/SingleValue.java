package com.desingpatterns.structural.composite;

import java.util.Arrays;
import java.util.Iterator;

public class SingleValue implements ValueContainer{
    public int value;
    public SingleValue(int value)
    {
        this.value = value;
    }

    @Override
    public Iterator<Integer> iterator() {
        return Arrays.asList(value).iterator();
    }
}
