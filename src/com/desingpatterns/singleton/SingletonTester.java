package com.desingpatterns.singleton;

import java.util.function.Supplier;

public class SingletonTester {
    public static boolean isSingleton(Supplier<Object> func)  {
        Object obj1 = func.get();
        Object obj2 = func.get();
        return obj1.equals(obj2);
    }
}
