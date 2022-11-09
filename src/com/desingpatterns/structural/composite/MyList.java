package com.desingpatterns.structural.composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyList extends ArrayList<ValueContainer> {
    public MyList(Collection<? extends ValueContainer> c) {
        super(c);
    }

    public int sum() {
        int total = 0;
        Iterator<ValueContainer> valueContainerIterator = this.iterator();
        while (valueContainerIterator.hasNext()){
            Iterator<Integer> integerIterator = valueContainerIterator.next().iterator();
            while (integerIterator.hasNext()){
                total += integerIterator.next().intValue();
            }
        }
        return total;
    }
}
